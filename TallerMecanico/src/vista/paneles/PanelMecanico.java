package vista.paneles;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Mecanico;
import static vista.Ventanas.VentanaPrincipal.archivoMecanico;
import static vista.Ventanas.VentanaPrincipal.centrarColumnas;
import static vista.paneles.PanelCamion.cmbMecanico2;
import static vista.paneles.PanelCamion.dtmCamion;
import static vista.paneles.PanelFamiliar.cmbMecanico;
import static vista.paneles.PanelFamiliar.dtmFamiliar;

public class PanelMecanico extends javax.swing.JPanel {

    public static Map<String, String> dataMecanicos = new HashMap();

    public static DefaultTableModel dtmMecanico;
    public static Object[] filaMecanico = new Object[3];

    boolean modificarMecanico = false;
    int filaSeleccionadaMecanico;

    public PanelMecanico() {
        initComponents();
        dtmMecanico = (DefaultTableModel) tablaMecanicos.getModel();

        centrarColumnas(tablaMecanicos);
        llenarTablaMecanico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosMecanicos = new javax.swing.JPanel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMecanicos = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnGuardarTrabajador = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnModificarTrabajador = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(910, 652));
        setLayout(new java.awt.BorderLayout());

        datosMecanicos.setBackground(new java.awt.Color(102, 102, 102));
        datosMecanicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Mecanicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 30), new java.awt.Color(0, 0, 0))); // NOI18N
        datosMecanicos.setMinimumSize(new java.awt.Dimension(0, 0));
        datosMecanicos.setPreferredSize(new java.awt.Dimension(910, 160));
        datosMecanicos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 15));

        cedula.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Placa.png"))); // NOI18N
        cedula.setText("Cedula");
        datosMecanicos.add(cedula);

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setPreferredSize(new java.awt.Dimension(130, 27));
        datosMecanicos.add(txtCedula);

        nombre.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        nombre.setText("Nombre");
        datosMecanicos.add(nombre);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 27));
        datosMecanicos.add(txtNombre);

        edad.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        edad.setText("Edad");
        datosMecanicos.add(edad);

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setPreferredSize(new java.awt.Dimension(130, 27));
        datosMecanicos.add(txtEdad);

        add(datosMecanicos, java.awt.BorderLayout.NORTH);

        tablaMecanicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaMecanicos);

        add(jScrollPane4, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(new java.awt.Color(102, 102, 102));
        panelBotones.setForeground(new java.awt.Color(102, 102, 102));
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 25));

        btnGuardarTrabajador.setBackground(new java.awt.Color(0, 153, 102));
        btnGuardarTrabajador.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnGuardarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarTrabajador.setText("Guardar");
        btnGuardarTrabajador.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGuardarTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarTrabajadorMouseClicked(evt);
            }
        });
        panelBotones.add(btnGuardarTrabajador);

        btnEliminarTrabajador.setBackground(new java.awt.Color(0, 153, 102));
        btnEliminarTrabajador.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnEliminarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarTrabajador.setText("Eliminar");
        btnEliminarTrabajador.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        panelBotones.add(btnEliminarTrabajador);

        btnModificarTrabajador.setBackground(new java.awt.Color(0, 153, 102));
        btnModificarTrabajador.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnModificarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarTrabajador.setText("Modificar");
        btnModificarTrabajador.setPreferredSize(new java.awt.Dimension(120, 40));
        btnModificarTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarTrabajadorMouseClicked(evt);
            }
        });
        panelBotones.add(btnModificarTrabajador);

        add(panelBotones, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarTrabajadorMouseClicked

        if (txtNombre.getText().isEmpty() || txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "LLenar los campos requeridos",
                    "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {

            if (modificarMecanico) {
                try {

                    tablaMecanicos.setValueAt(Integer.parseInt(txtEdad.getText()), filaSeleccionadaMecanico, 2);

                    String nombreCambiar = (String) tablaMecanicos.getValueAt(filaSeleccionadaMecanico, 1);
                    dataMecanicos.remove(nombreCambiar);
                    dataMecanicos.put(txtNombre.getText(), txtCedula.getText());

                    cmbMecanico.removeItem(nombreCambiar);
                    cmbMecanico.addItem(txtNombre.getText());
                    cmbMecanico2.removeItem(nombreCambiar);
                    cmbMecanico2.addItem(txtNombre.getText());

                    for (int i = 0; i < dtmFamiliar.getRowCount(); i++) {
                        if (dtmFamiliar.getValueAt(i, 6).equals(nombreCambiar)) {
                            dtmFamiliar.setValueAt(txtNombre.getText(), i, 6);
                        }
                    }

                    for (int i = 0; i < dtmCamion.getRowCount(); i++) {
                        if (dtmCamion.getValueAt(i, 6).equals(nombreCambiar)) {
                            dtmCamion.setValueAt(txtNombre.getText(), i, 6);
                        }
                    }

                    tablaMecanicos.setValueAt(txtNombre.getText(), filaSeleccionadaMecanico, 1);

                    Mecanico mecanico = new Mecanico(txtCedula.getText(),
                            txtNombre.getText(), Integer.parseInt(txtEdad.getText()));
                    archivoMecanico.actualizarMecanico(mecanico);

                    JOptionPane.showMessageDialog(this, "Modificación con exito",
                            "Modificación", JOptionPane.PLAIN_MESSAGE);

                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtEdad.setText("");

                    txtCedula.setEnabled(true);
                    modificarMecanico = false;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Edad invalida, debe ser númerica",
                            "Guardar", JOptionPane.WARNING_MESSAGE);
                }
            } else if (archivoMecanico.buscar(txtCedula.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Mecanico ya registrado", "Guardar", JOptionPane.WARNING_MESSAGE);
            } else {
                try {

                    Mecanico mecanico = new Mecanico(txtCedula.getText(),
                            txtNombre.getText(), Integer.parseInt(txtEdad.getText()));

                    if (archivoMecanico.buscar(mecanico.getCedula()) == null) {

                        filaMecanico[0] = txtCedula.getText();
                        filaMecanico[1] = txtNombre.getText();
                        filaMecanico[2] = Integer.parseInt(txtEdad.getText());

                        dtmMecanico.addRow(filaMecanico);
                        dataMecanicos.put(txtNombre.getText(), txtCedula.getText());

                        cmbMecanico.addItem(txtNombre.getText());
                        cmbMecanico2.addItem(txtNombre.getText());
                        archivoMecanico.guardarMecanico(mecanico);

                        txtNombre.setText("");
                        txtCedula.setText("");
                        txtEdad.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Trabajador ya registrado",
                                "Guardar", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Edad invalida, debe ser númerica",
                            "Guardar", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarTrabajadorMouseClicked

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        if (modificarMecanico) {
            JOptionPane.showMessageDialog(this, "Guarde los cambios antes de poder eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaMecanicos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sin trabajadores para eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaMecanicos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el trabajador a eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String nombreEliminar = (String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 1);
            boolean proceder = true;

            for (int i = 0; i < dtmFamiliar.getRowCount(); i++) {
                if (dtmFamiliar.getValueAt(i, 6).equals(nombreEliminar)) {
                    proceder = false;
                    break;
                }
            }

            if (proceder) {
                for (int i = 0; i < dtmCamion.getRowCount(); i++) {
                    if (dtmCamion.getValueAt(i, 6).equals(nombreEliminar)) {
                        proceder = false;
                        break;
                    }
                }
            }

            if (proceder) {
                
                String cedulaTrabajador = (String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 0);
                String nombreTrabajador = (String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 1);
                int edadTrabajador = (int) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 2);

                Mecanico trabajador = new Mecanico(cedulaTrabajador, nombreTrabajador, edadTrabajador);

                dataMecanicos.remove((String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 0));
                cmbMecanico.removeItem(trabajador.getNombre());
                cmbMecanico2.removeItem(trabajador.getNombre());
                dtmMecanico.removeRow(tablaMecanicos.getSelectedRow());
                archivoMecanico.eliminarMecanico(trabajador);

                JOptionPane.showMessageDialog(this, "eliminación con exito",
                        "Eliminar", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Mecanico ocupado, proceso no permitido",
                        "Eliminar", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnModificarTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarTrabajadorMouseClicked
        if (tablaMecanicos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay mecanicos registrados", "Modificar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaMecanicos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un mecanico a modificar", "Modificar", JOptionPane.WARNING_MESSAGE);
        } else {

            filaSeleccionadaMecanico = tablaMecanicos.getSelectedRow();
            txtCedula.setText((String) tablaMecanicos.getValueAt(filaSeleccionadaMecanico, 0));
            txtNombre.setText((String) tablaMecanicos.getValueAt(filaSeleccionadaMecanico, 1));
            txtEdad.setText(String.valueOf(tablaMecanicos.getValueAt(filaSeleccionadaMecanico, 2)));

            txtCedula.setEnabled(false);
            modificarMecanico = true;
        }
    }//GEN-LAST:event_btnModificarTrabajadorMouseClicked

    private void llenarTablaMecanico() {
        for (Mecanico mecanico : archivoMecanico.listarMecanicos()) {

            filaMecanico[0] = mecanico.getCedula();
            filaMecanico[1] = mecanico.getNombre();
            filaMecanico[2] = mecanico.getEdad();

            dataMecanicos.put(mecanico.getNombre(), mecanico.getCedula());
            cmbMecanico.addItem(mecanico.getNombre());
            cmbMecanico2.addItem(mecanico.getNombre());

            dtmMecanico.addRow(filaMecanico);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnGuardarTrabajador;
    private javax.swing.JButton btnModificarTrabajador;
    private javax.swing.JLabel cedula;
    private javax.swing.JPanel datosMecanicos;
    private javax.swing.JLabel edad;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTable tablaMecanicos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
