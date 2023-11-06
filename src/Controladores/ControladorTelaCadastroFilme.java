/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.CadastroFilmeDAO;
import Modelos.CadastroFilme;
import Visoes.TelaCadastroFilme;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ControladorTelaCadastroFilme {

    private final TelaCadastroFilme visao;

    public ControladorTelaCadastroFilme(TelaCadastroFilme visao) {
        this.visao = visao;
    }
/**
 * retorna um objeto de cadastro filme
 * @return 
 */
    public CadastroFilme construirCadastro() {
        CadastroFilme cadastroFilme;

        String nome = visao.getjTextFieldNomeFilme().getText();
        String dataLacamento = visao.getjFormattedTextFieldDataLancamento().getText();
        String categoria = visao.getjTextFieldCategoria().getText();

        cadastroFilme = new CadastroFilme(nome, dataLacamento, categoria);

        return cadastroFilme;

    }
/**
 * usa os metodos da classe dao para inserir um cadastro filme no banco
 */
    public void inserirFilmeNoBanco() {

        Connection conexao = null;
        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        CadastroFilme cadastroFilme = this.construirCadastro();
        // JOptionPane.showMessageDialog(null, cadastroFilme.toString());
        cadastroFilmeDAO.inserirFilmeNoBanco(cadastroFilme);
    }
/**
 * limpa os campos do jframe
 */
    public void limparCampos() {
        visao.getjTextFieldNomeFilme().setText("");
        visao.getjFormattedTextFieldDataLancamento().setText("");
        visao.getjTextFieldCategoria().setText("");
    }
/**
 * mostr alista de filmes no banco
 */
    public void mostrarListaFilmesNaTela() {

        // cria a variavel para conexao
        java.sql.Connection conexao = null;
        //cria a conexao
        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        //usanso os metodo da classe DAO para realizar as operções no banco
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaTodosFilmes();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
/**
 * mostra a lista de filmes de ação no menu dinamico
 */
    public void mostraFilmesAcao() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesAcao();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
/**
 * mostra a lista de filmes de comedia no menu dinamico
 */
    public void mostraFilmesComedia() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesComedia();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
/**
 * mostra a lista de filmes de aventura no menu dinamico
 */
    public void mostraFilmesAventura() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesAventura();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
/**
 * mostra a lista de filmes de terror no menu dinamico
 */
    public void mostraFilmesTerror() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesTerror();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
    /**
     * mostra a lista de filmes de documentario no menu dinamico
     */
     public void mostraFilmesDocumentario() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesDocumentario();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
     /**
      * mostra a lista de filmes de ficção no menu dinamico
      */
      public void mostraFilmesFiccaoCientifica() {
        Connection conexao = null;

        CadastroFilmeDAO cadastroFilmeDAO = new CadastroFilmeDAO((java.sql.Connection) conexao);
        ArrayList<CadastroFilme> filmes = cadastroFilmeDAO.listaFilmesFiccaoCientifica();
        cadastroFilmeDAO.exibirListaFilmes(filmes);
    }
    
    

}
