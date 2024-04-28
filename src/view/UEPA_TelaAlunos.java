/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import DTO.UEPA_dadosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leticia
 */
public class UEPA_TelaAlunos extends javax.swing.JFrame {

    /**
     * Creates new form UEPA_TelaAlunos
     */
    public UEPA_TelaAlunos() {
        initComponents();
        
        listarDados();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Alunos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51))));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ALUNOS CADASTRADOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 20, 200, 17);

        tabela_Alunos.setBackground(new java.awt.Color(153, 153, 153));
        tabela_Alunos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabela_Alunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Curso", "Telefone", "Turma", "Endereço", "Matricula"
            }
        ));
        tabela_Alunos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabela_Alunos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(36, 58, 740, 211);

        btnAlterar.setBackground(new java.awt.Color(102, 255, 102));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(60, 320, 92, 34);

        btnDeletar.setBackground(new java.awt.Color(204, 0, 0));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeletar);
        btnDeletar.setBounds(200, 320, 91, 34);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(810, 30, 50, 16);

        Codigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Codigo);
        Codigo.setBounds(810, 50, 70, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(810, 90, 54, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CPF");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(809, 163, 37, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Curso");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(927, 385, 37, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(809, 239, 60, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Turma");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(809, 385, 37, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Endereço");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(810, 310, 60, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Matricula");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(920, 30, 60, 16);

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(txtNome);
        txtNome.setBounds(809, 115, 290, 30);

        txtCPF.setBackground(new java.awt.Color(204, 204, 204));
        txtCPF.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(txtCPF);
        txtCPF.setBounds(809, 191, 286, 30);

        txtTelefone.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefone.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(809, 267, 286, 30);

        txtEndereco.setBackground(new java.awt.Color(204, 204, 204));
        txtEndereco.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(809, 343, 290, 30);

        txtMatricula.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtMatricula);
        txtMatricula.setBounds(920, 50, 131, 30);

        txtTurma.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtTurma);
        txtTurma.setBounds(809, 414, 92, 30);

        txtCurso.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtCurso);
        txtCurso.setBounds(930, 410, 160, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Carregar itens");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 320, 143, 35);

        btnAtualizar.setBackground(new java.awt.Color(204, 255, 204));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar);
        btnAtualizar.setBounds(530, 320, 106, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deletarUsuario();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
        listarDados();
        limparUsuario();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        listarDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(UEPA_TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UEPA_TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UEPA_TelaAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_Alunos;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables

    //mostrar dados do banco em uma tabela
    private void listarDados() {
        try {
            UsuarioDAO objUsuariodao = new UsuarioDAO();
            DefaultTableModel model = (DefaultTableModel) tabela_Alunos.getModel();
            model.setNumRows(0); //para usar a tabela para os dados
            ArrayList<UEPA_dadosDTO> list = objUsuariodao.listarAluno(); //chamar lista para exibir sequencialmente os dados 
            for (int num = 0; num < list.size(); num++) { //for para percorrer a lista
                model.addRow(new Object[]{
                    list.get(num).getId(),
                    list.get(num).getNome(),
                    list.get(num).getCpf(),
                    list.get(num).getCurso(),
                    list.get(num).getTelefone(),
                    list.get(num).getTurma(),
                    list.get(num).getEndereco(),
                    list.get(num).getMatricula()
                });

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "List Dados VIEW" + erro);
        }
    }
    //alterar os daodos
    private void alterar() {
        int id_user;
        String name_user, cpf_user, curso_user, telefone_user, turma_user, endereco_user, matricula_user;

        id_user = Integer.parseInt(Codigo.getText());
        name_user = txtNome.getText();
        cpf_user = txtCPF.getText();        //guarda os dados carregados dos campos novos criados em variáveis
        curso_user = txtCurso.getText();
        telefone_user = txtTelefone.getText();
        turma_user = txtTurma.getText();
        endereco_user = txtEndereco.getText();
        matricula_user = txtMatricula.getText();

        //envia os dados carregados e que foram modificados para as variaveis da DTO
        UEPA_dadosDTO objecteUserDto = new UEPA_dadosDTO();
        objecteUserDto.setId(id_user);
        objecteUserDto.setNome(name_user);
        objecteUserDto.setCpf(cpf_user);
        objecteUserDto.setCurso(curso_user);            
        objecteUserDto.setTelefone(telefone_user);
        objecteUserDto.setTurma(turma_user);
        objecteUserDto.setEndereco(endereco_user);
        objecteUserDto.setMatricula(matricula_user);

        UsuarioDAO objecteUserDao = new UsuarioDAO();
        objecteUserDao.alterarAluno(objecteUserDto); //chama metodo alterar, conectando DTO e DAO
    }
    public void deletarUsuario() {
        int id_User;

        id_User = Integer.parseInt(Codigo.getText());

        UEPA_dadosDTO objecteUserDTO = new UEPA_dadosDTO();
        objecteUserDTO.setId(id_User); //envia id selecionado (carregado) para DTO

        UsuarioDAO objecteUserDAO = new UsuarioDAO();
        objecteUserDAO.deletarAluno(objecteUserDTO); //conecta DTO e DAO, chamando metodo
    }

    public void limparUsuario() {

        txtCPF.setText("");
        txtCurso.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtTurma.setText("");
        txtMatricula.setText("");
        txtEndereco.setText("");
    }
    //carregar os dados da linha selecionado na tabela para os campos criados
        private void carregar() {
        int setDates = tabela_Alunos.getSelectedRow();
        Codigo.setText(tabela_Alunos.getModel().getValueAt(setDates, 0).toString());
        Codigo.setEnabled(false);
        txtNome.setText(tabela_Alunos.getModel().getValueAt(setDates, 1).toString());
        txtCPF.setText(tabela_Alunos.getModel().getValueAt(setDates, 2).toString());
        txtCurso.setText(tabela_Alunos.getModel().getValueAt(setDates, 3).toString());
        txtTelefone.setText(tabela_Alunos.getModel().getValueAt(setDates, 4).toString());
        txtTurma.setText(tabela_Alunos.getModel().getValueAt(setDates, 5).toString());
        txtEndereco.setText(tabela_Alunos.getModel().getValueAt(setDates, 6).toString());
        txtMatricula.setText(tabela_Alunos.getModel().getValueAt(setDates, 7).toString());
    }
}