/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visoes;

import Controladores.ControladorTelaAtualizacaoExclusao;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class TelaAtualizacaoExclusao extends javax.swing.JFrame {
private final ControladorTelaAtualizacaoExclusao controlador;
    /**
     * Creates new form TelaAtualizacaoExclusao
     */
    public TelaAtualizacaoExclusao() {
        initComponents();
        
        controlador = new ControladorTelaAtualizacaoExclusao(this);
        
     controlador.exibirListaFilmesNaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSubtitulo4 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaFilmes = new javax.swing.JTable();
        jLabelSubtitulo = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelSubtitulo2 = new javax.swing.JLabel();
        jFormattedTextFieldDataLancamento = new javax.swing.JFormattedTextField();
        jLabelSubtitulo3 = new javax.swing.JLabel();
        jTextFieldNomeFilme = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jLabelSubtitulo1 = new javax.swing.JLabel();
        jButtonVoltarTelaRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSubtitulo4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelSubtitulo4.setText("Digite a categoria para Atualizaçaõ:");
        getContentPane().add(jLabelSubtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 320, -1));
        getContentPane().add(jTextFieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 30));

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jTableTabelaFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome do filme", "Data lançamento", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTableTabelaFilmes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 180));

        jLabelSubtitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelSubtitulo.setText("Digite o ID para exclusão ou Atualizaçaõ:");
        getContentPane().add(jLabelSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 360, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 60, 30));

        jLabelSubtitulo2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelSubtitulo2.setText("Digite o nome para Atualizaçaõ:");
        getContentPane().add(jLabelSubtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        try {
            jFormattedTextFieldDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataLancamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldDataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 30));

        jLabelSubtitulo3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelSubtitulo3.setText("Digite a data para Atualizaçaõ:");
        getContentPane().add(jLabelSubtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 290, -1));
        getContentPane().add(jTextFieldNomeFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 30));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabelSubtitulo1.setText("(Para exclusão é necessário apenas o ID)");
        getContentPane().add(jLabelSubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 230, 30));

        jButtonVoltarTelaRegistro.setText("Voltar para tela de registro");
        jButtonVoltarTelaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarTelaRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarTelaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataLancamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataLancamentoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        controlador.atualizarFilmeBanco();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
      controlador.deleterFilmeBancoDados();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonVoltarTelaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarTelaRegistroActionPerformed
        TelaCadastroFilme telaCadastroFilme = new TelaCadastroFilme();
        telaCadastroFilme.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarTelaRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoExclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoExclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoExclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizacaoExclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizacaoExclusao().setVisible(true);
            }
        });
    }

    public JTable getjTableTabelaFilmes() {
        return jTableTabelaFilmes;
    }

    public void setjTableTabelaFilmes(JTable jTableTabelaFilmes) {
        this.jTableTabelaFilmes = jTableTabelaFilmes;
    }

    public JTextField getjTextFieldCategoria() {
        return jTextFieldCategoria;
    }

    public void setjTextFieldCategoria(JTextField jTextFieldCategoria) {
        this.jTextFieldCategoria = jTextFieldCategoria;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldNomeFilme() {
        return jTextFieldNomeFilme;
    }

    public void setjTextFieldNomeFilme(JTextField jTextFieldNomeFilme) {
        this.jTextFieldNomeFilme = jTextFieldNomeFilme;
    }

    public JFormattedTextField getjFormattedTextFieldDataLancamento() {
        return jFormattedTextFieldDataLancamento;
    }

    public void setjFormattedTextFieldDataLancamento(JFormattedTextField jFormattedTextFieldDataLancamento) {
        this.jFormattedTextFieldDataLancamento = jFormattedTextFieldDataLancamento;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltarTelaRegistro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataLancamento;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelSubtitulo1;
    private javax.swing.JLabel jLabelSubtitulo2;
    private javax.swing.JLabel jLabelSubtitulo3;
    private javax.swing.JLabel jLabelSubtitulo4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaFilmes;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeFilme;
    // End of variables declaration//GEN-END:variables
}
