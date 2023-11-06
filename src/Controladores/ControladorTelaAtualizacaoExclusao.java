/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.AtualizacaoExclusaoDAO;
import Modelos.CadastroFilme;
import Visoes.TelaAtualizacaoExclusao;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ControladorTelaAtualizacaoExclusao {
    /**
     * 
     */
    private final TelaAtualizacaoExclusao visao;

    /**
     *
     * @param visao é passado o jframe como parametro para construir o
     * controlador e ter acesso as variaveis do jframe pelo atributo visao.
     */
    public ControladorTelaAtualizacaoExclusao(TelaAtualizacaoExclusao visao) {
        this.visao = visao;
    }

    /*a classe dao é sempre instanciada no metodo para poder utilzar os metodos da classe dao para interagir com o banco de dados
     * exibe a lista de filmes na tabela
     */
    public void exibirListaFilmesNaTabela() {
        Connection conexao = null;
        AtualizacaoExclusaoDAO atualizacoExclusaoDAO = new AtualizacaoExclusaoDAO(conexao);

        ArrayList<CadastroFilme> filmes = atualizacoExclusaoDAO.listaTodosFilmes();
        JTable tabela = visao.getjTableTabelaFilmes();

        this.atualizarTabela(tabela, filmes);

    }

    /**
     * atualiza a tabela sempre que é chamado
     *a classe dao é sempre instanciada no metodo para poder utilzar os metodos da classe dao para interagir com o banco de dados
     * @param tabela recebe a tabela do jframe como parametro
     * @param filmes recebe o objeto filmes como parametro
     */
    public void atualizarTabela(JTable tabela, ArrayList<CadastroFilme> filmes) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        modeloTabela.setRowCount(0); // Limpa a tabela antes de atualizar

        for (CadastroFilme filme : filmes) {
            modeloTabela.addRow(new Object[]{filme.getId(), filme.getNome(), filme.getDataLancamento(), filme.getCategoria()});
        }
    }
    /**
     *a classe dao é sempre instanciada no metodo para poder utilzar os metodos da classe dao para interagir com o banco de dados
     */
    public void deleterFilmeBancoDados() {
        String id = visao.getjTextFieldID().getText();

        if (id.isEmpty() || id.length() > 2) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um ID válido.");

        } else {
            int idInteiro = Integer.parseInt(id);
            CadastroFilme filme = new CadastroFilme(idInteiro);
            Connection conexao = null;
            AtualizacaoExclusaoDAO atualizacaoExclusaoDAO = new AtualizacaoExclusaoDAO(conexao);

            atualizacaoExclusaoDAO.deletaFilmeBanco(filme);

            this.exibirListaFilmesNaTabela();
            JOptionPane.showMessageDialog(null, "Filme deletedo com sucesso!");
            visao.getjTextFieldID().setText("");
        }

    }
    /**
     * a classe dao é sempre instanciada no metodo para poder utilzar os metodos da classe dao para interagir com o banco de dados
     */
    public void atualizarFilmeBanco() {
        String id = visao.getjTextFieldID().getText();
        String nome = visao.getjTextFieldNomeFilme().getText();
        String dataLancamento = visao.getjFormattedTextFieldDataLancamento().getText();
        String categoria = visao.getjTextFieldCategoria().getText();
        int idInteiro = Integer.parseInt(id);

        CadastroFilme filme = new CadastroFilme(idInteiro, nome, dataLancamento, categoria);

        Connection conexao = null;
        AtualizacaoExclusaoDAO atualizacaoExclusaoDAO = new AtualizacaoExclusaoDAO(conexao);

        atualizacaoExclusaoDAO.atualizaFilmeBanco(filme);
        this.exibirListaFilmesNaTabela();

        visao.getjTextFieldID().setText("");
        visao.getjTextFieldNomeFilme().setText("");
        visao.getjFormattedTextFieldDataLancamento().setText("");
        visao.getjTextFieldCategoria().setText("");
    }
}
