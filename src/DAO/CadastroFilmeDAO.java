/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelos.CadastroFilme;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class CadastroFilmeDAO {

    private final Connection connection;

    public CadastroFilmeDAO(Connection connection) {
        this.connection = connection;
    }
/**
 * 
 * @param filme e passado objeto como parametro para fazer a inserção no banco
 */
    public void inserirFilmeNoBanco(CadastroFilme filme) {
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "insert into filmes(nome,datalancamento,categoria) values(?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, filme.getNome());
            ps.setString(2, filme.getDataLancamento());
            ps.setString(3, filme.getCategoria());
            ps.execute();
            ps.close();
            conn.close();
            JOptionPane.showInternalMessageDialog(null, "Filme salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Falha no sql!");
        }
    }
/**
 * 
 * @return traz alista em um array de todos os filmes que estao no banco
 */
    public ArrayList<CadastroFilme> listaTodosFilmes() {
        ArrayList<CadastroFilme> filmes = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos ProdutoApp
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filme = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmes.add(filme);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmes;

    }
/**
 * esse metodo exibe uma tabela em um JOptionPane com o objeto filmes listado
 * @param filmes 
 */
    public void exibirListaFilmes(ArrayList<CadastroFilme> filmes) {
        // ArrayList<CadastroFilme> filmes = this.listaTodosFilmes();

        // Criar uma matriz para armazenar os dados da tabela 
        Object[][] df = new Object[filmes.size()][4];

        // Preencher a matriz com os dados dos filmes
        for (int i = 0; i < filmes.size(); i++) {
            CadastroFilme filme = filmes.get(i);
            df[i][0] = filme.getId();
            df[i][1] = filme.getNome();
            df[i][2] = filme.getDataLancamento();
            df[i][3] = filme.getCategoria();
        }

        // Criar o modelo da tabela com os dados
        String[] colunaNomes = {"ID", "Nome", "Data lançamento", "Categoria"};
        DefaultTableModel modeloTabela = new DefaultTableModel(df, colunaNomes);

        // Criar a tabela com o modelo
        JTable tabela = new JTable(modeloTabela);

        // Exibir a tabela em um diálogo
        JOptionPane.showMessageDialog(null, new JScrollPane(tabela), "Lista de Filmes", JOptionPane.INFORMATION_MESSAGE);
    }

   /**
    * retorna uma array com a lista de filmes de ação
    * @return 
    */

    public ArrayList<CadastroFilme> listaFilmesAcao() {
        ArrayList<CadastroFilme> filmesAcao = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%ação%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeAcao = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesAcao.add(filmeAcao);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesAcao;
    }
/**
 * retorna uma array com a lista de filmes de comedia
 * @return 
 */
    public ArrayList<CadastroFilme> listaFilmesComedia() {
        ArrayList<CadastroFilme> filmesComedia = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%comédia%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeComedia = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesComedia.add(filmeComedia);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesComedia;
    }
/**
 * retorna uma array com a lista de filmes de aventura
 * @return 
 */
    public ArrayList<CadastroFilme> listaFilmesAventura() {
        ArrayList<CadastroFilme> filmesAventura = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%aventura%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeAventura = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesAventura.add(filmeAventura);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesAventura;
    }
/**
 * retorna uma array com a lista de filmes de terror
 * @return 
 */
    public ArrayList<CadastroFilme> listaFilmesTerror() {
        ArrayList<CadastroFilme> filmesTerror = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%terror%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeTerror = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesTerror.add(filmeTerror);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesTerror;
    }
/**
 * retorna uma array com a lista de filmes de documentario
 * @return 
 */
    public ArrayList<CadastroFilme> listaFilmesDocumentario() {
        ArrayList<CadastroFilme> filmesDocumentario = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%documentario%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeDoc = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesDocumentario.add(filmeDoc);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesDocumentario;
    }
    /**
     * retorna uma array com a lista de filmes de ficção
     * @return 
     */
    public ArrayList<CadastroFilme> listaFilmesFiccaoCientifica() {
        ArrayList<CadastroFilme> filmesFiccaoCientifica = new ArrayList<>();
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "SELECT * FROM filmes where lower(categoria) like '%ficçao cientifica%' ;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                // Extrair informações do ResultSet e criar objetos CadastroFilme
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String dataLancamento = rs.getString("datalancamento");
                String categoria = rs.getString("categoria");

                CadastroFilme filmeFic = new CadastroFilme(id, nome, dataLancamento, categoria);
                filmesFiccaoCientifica.add(filmeFic);
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha no SQL!");
        }

        return filmesFiccaoCientifica;
    }

}
