/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.pantallas;

import entidades.Paciente;
import gestordecitass.GestorDeCitas;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class JFramePacientes extends javax.swing.JFrame {

    private JFrameCita padre;
    private List<Paciente> pacientes;
    private DefaultListModel<String> modellistPaciente;
    /**
     * Creates new form JFramePacientes
     */
    public JFramePacientes(JFrameCita padre) {
        initComponents();
        this.padre=padre;
        this.pacientes=GestorDeCitas.listaDePacientes;
        modellistPaciente= new DefaultListModel<>();
        this.listPacientes.setModel(modellistPaciente);
        buscar("");
        
        
    }
    private void buscar(String criterio){
        this.modellistPaciente.removeAllElements();
        
        for(Paciente paciente : pacientes){
            if(paciente.getNombre()!= null && paciente.getNombre().contains(criterio)){
                this.modellistPaciente.addElement(paciente.getDatosMostrar());
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscarPaciente = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPacientes = new javax.swing.JList<>();
        btnCancelarPaciente = new javax.swing.JButton();
        btnCrearPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paciente");

        btnBuscarPaciente.setBackground(new java.awt.Color(102, 255, 0));
        btnBuscarPaciente.setText("Buscar");

        listPacientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPacientes);

        btnCancelarPaciente.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarPaciente.setText("Salir");
        btnCancelarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPacienteActionPerformed(evt);
            }
        });

        btnCrearPaciente.setBackground(new java.awt.Color(0, 0, 204));
        btnCrearPaciente.setText("Crear Paciente");
        btnCrearPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtBuscarPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPacienteActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_btnCancelarPacienteActionPerformed

    private void listPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPacientesMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()>1){
         Paciente paciente =pacientes.get(listPacientes.getSelectedIndex());
         this.padre.setPaciente(paciente);
         salir();
        }
        
    }//GEN-LAST:event_listPacientesMouseClicked

    private void btnCrearPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPacienteActionPerformed
        // TODO add your handling code here:
        
        JFrameEditarPaciente pantallaEditarPacientes = new JFrameEditarPaciente(this);
        pantallaEditarPacientes.setLocationRelativeTo(this);
        pantallaEditarPacientes.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnCrearPacienteActionPerformed

    public void agregarNuevoPaciente(Paciente paciente){
        pacientes.add(paciente);
        buscar("");
    }
    private void salir(){
        //Muestra la ventana padre
        padre.setVisible(true);
        //Elmina esta ventana para no ocupar memoria
        this.dispose();
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
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePacientes(new JFrameCita(new JFrameGestorDeCitas())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelarPaciente;
    private javax.swing.JButton btnCrearPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPacientes;
    private javax.swing.JTextField txtBuscarPaciente;
    // End of variables declaration//GEN-END:variables
}