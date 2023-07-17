/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.CadastroFilmeDAO;
import Modelos.CadastroFilme;
import Visoes.TelaCadastroFilme;
import com.sun.jdi.connect.spi.Connection;



/**
 *
 * @author Lenovo
 */
public class ControladorTelaCadastroFilme {
    private final TelaCadastroFilme visao;

    public ControladorTelaCadastroFilme(TelaCadastroFilme visao) {
        this.visao = visao;
    }
    
    public CadastroFilme construirCadastro(){
        CadastroFilme cadastroFilme;
        
        String nome = visao.getjTextFieldNomeFilme().getText();
        String dataLacamento = visao.getjFormattedTextFieldDataLancamento().getText();
        String categoria = visao.getjTextFieldCategoria().getText();
        
        cadastroFilme = new CadastroFilme(nome, dataLacamento, categoria);
        
        return cadastroFilme;
        
    }
    
    public void inserirFilmeNoBanco(){
        
        Connection conexao = null;
        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        CadastroFilme cadastroFilme = this.construirCadastro();
       // JOptionPane.showMessageDialog(null, cadastroFilme.toString());
        cadastroFilmeDAO.inserirFilmeNoBanco(cadastroFilme);
    }
    
    public void limparCampos(){
        visao.getjTextFieldNomeFilme().setText("");
        visao.getjFormattedTextFieldDataLancamento().setText("");
        visao.getjTextFieldCategoria().setText("");
    }
    
}
