//Mateo Seijo 309095
//Bruno Acosta 313080

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import domain.Interview;
import domain.Postulant;
import domain.SystemClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author bacosta
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    private SystemClass system;

    public HomePage() {
        initComponents();
        salir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        empty = new javax.swing.JToggleButton();
        file = new javax.swing.JToggleButton();
        salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addPostulant = new javax.swing.JMenuItem();
        removePostulant = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrevistas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("¡Bienvenido a Entrevistas!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 130, 510, 160);

        label.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        label.setText("¡Seleccione una opción!");
        getContentPane().add(label);
        label.setBounds(280, 350, 380, 40);

        empty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empty.setText("Archivo vacío");
        empty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyActionPerformed(evt);
            }
        });
        getContentPane().add(empty);
        empty.setBounds(580, 430, 150, 21);

        file.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        file.setText("Archivo con datos");
        file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        getContentPane().add(file);
        file.setBounds(30, 430, 150, 21);

        salir.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(310, 310, 150, 21);

        jMenu1.setText("Postulantes");

        addPostulant.setText("Agregar postulante");
        addPostulant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPostulantActionPerformed(evt);
            }
        });
        jMenu1.add(addPostulant);

        removePostulant.setText("Eliminar postulante");
        removePostulant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePostulantActionPerformed(evt);
            }
        });
        jMenu1.add(removePostulant);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Temas");

        jMenuItem1.setText("Agregar tema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Evaluador");

        jMenuItem5.setText("Agregar evaluador");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Entrevista");

        jMenuItem4.setText("Agregar entrevista");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Puesto");

        jMenuItem3.setText("Agregar puesto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Consultas");

        jMenuItem6.setText("Tema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setText("Postulante");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Puesto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(766, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addPostulantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPostulantActionPerformed
        //this.setVisible(false);
        if (!system.getTopics().isEmpty()) {
            Postulant postulantAux = new Postulant();
            AddPostulant window = new AddPostulant(this.getSystem(), postulantAux);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un tema previamente.", "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_addPostulantActionPerformed

    private void removePostulantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePostulantActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        if (!system.getPostulants().isEmpty()) {
            RemovePostulant window = new RemovePostulant(this.getSystem());
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un postulante previamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removePostulantActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //this.setVisible(false);
        AddTopic window = new AddTopic(this.getSystem());
        window.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        AddInterviewer window = new AddInterviewer(system);
        window.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (!system.getInterviewers().isEmpty() && !system.getPostulants().isEmpty()) {
            AddInterview window = new AddInterview(system);
            window.setVisible(true);
        } else {
            if (system.getInterviewers().isEmpty() && system.getPostulants().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un evaluador y un postulante previamente.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (system.getInterviewers().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un evaluador previamente.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un postulante previamente.", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }

        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (!system.getTopics().isEmpty()) {
            AddPosition window = new AddPosition(system);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un tema previamente.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void emptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyActionPerformed
        // TODO add your handling code here:

        SystemClass sys = new SystemClass();
        this.system = sys;

        empty.setVisible(false);
        file.setVisible(false);
        label.setVisible(false);
        salir.setVisible(false);
        jMenuBar1.setVisible(true);


    }//GEN-LAST:event_emptyActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
        SystemClass sys = readFile();

        this.system = sys;

        system.setAutoId();

        empty.setVisible(false);
        file.setVisible(false);
        label.setVisible(false);
        jMenuBar1.setVisible(true);
        salir.setVisible(true);
    }//GEN-LAST:event_fileActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if (!system.getTopics().isEmpty()) {
            QueryTopic window = new QueryTopic(system);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un tema previamente.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jMenuBar1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (!file.isVisible()) {
            this.system.setLastId(Interview.getAutoid());
            this.system.writeFile(this.system);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (!system.getPositions().isEmpty()) {
            QueryPosition window = new QueryPosition(system);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un puesto previamente.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (!system.getPostulants().isEmpty()) {
            QueryPostulantHistory window = new QueryPostulantHistory(system);
            window.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un postulante previamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        if (!file.isVisible()) {
            this.system.writeFile(this.system);
            System.exit(0);
        }

    }//GEN-LAST:event_salirActionPerformed

    public static void main(String[] args) {

        HomePage window = new HomePage();
        //system.setMenuReference(window);
        window.setVisible(true);
    }

    public SystemClass getSystem() {
        return system;
    }

    public static SystemClass readFile() {

        SystemClass s = new SystemClass();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("archivo.ser"));
            s = (SystemClass) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudi recuperar la informacion, clase Sistema Nueva.", "Warning", JOptionPane.ERROR_MESSAGE);
        }

        return s;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addPostulant;
    private javax.swing.JToggleButton empty;
    private javax.swing.JToggleButton file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel label;
    private javax.swing.JMenuItem removePostulant;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
