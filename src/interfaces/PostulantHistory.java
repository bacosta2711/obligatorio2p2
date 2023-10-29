package interfaces;

import domain.Interview;
import domain.Postulant;
import domain.SystemClass;
import domain.Topic;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PostulantHistory extends javax.swing.JFrame {

    private SystemClass system;
    DefaultListModel model = new DefaultListModel();
    DefaultListModel modelTwo = new DefaultListModel();
    DefaultTableModel modelThree = new DefaultTableModel();

    public PostulantHistory(SystemClass sys) {
        system = sys;
        initComponents();
        postulants.setModel(model);
        setPostulants();
        postulantAdress.setText("");
        formatPostulant.setText("");
        postulantLinkedin.setText("");
        postulantMail.setText("");
        postulantName.setText("");
        postulantDocument.setText("");
        postulantPhone.setText("");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial postulante");

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setText("Nombre:");
        name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        phone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phone.setText("Teléfono:");
        phone.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        mail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mail.setText("Mail:");
        mail.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        linkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkedin.setText("LinkedIn:");
        linkedin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        document.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        document.setText("Cédula:");
        document.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        adress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adress.setText("Dirección:");
        adress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        experience.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        experience.setText("Experiencia:");
        experience.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        format.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        format.setText("Formato:");
        format.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        postulantName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantName.setText("Nombre Postulante");
        postulantName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        postulantDocument.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantDocument.setText("CédulaPostulante");
        postulantDocument.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        postulantAdress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantAdress.setText("CédulaPostulante");
        postulantAdress.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        formatPostulant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        formatPostulant.setText("CédulaPostulante");
        formatPostulant.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        postulantMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantMail.setText("CédulaPostulante");
        postulantMail.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        postulantLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantLinkedin.setText("CédulaPostulante");
        postulantLinkedin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        postulantLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postulantLinkedinMouseClicked(evt);
            }
        });

        postulantPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        postulantPhone.setText("CédulaPostulante");
        postulantPhone.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Postulantes:");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Buscar:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        seeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seekerActionPerformed(evt);
            }
        });

        seekerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seekerButton.setText("Buscar");
        seekerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seekerButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Resetear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        filterInterviews.setAutoCreateColumnsFromModel(false);
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
        filterInterviews.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        filterInterviews.setRowSelectionAllowed(false);
        filterInterviews.setRowSorter(null);
        jScrollPane3.setViewportView(filterInterviews);

        postulants.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        postulants.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                postulantsValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(postulants);

        jScrollPane2.setViewportView(postulantExperience);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(343, 343, 343))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(seeker, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(format)
                                            .addComponent(experience))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(linkedin)
                                            .addGap(17, 17, 17)))
                                    .addComponent(phone)
                                    .addComponent(adress)
                                    .addComponent(document)
                                    .addComponent(name)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(seekerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postulantName)
                            .addComponent(postulantAdress)
                            .addComponent(postulantDocument)
                            .addComponent(formatPostulant)
                            .addComponent(postulantLinkedin)
                            .addComponent(postulantMail)
                            .addComponent(postulantPhone)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(seeker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seekerButton)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(postulantName))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(document, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postulantDocument))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adress)
                            .addComponent(postulantAdress))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone)
                            .addComponent(postulantPhone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail)
                            .addComponent(postulantMail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(linkedin)
                            .addComponent(postulantLinkedin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(format)
                            .addComponent(formatPostulant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(experience)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        pack();
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
            if (s.getObservation().toUpperCase().contains(seek)) {
                r.add(s);
            }
        }
        System.out.println(r.size());
        setInterviews(r);
        
    }//GEN-LAST:event_seekerButtonActionPerformed

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

        filterInterviews.setModel((TableModel) modelThree);
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