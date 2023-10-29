package interfaces;

import domain.Interview;
import domain.Postulant;
import domain.SystemClass;
import domain.Topic;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultHighlighter;

public class QueryPostulant extends javax.swing.JFrame {

    private SystemClass system;
    DefaultListModel model = new DefaultListModel();
    DefaultListModel modelTwo = new DefaultListModel();
    DefaultTableModel modelThree = new DefaultTableModel();

    public QueryPostulant(SystemClass sys) {
        system = sys;
        initComponents();
        postulants.setModel(model);

        String[] titles = new String[]{"Nro", "Evaluador", "Puntaje", "Comentarios"};

        //modelThree.addRow(new Object [] {"1","2","3","4"}); 
        modelThree.setColumnIdentifiers(titles);
        filterInterviews.setModel(modelThree);

        setPostulants();
        modelThree.setRowCount(0);
        postulantAdress.setText("");
        formatPostulant.setText("");
        postulantLinkedin.setText("");
        postulantMail.setText("");
        postulantName.setText("");
        postulantDocument.setText("");
        postulantPhone.setText("");
        filterInterviews.setModel((TableModel) modelThree);

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
        name = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        linkedin = new javax.swing.JLabel();
        document = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        format = new javax.swing.JLabel();
        postulantName = new javax.swing.JLabel();
        postulantDocument = new javax.swing.JLabel();
        postulantAdress = new javax.swing.JLabel();
        formatPostulant = new javax.swing.JLabel();
        postulantMail = new javax.swing.JLabel();
        postulantLinkedin = new javax.swing.JLabel();
        postulantPhone = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        seeker = new javax.swing.JTextField();
        seekerButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        filterInterviews = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        postulants = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        postulantExperience = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrevistas");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial postulante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(411, 22, 184, 22);

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setText("Nombre:");
        name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(name);
        name.setBounds(603, 62, 52, 15);

        phone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phone.setText("Teléfono:");
        phone.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(phone);
        phone.setBounds(603, 164, 58, 15);

        mail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mail.setText("Mail:");
        mail.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(mail);
        mail.setBounds(603, 197, 29, 15);

        linkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkedin.setText("LinkedIn:");
        linkedin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(linkedin);
        linkedin.setBounds(603, 230, 57, 15);

        document.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        document.setText("Cédula:");
        document.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(document);
        document.setBounds(603, 97, 46, 16);

        adress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adress.setText("Dirección:");
        adress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(adress);
        adress.setBounds(603, 131, 61, 15);

        experience.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        experience.setText("Experiencia:");
        experience.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(experience);
        experience.setBounds(604, 290, 73, 15);

        format.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        format.setText("Formato:");
        format.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(format);
        format.setBounds(604, 263, 55, 15);

        postulantName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantName.setText("Nombre Postulante");
        postulantName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(postulantName);
        postulantName.setBounds(677, 62, 119, 15);

        postulantDocument.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantDocument.setText("CédulaPostulante");
        postulantDocument.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(postulantDocument);
        postulantDocument.setBounds(677, 98, 109, 15);

        postulantAdress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantAdress.setText("CédulaPostulante");
        postulantAdress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(postulantAdress);
        postulantAdress.setBounds(677, 131, 109, 15);

        formatPostulant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        formatPostulant.setText("CédulaPostulante");
        formatPostulant.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(formatPostulant);
        formatPostulant.setBounds(677, 263, 109, 15);

        postulantMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantMail.setText("CédulaPostulante");
        postulantMail.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(postulantMail);
        postulantMail.setBounds(677, 197, 109, 15);

        postulantLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantLinkedin.setText("CédulaPostulante");
        postulantLinkedin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        postulantLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postulantLinkedinMouseClicked(evt);
            }
        });
        getContentPane().add(postulantLinkedin);
        postulantLinkedin.setBounds(677, 230, 109, 15);

        postulantPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantPhone.setText("CédulaPostulante");
        postulantPhone.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(postulantPhone);
        postulantPhone.setBounds(677, 164, 109, 15);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Postulantes:");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(29, 62, 94, 15);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(29, 754, 72, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(29, 399, 50, 24);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Buscar:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(29, 433, 94, 15);

        seeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seekerActionPerformed(evt);
            }
        });
        getContentPane().add(seeker);
        seeker.setBounds(168, 429, 210, 23);

        seekerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seekerButton.setText("Buscar");
        seekerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seekerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seekerButton);
        seekerButton.setBounds(412, 430, 100, 21);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Resetear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 430, 100, 21);

        filterInterviews.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        filterInterviews.setToolTipText("");
        filterInterviews.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filterInterviews.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(filterInterviews);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(29, 470, 882, 243);

        postulants.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        postulants.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                postulantsValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(postulants);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(29, 86, 349, 278);

        jScrollPane2.setViewportView(postulantExperience);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(677, 290, 219, 130);

        setSize(new java.awt.Dimension(938, 821));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void postulantsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_postulantsValueChanged
        // TODO add your handling code here:
        Postulant selected = postulants.getSelectedValue();
        setPostulantAdress(selected);
        setPostulantDocument(selected);
        setPostulantExperience(selected);
        setPostulantName(selected);
        setPostulantLinkedin(selected);
        setPostulantPhone(selected);
        setPostulantMail(selected);
        generateTable();
    }//GEN-LAST:event_postulantsValueChanged

    private void postulantLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postulantLinkedinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_postulantLinkedinMouseClicked

    private void seekerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seekerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seekerActionPerformed

    private void seekerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seekerButtonActionPerformed
        // TODO add your handling code here:
        String seek = getSeeker();
        ArrayList<Interview> l = this.system.getInterviews();
        ArrayList<Interview> r = new ArrayList();
        for (Interview s : l) {
            if (s.getObservation().toUpperCase().contains(seek) && !"".equals(seek) && !" ".equals(seek)) {
                r.add(s);
            }
        }
        System.out.println(r.size());
        setInterviews(r);
        highlightMatchesInTable(filterInterviews, seek);
    }//GEN-LAST:event_seekerButtonActionPerformed
    private void highlightMatchesInTable(JTable table, String searchString) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

        for (int row = 0; row < tableModel.getRowCount(); row++) {
            String cellText = (String) tableModel.getValueAt(row, 3);
            if (cellText != null && cellText.toLowerCase().contains(searchString.toLowerCase())) {
                String cellTextLowerCase = cellText.toLowerCase();
                searchString = searchString.toLowerCase();
                String highlightedText = cellText;
                int startIndex = 0;
                
                while (startIndex < cellTextLowerCase.length()) {
                    int foundIndex = cellTextLowerCase.indexOf(searchString, startIndex);
                    if (foundIndex == -1) {
                        break; 
                    }
                    highlightedText = highlightedText.substring(0, foundIndex)
                            + "<span style='color:red;'>" + cellText.substring(foundIndex, foundIndex + searchString.length()) + "</span>"
                            + highlightedText.substring(foundIndex + searchString.length());

                    startIndex = foundIndex + searchString.length();
                }
                tableModel.setValueAt("<html>" + highlightedText + "</html>", row, 3); // Columna 3 es el campo de "observation"
            }
        }

        table.setModel(tableModel);
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<Interview> r = new ArrayList();
        setInterviews(r);
        seeker.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    public void setInterviews(ArrayList<Interview> interviews) {
        modelThree.setRowCount(0);
        ArrayList<Interview> interviewList = interviews;
        for (Interview t : interviewList) {
            int number = t.getId();
            String interviewer = t.getInterviewer().toString();
            int puntuation = t.getPuntuation();
            String comments = t.getObservation();
            modelThree.addRow(new Object[]{number, interviewer, puntuation, comments});
        }
        System.out.println(filterInterviews.toString());
    }

    public void setPostulantAdress(Postulant postulant) {
        postulantAdress.setText(postulant.getAddress());
    }

    public void setPostulantDocument(Postulant postulant) {
        postulantDocument.setText(postulant.getDocument());
    }

    public void setFormatPostulant(Postulant postulant) {

    }

    public void setPostulantExperience(Postulant postulant) {
        modelTwo.clear();
        for (Map.Entry<Topic, Integer> entry : postulant.getSkills().entrySet()) {
            modelTwo.addElement(entry.getKey() + "(" + entry.getValue() + ")");
        }
        postulantExperience.setModel(modelTwo);
    }

    public void setPostulantLinkedin(Postulant postulant) {
        postulantLinkedin.setText(postulant.getLinkedin());
    }

    public void setPostulantMail(Postulant postulant) {
        postulantMail.setText(postulant.getEmail());
    }

    public void setPostulantName(Postulant postulant) {
        postulantName.setText(postulant.getName());
    }

    public void setPostulantPhone(Postulant postulant) {
        postulantPhone.setText(postulant.getContact());
    }

    public String getSeeker() {
        return seeker.getText().toUpperCase();
    }

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public void setPostulants() {
        model.clear();
        ArrayList<Postulant> postulantList = this.system.getPostulants();
        for (Postulant T : postulantList) {
            model.addElement(T);
        }
    }

    public void generateTable() {
        if (!postulants.isSelectionEmpty()) {
            modelThree.setRowCount(0);
            for (Interview t : postulants.getSelectedValue().getInterviews()) {
                modelThree.addRow(new Object[]{t.getId(), t.getInterviewer().toString(), t.getPuntuation(), t.getObservation()});
            }
        }

        System.out.println(modelThree.toString());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JLabel document;
    private javax.swing.JLabel experience;
    private javax.swing.JTable filterInterviews;
    private javax.swing.JLabel format;
    private javax.swing.JLabel formatPostulant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel linkedin;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel postulantAdress;
    private javax.swing.JLabel postulantDocument;
    private javax.swing.JList<String> postulantExperience;
    private javax.swing.JLabel postulantLinkedin;
    private javax.swing.JLabel postulantMail;
    private javax.swing.JLabel postulantName;
    private javax.swing.JLabel postulantPhone;
    private javax.swing.JList<Postulant> postulants;
    private javax.swing.JTextField seeker;
    private javax.swing.JButton seekerButton;
    // End of variables declaration//GEN-END:variables
}
