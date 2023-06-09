/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.pantallas;

import entidades.Medico;
import gestordecitass.GestorDeCitas;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class JFrameMedicos extends javax.swing.JFrame {

    private List<Medico> medicos;
    private JFrameCita padre;
    private DefaultListModel<String> modellistMedicos;
    /**
     * Creates new form JFrameMedicos
     */
    public JFrameMedicos(JFrameCita padre) {
        initComponents();
        this.padre=padre;
        this.medicos=GestorDeCitas.listaDeMedicos;
        modellistMedicos=new DefaultListModel<>();
        this.listMedicos.setModel(modellistMedicos);
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
        listMedicos = new javax.swing.JList<>();
        txtBuscarmedico = new javax.swing.JTextField();
        btnBuscarMedico = new javax.swing.JButton();
        btnCancelarMedico = new javax.swing.JButton();
        btnCrearMedico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listMedicos);

        txtBuscarmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarmedicoActionPerformed(evt);
            }
        });

        btnBuscarMedico.setBackground(new java.awt.Color(102, 255, 0));
        btnBuscarMedico.setText("Buscar");

        btnCancelarMedico.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarMedico.setText("Salir");
        btnCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMedicoActionPerformed(evt);
            }
        });

        btnCrearMedico.setBackground(new java.awt.Color(51, 51, 255));
        btnCrearMedico.setText("Crear");
        btnCrearMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMedicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Medicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscarmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarmedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarmedicoActionPerformed

    private void listMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMedicosMouseClicked
        if(evt.getClickCount()>1){
            Medico medicoSeleccionado =medicos.get(listMedicos.getSelectedIndex());
            this.padre.setMedico(medicoSeleccionado);
            salir();
        }
        
        
    }//GEN-LAST:event_listMedicosMouseClicked

    private void btnCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMedicoActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_btnCancelarMedicoActionPerformed

    private void btnCrearMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMedicoActionPerformed
        // TODO add your handling code here:
        JFrameEditarMedico pantallaMedico=new JFrameEditarMedico(this);
        pantallaMedico.setLocationRelativeTo(this);
        pantallaMedico.setVisible(true);
    }//GEN-LAST:event_btnCrearMedicoActionPerformed

    public void agregarNuevoMedico(Medico medico){
        medicos.add(medico);
        buscar("");
    }
    
    private void buscar(String criterio){
        this.modellistMedicos.removeAllElements();
        
        for (Medico medico : medicos) {
            if (medico.getNombre()!=null && medico.getNombre().contains(criterio)) {
                this.modellistMedicos.addElement(medico.getDatosMostrar());
                
            }
        }
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
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMedicos(new JFrameCita(new JFrameGestorDeCitas())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnCancelarMedico;
    private javax.swing.JButton btnCrearMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listMedicos;
    private javax.swing.JTextField txtBuscarmedico;
    // End of variables declaration//GEN-END:variables
}
