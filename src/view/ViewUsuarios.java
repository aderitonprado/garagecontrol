/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;

/**
 *
 * @author Admin
 */
public class ViewUsuarios extends javax.swing.JFrame {
    
    ModelUsuario modelUsuario = new ModelUsuario();
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    List<ModelUsuario> listaUsuarios = new ArrayList<>();
    String cadAlt = "cad";

    /**
     * Creates new form ViewUsuarios
     */
    public ViewUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
        carregarUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNomeUsuario = new javax.swing.JTextField();
        jtfLoginUsuario = new javax.swing.JTextField();
        jcbNivelUsuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jbAlterarusuario = new javax.swing.JButton();
        jtfSenhaUsuario = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jcbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setSize(new java.awt.Dimension(1024, 768));

        jPanel1.setName("Usuários"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        jtfCodigo.setEditable(false);

        jtfNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeUsuarioActionPerformed(evt);
            }
        });

        jcbNivelUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Operador", "Administrador" }));

        jLabel4.setText("Nível");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login", "Nível", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblUsuarios.getColumnModel().getColumn(3).setMinWidth(100);
            tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel5.setText("Senha");

        jbAlterarusuario.setText("Alterar");

        jLabel6.setText("Status");

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desativado", "Ativado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterarusuario)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(202, 202, 202))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfNomeUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbNivelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbStatus, 0, 199, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbNivelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterarusuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeUsuarioActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // Cancela a Operação e limpa os dados do formulario
        limparFormulario();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // Obtém todos os dados do formulário e salva os dados
        modelUsuario = new ModelUsuario();
        modelUsuario.setUsu_nome(jtfNomeUsuario.getText());
        modelUsuario.setUsu_login(jtfLoginUsuario.getText());
        modelUsuario.setUsu_senha(String.valueOf(jtfSenhaUsuario.getPassword()));
        modelUsuario.setUsu_nivel(jcbNivelUsuario.getSelectedIndex());
        modelUsuario.setUsu_status(jcbStatus.getSelectedIndex());
        
        if (cadAlt.equals("cad")) {
            if (controllerUsuario.salvarUsuarioController(modelUsuario)) {
                // se a chamada der certo, mandar mensagem de usuario cadastrado com sucesso
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

                // limpar formulario
                limparFormulario();
                carregarUsuarios();
            } else {
                // usuário não foi cadastrado
                JOptionPane.showMessageDialog(this, "Usuário não foi cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            modelUsuario.setUsu_id(Integer.parseInt(jtfCodigo.getText()));
            if (controllerUsuario.atualizarUsuarioController(modelUsuario)) {
                // se a chamada der certo, mandar mensagem de usuario cadastrado com sucesso
                JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);

                // limpar formulario
                limparFormulario();
                carregarUsuarios();
            } else {
                // usuário não foi cadastrado
                JOptionPane.showMessageDialog(this, "Usuário não foi atualizado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    /**
     * metodo para limpar o formulario ao cadastra
     */
    private void limparFormulario() {
        jtfCodigo.setText("");
        jtfLoginUsuario.setText("");
        jtfNomeUsuario.setText("");
        jtfSenhaUsuario.setText("");
        cadAlt = "cad";
    }

    /**
     * metodo para carregar uma lista de usuarios na tabela
     */
    private void carregarUsuarios() {
        listaUsuarios = controllerUsuario.getListaUsuariosController();
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listaUsuarios.size(); i++) {
            // converte os valores inteiros do banco, para seu respectivo valor: 1 = Operador, 2 = Administrador
            String nivel = String.valueOf(listaUsuarios.get(i).getUsu_nivel());
            if(nivel.equals("1")){
                nivel = "Operador";
            } else if(nivel.equals("2")){
                nivel = "Administrador";
            }
            
            String status = String.valueOf(listaUsuarios.get(i).getUsu_status());
            if(status.equals("0")){
                status = "Desativado";
            } else if(status.equals("1")){
                status = "Ativado";
            }

            modelo.addRow(new Object[]{
                listaUsuarios.get(i).getUsu_id(),
                listaUsuarios.get(i).getUsu_nome(),
                listaUsuarios.get(i).getUsu_login(),
                nivel,
                status,
            });
        }
    }
    
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
            java.util.logging.Logger.getLogger(ViewUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterarusuario;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbNivelUsuario;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLoginUsuario;
    private javax.swing.JTextField jtfNomeUsuario;
    private javax.swing.JPasswordField jtfSenhaUsuario;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
