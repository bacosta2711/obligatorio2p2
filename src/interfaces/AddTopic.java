/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import domain.SystemClass;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author bacosta
 */
public class AddTopic extends javax.swing.JFrame {
    
    private SystemClass system;
    /**
     * Creates new form AddPostulant
     */
    public AddTopic(SystemClass sys) {
        system=sys;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        go = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrevisas");
        getContentPane().setLayout(null);

        panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Registro de temática");
        jLabel1.setToolTipText("");
        panel.add(jLabel1);
        jLabel1.setBounds(135, 32, 142, 18);

        jLabel2.setText("Nombre");
        panel.add(jLabel2);
        jLabel2.setBounds(6, 90, 80, 17);

        jLabel3.setText("Descripción");
        panel.add(jLabel3);
        jLabel3.setBounds(7, 128, 69, 17);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(99, 128, 287, 91);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        panel.add(name);
        name.setBounds(99, 87, 287, 23);

        back.setText("Cancelar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        panel.add(back);
        back.setBounds(6, 258, 81, 23);

        go.setText("Registrar");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        panel.add(go);
        go.setBounds(304, 258, 82, 23);

        getContentPane().add(panel);
        panel.setBounds(6, 0, 402, 303);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
            // TODO add your handling code here:
            JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
            ventanaActual.dispose();
            system.getMenuReference().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        // TODO add your handling code here:
        if(name.getText().isBlank()||description.getText().isBlank()){
             JOptionPane.showMessageDialog(null, "Debe indicar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if (this.system.createTopic(name.getText(), description.getText())){
                JOptionPane.showMessageDialog(null, "El tema se creo de manera exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ya existe este tema.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
         for (int i = 0; i < system.getTopics().size(); i++) {
            System.out.println(system.getTopics().get(i));
        }
    }//GEN-LAST:event_goActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
