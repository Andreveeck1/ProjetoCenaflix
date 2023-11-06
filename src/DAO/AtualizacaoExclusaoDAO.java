/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelos.CadastroFilme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AtualizacaoExclusaoDAO {

    private final Connection connection;

    /**
     *
     * @param connection cria a conexao com o banco de dados
     */
    public AtualizacaoExclusaoDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * faz o select * from filmes
     * @return retorna a lista de filmes que está no banco de dados
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
                // Extrair informações do ResultSet e criar objetos CadastroFilme
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
     *
     * @param filme e passado um objeto criado como parametro para fazer query
     * para o delete no banco
     */
    public void deletaFilmeBanco(CadastroFilme filme) {
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "delete from filmes where id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, filme.getId());
            ps.executeUpdate(); // Executa o delete no banco de dados
            ps.close();
            conn.close();

            // JOptionPane.showMessageDialog(null, "Filme deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha! produto não deletado!");
        }

    }

    /**
     *
     * @param Filme e passado um objeto criado como parametro para fazer query
     * para o update no banco
     */
    public void atualizaFilmeBanco(CadastroFilme Filme) {
        try {
            Connection conn = (Connection) new ConexaoComBancoDados().getConnection();
            String sql = "update filmes set nome = ?, datalancamento = ?, categoria = ? where id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Filme.getNome());
            ps.setString(2, Filme.getDataLancamento());
            ps.setString(3, Filme.getCategoria());
            ps.setInt(4, Filme.getId());
            ps.executeUpdate(); // Executaa atualização no banco de dados
            ps.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha! produto não atualizado!");
        }
    }

   
}
