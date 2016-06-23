/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paineis;

import Classes.Funcionario;
import ClassesDeEntidades.Livro;
import ClassesJPAController.LivroJpaController;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

public class list_livro extends javax.swing.JPanel {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryPU");
    LivroJpaController livrojpa;
    String id = null;

    List<Livro> list = null;

    public list_livro() {
        initComponents();
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtbusca = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabela);

        jLabel1.setText("Editora:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnbuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnbuscar)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Funcionario f = new Funcionario();
        try {
            if (txtbusca.getText().isEmpty()) {
                list = f.listartodos();
                listarbusca();
            } else {
                list = f.listar(txtbusca.getText());
                listarbusca();
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbusca;
    // End of variables declaration//GEN-END:variables
    public void atualizarTabela() {
        List<Livro> lista = null;
        livrojpa = new LivroJpaController(emf);
        lista = livrojpa.findLivroEntities();
        String[] col = {"IdLivro", "Nome Livro", "Editora", "Edição", "Area", "Ano", "idBiblioteca"};
        DefaultTableModel modelo = new DefaultTableModel(col, 0);
        for (Livro p : lista) {
            modelo.addRow(new String[]{String.valueOf(p.getIdLivro()), p.getNomeLivro(), p.getEditora(), p.getEdicao(), String.valueOf(p.getArea()), String.valueOf(p.getAno()), String.valueOf(p.getIdBiblioteca().getIdBiblioteca())});
        }
        Tabela.setModel(modelo);

    }

    public void listarbusca() {
        livrojpa = new LivroJpaController(emf);
        String[] col = {"IdLivro", "Nome Livro", "Editora", "Edição", "Area", "Ano", "idBiblioteca"};
        DefaultTableModel modelo = new DefaultTableModel(col, 0);
        for (Livro p : list) {
            modelo.addRow(new String[]{String.valueOf(p.getIdLivro()), p.getNomeLivro(), p.getEditora(), p.getEdicao(), String.valueOf(p.getArea()), String.valueOf(p.getAno()), String.valueOf(p.getIdBiblioteca().getIdBiblioteca())});
        }
        Tabela.setModel(modelo);

    }
}
