/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import domain.SystemClass;
import domain.Topic;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author bacosta
 */
public class AddPostulantSkills extends javax.swing.JFrame implements Observer {

    private SystemClass system;
    private JFrame predecesor;

    DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form AddPostulantSkills
     */
    public AddPostulantSkills(SystemClass sys, JFrame pre) {
        predecesor = pre;
        system = sys;
        sys.addObserver(this);
        initComponents();
        listSkills.setModel(model);
        setTopicCombo();
        setListItem();

    }

    public void update(Observable o, Object ob) {

        setTopicCombo();
        setListItem();
    }

    public JFrame getPredecesor() {
        return predecesor;
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
        topic = new javax.swing.JComboBox<>();
        level = new javax.swing.JSpinner();
        remove = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSkills = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();
        go = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrevistas");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Alta postulante");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 40, 103, 18);

        jLabel2.setText("Tema:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 110, 17);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Experiencia:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 74, 20);

        jPanel1.add(topic);
        topic.setBounds(140, 70, 260, 23);

        level.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        level.setOpaque(true);
        jPanel1.add(level);
        level.setBounds(140, 100, 120, 23);

        remove.setText("Eliminar");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove);
        remove.setBounds(30, 210, 90, 23);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 140, 370, 20);

        listSkills.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listSkills);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 160, 260, 80);

        jLabel4.setText("Nivel:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 110, 20);

        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(290, 100, 110, 23);

        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 290, 110, 23);

        go.setText("Registrar");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        jPanel1.add(go);
        go.setBounds(290, 290, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 330);

        setSize(new java.awt.Dimension(431, 362));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        ventanaActual.dispose();
        this.getPredecesor().setVisible(true);

    }//GEN-LAST:event_backActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        // TODO add your handling code here:
        if (!this.system.addPostulant(this.getSystem().getPostulantMemory())) {
            JOptionPane.showMessageDialog(null, "No se pudo crear al postulante, ya existe.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            this.getSystem().resetPostulantMemory();
            JOptionPane.showMessageDialog(null, "El postulante se creo de manera exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
            ventanaActual.dispose();
            this.getPredecesor().dispose();

            AddPostulant newWindow = new AddPostulant(this.getSystem());
            newWindow.setVisible(true);

        }

    }//GEN-LAST:event_goActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(level.getValue().toString()) >= 1 && Integer.parseInt(level.getValue().toString()) <= 10) {
            this.getSystem().getPostulantMemory().addSkills((Topic) topic.getSelectedItem(), Integer.parseInt(level.getValue().toString()));

            this.setListItem();
            this.setTopicCombo();
        } else {
            JOptionPane.showMessageDialog(null, "El nivel del tema debe estar entre 1 y 10.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:

        this.getSystem().getPostulantMemory().removeSkills(this.getSystem().getTopicByName(listSkills.getSelectedValue().substring(0, listSkills.getSelectedValue().indexOf("("))));
        //System.out.println(this.getSystem().getPostulantMemory().toString());


    }//GEN-LAST:event_removeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner level;
    private javax.swing.JList<String> listSkills;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<Topic> topic;
    // End of variables declaration//GEN-END:variables

    private void setTopicCombo() {
        topic.removeAllItems();
        ArrayList<Topic> topicList = this.getSystem().getTopicsNotInMemory();
        for (Topic t : topicList) {
            topic.addItem(t);
        }
        int count = 0;
        for (int i = 0; i < topic.getComponentCount(); i++) {
            if (topic.getItemAt(i) != null) {
                count++;
            }
        }
        //System.out.println("TCount:"+topic.getComponentCount());
        if (count == 0) {
            topic.setEnabled(false);
            level.setEnabled(false);
            add.setEnabled(false);
            topic.addItem(new Topic("No hay temas registrados.", ""));
        } else {
            level.setEnabled(true);
            topic.setEnabled(true);
            add.setEnabled(true);
        }
    }

    private void setListItem() {
        model.removeAllElements();
        for (Map.Entry<Topic, Integer> entry : this.getSystem().getPostulantMemory().getSkills().entrySet()) {
            model.addElement(entry.getKey() + "(" + entry.getValue() + ")");
        }
        if (model.isEmpty()) {
            remove.setEnabled(false);
            listSkills.setEnabled(false);
            model.addElement("No hay experiencia.");
        } else {
            remove.setEnabled(true);
            listSkills.setEnabled(true);
        }
    }

    public SystemClass getSystem() {
        return system;
    }

}
