/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiPrograma_Empleados;
//import trabajo_Herencia_proyecto.Empleado;
import trabajo_Herencia_proyecto.Empleado_Planilla;
//import trabajo_Herencia_proyecto.Empleado_Recibo;
/**
 *
 * @author User
 */
public class guiPlanilla extends javax.swing.JFrame {

    /**
     * Creates new form guiPlanilla
     */
    public guiPlanilla() {
        initComponents();
           // Maximar formulario 
        setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null); // para centrar dentro de la panatalla la aplicacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        buttonAeroRound1 = new org.edisoncor.gui.button.ButtonAeroRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        txtName = new org.edisoncor.gui.textField.TextField();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtApellidos = new org.edisoncor.gui.textField.TextField();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        txtDni = new org.edisoncor.gui.textField.TextField();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        txtDireccion = new org.edisoncor.gui.textField.TextField();
        txtEdad = new org.edisoncor.gui.textField.TextField();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        txtAñosExperiencias = new org.edisoncor.gui.textField.TextField();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        txtHorasTraba = new org.edisoncor.gui.textField.TextField();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        txtPagoHora = new org.edisoncor.gui.textField.TextField();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        txtNumHijos = new org.edisoncor.gui.textField.TextField();
        labelMetric11 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnSalir = new org.edisoncor.gui.button.ButtonAction();
        comboBoxeEstudios = new org.edisoncor.gui.comboBox.ComboBoxRound();
        btnLimpiar = new org.edisoncor.gui.button.ButtonAction();
        btnVolverMenu1 = new org.edisoncor.gui.button.ButtonAction();
        rbAFP = new javax.swing.JRadioButton();
        rbOnp = new javax.swing.JRadioButton();
        clockFace2 = new org.edisoncor.gui.varios.ClockFace();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jcMousePanel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ttt.jpg"))); // NOI18N

        labelHeader1.setText("PLANILLA EMPLEADO:");
        labelHeader1.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N

        buttonAeroRound1.setBackground(new java.awt.Color(0, 102, 102));
        buttonAeroRound1.setText("PROCESAR");
        buttonAeroRound1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        buttonAeroRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAeroRound1ActionPerformed(evt);
            }
        });

        labelMetric1.setText("Nombres: ");
        labelMetric1.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric2.setText("Apellidos: ");
        labelMetric2.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric3.setText("Cedula:");
        labelMetric3.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric4.setText("Dirección:");
        labelMetric4.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric5.setText("Edad:");
        labelMetric5.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric6.setText("Estudios:");
        labelMetric6.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 24)); // NOI18N

        labelMetric7.setText("Años de Experiencias: ");
        labelMetric7.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N

        labelMetric8.setText("Horas Trabajadas:");
        labelMetric8.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N

        labelMetric9.setText("Pago por hora:");
        labelMetric9.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N

        labelMetric10.setText("Pension:");
        labelMetric10.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N

        labelMetric11.setText("N° de Hijos:");
        labelMetric11.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N

        txtReporte.setColumns(20);
        txtReporte.setRows(5);
        jScrollPane1.setViewportView(txtReporte);

        btnSalir.setBackground(new java.awt.Color(102, 0, 102));
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalir.setText("SALIR");
        btnSalir.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        comboBoxeEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Universitario", "Tecnico" }));
        comboBoxeEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxeEstudiosActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolverMenu1.setBackground(new java.awt.Color(102, 0, 102));
        btnVolverMenu1.setText("VOLVER MENU");
        btnVolverMenu1.setColorDeSombra(new java.awt.Color(102, 0, 102));
        btnVolverMenu1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnVolverMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenu1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAFP);
        rbAFP.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        rbAFP.setForeground(new java.awt.Color(255, 255, 255));
        rbAFP.setText(" AFP 1.5%");

        buttonGroup1.add(rbOnp);
        rbOnp.setFont(new java.awt.Font("Arial Narrow", 1, 17)); // NOI18N
        rbOnp.setForeground(new java.awt.Color(255, 255, 255));
        rbOnp.setText("ONP 2.5%");

        labelCustom1.setText("HORA");
        labelCustom1.setFont(new java.awt.Font("Californian FB", 1, 22)); // NOI18N

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMetric2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMetric1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxeEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                        .addComponent(rbAFP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbOnp, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonAeroRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnVolverMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNumHijos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(txtPagoHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHorasTraba, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAñosExperiencias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAñosExperiencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHorasTraba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAFP)
                            .addComponent(rbOnp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxeEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jcMousePanel2Layout.createSequentialGroup()
                                .addComponent(buttonAeroRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnVolverMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jcMousePanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clockFace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void buttonAeroRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAeroRound1ActionPerformed
     Empleado_Planilla e = new Empleado_Planilla(txtName.getText(),txtApellidos.getText(),txtDni.getText(),txtDireccion.getText(), 
                         Integer.parseInt(txtEdad.getText()),comboBoxeEstudios.getSelectedItem().toString()
                         , Integer.parseInt(txtAñosExperiencias.getText()),Integer.parseInt(txtHorasTraba.getText())
                         ,Integer.parseInt(txtPagoHora.getText()) ,Integer.parseInt(txtNumHijos.getText()), rbAFP.getText(),rbOnp.getText());
    
     txtReporte.append(e.imprimirBoletaPago());
     
     
    
    }//GEN-LAST:event_buttonAeroRound1ActionPerformed

    private void comboBoxeEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxeEstudiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxeEstudiosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       controlEditable();
    }//GEN-LAST:event_formWindowOpened

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     this.txtName.setText(" ");
     this.txtApellidos.setText(" ");
     this.txtAñosExperiencias.setText(" ");
     this.txtDireccion.setText(" ");
     this.txtDni.setText(" ");
     this.txtEdad.setText(" ");
     this.txtHorasTraba.setText(" ");
     this.txtNumHijos.setText(" ");
     this.txtPagoHora.setText(" ");
     this.txtReporte.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenu1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        guiSistema_empleados_menu m = new guiSistema_empleados_menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVolverMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(guiPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiPlanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction btnLimpiar;
    private org.edisoncor.gui.button.ButtonAction btnSalir;
    private org.edisoncor.gui.button.ButtonAction btnVolverMenu1;
    private org.edisoncor.gui.button.ButtonAeroRound buttonAeroRound1;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.edisoncor.gui.varios.ClockFace clockFace2;
    private org.edisoncor.gui.comboBox.ComboBoxRound comboBoxeEstudios;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric11;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    private javax.swing.JRadioButton rbAFP;
    private javax.swing.JRadioButton rbOnp;
    private org.edisoncor.gui.textField.TextField txtApellidos;
    private org.edisoncor.gui.textField.TextField txtAñosExperiencias;
    private org.edisoncor.gui.textField.TextField txtDireccion;
    private org.edisoncor.gui.textField.TextField txtDni;
    private org.edisoncor.gui.textField.TextField txtEdad;
    private org.edisoncor.gui.textField.TextField txtHorasTraba;
    private org.edisoncor.gui.textField.TextField txtName;
    private org.edisoncor.gui.textField.TextField txtNumHijos;
    private org.edisoncor.gui.textField.TextField txtPagoHora;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables

    private void controlEditable() {
     this.txtName.setEditable(true);
     this.txtApellidos.setEditable(true);
     this.txtAñosExperiencias.setEditable(true);
     this.txtDireccion.setEditable(true);
     this.txtDni.setEditable(true);
     this.txtEdad.setEditable(true);
     this.txtHorasTraba.setEditable(true);
     this.txtNumHijos.setEditable(true);
     this.txtPagoHora.setEditable(true);
     this.txtReporte.setEditable(false);
    }

 
}
