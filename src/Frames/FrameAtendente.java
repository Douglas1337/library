/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Paineis.add_atendente;
import Paineis.delete_atendente;
import Paineis.edit_atendente;
import Paineis.list_atendente;

/**
 *
 * @author Guilherme
 */
public class FrameAtendente extends javax.swing.JFrame {

    add_atendente add;
    delete_atendente del;
    edit_atendente edit;
    list_atendente list;

    public FrameAtendente() {
        initComponents();

        add = new add_atendente();
        add.setSize(890, 370);
        add.setBounds(10, 10, add.getWidth(), add.getHeight());
        getContentPane().add(add);
        add.setVisible(false);

        del = new delete_atendente();
        del.setSize(890, 370);
        del.setBounds(10, 10, del.getWidth(), del.getHeight());
        getContentPane().add(del);
        del.setVisible(false);

        edit = new edit_atendente();
        edit.setSize(890, 430);
        edit.setBounds(10, 10, edit.getWidth(), edit.getHeight());
        getContentPane().add(edit);
        edit.setVisible(false);

        list = new list_atendente();
        list.setSize(890, 370);
        list.setBounds(10, 10, list.getWidth(), list.getHeight());
        getContentPane().add(list);
        list.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd_atendente = new javax.swing.JButton();
        btnedit_atendente = new javax.swing.JButton();
        btnexcluir_atendente = new javax.swing.JButton();
        btnlist_atendente = new javax.swing.JButton();

        btnadd_atendente.setText("Adicionar Atendente");
        btnadd_atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd_atendenteActionPerformed(evt);
            }
        });

        btnedit_atendente.setText("Editar Atendente");
        btnedit_atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit_atendenteActionPerformed(evt);
            }
        });

        btnexcluir_atendente.setText("Excluir Atendente");
        btnexcluir_atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluir_atendenteActionPerformed(evt);
            }
        });

        btnlist_atendente.setText("Listar Atendentes");
        btnlist_atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlist_atendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnadd_atendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnedit_atendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir_atendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlist_atendente)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd_atendente)
                    .addComponent(btnedit_atendente)
                    .addComponent(btnexcluir_atendente)
                    .addComponent(btnlist_atendente))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnadd_atendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd_atendenteActionPerformed
        add.setVisible(true);
        edit.setVisible(false);
        del.setVisible(false);
        list.setVisible(false);
        add.atualizarTabela();
    }//GEN-LAST:event_btnadd_atendenteActionPerformed

    private void btnedit_atendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit_atendenteActionPerformed
        add.setVisible(false);
        edit.setVisible(true);
        del.setVisible(false);
        list.setVisible(false);
        edit.atualizarTabela();
    }//GEN-LAST:event_btnedit_atendenteActionPerformed

    private void btnexcluir_atendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluir_atendenteActionPerformed
        add.setVisible(false);
        edit.setVisible(false);
        del.setVisible(true);
        list.setVisible(false);
        del.atualizarTabela();
    }//GEN-LAST:event_btnexcluir_atendenteActionPerformed

    private void btnlist_atendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlist_atendenteActionPerformed
        add.setVisible(false);
        edit.setVisible(false);
        del.setVisible(false);
        list.setVisible(true);
    }//GEN-LAST:event_btnlist_atendenteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd_atendente;
    private javax.swing.JButton btnedit_atendente;
    private javax.swing.JButton btnexcluir_atendente;
    private javax.swing.JButton btnlist_atendente;
    // End of variables declaration//GEN-END:variables
}
