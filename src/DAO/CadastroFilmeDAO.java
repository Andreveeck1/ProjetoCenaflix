/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelos.CadastroFilme;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class CadastroFilmeDAO {

    private final Connection connection;

    public CadastroFilmeDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirFilmeNoBanco(CadastroFilme filme){
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
}
