package vista.paneles;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Coche;
import modelo.Familiar;
import modelo.Mecanico;
import static vista.Ventanas.VentanaPrincipal.archivoCoche;
import static vista.Ventanas.VentanaPrincipal.archivoMecanico;
import static vista.paneles.PanelMecanico.dataMecanicos;

public class PanelFamiliar extends javax.swing.JPanel {

    public static DefaultTableModel dtmFamiliar;
    private Object[] filaFamiliar = new Object[8];
    boolean modificar = false;
    int filaSeleccionada;

    public PanelFamiliar() {
        initComponents();
        dtmFamiliar = (DefaultTableModel) tablaFamiliar.getModel();
        llenarTablaFamiliar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosCoche = new javax.swing.JPanel();
        matricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        aceite = new javax.swing.JLabel();
        cmbAceite = new javax.swing.JComboBox<>();
        poseedor = new javax.swing.JLabel();
        txtPoseedor = new javax.swing.JTextField();
        yearCompra = new javax.swing.JLabel();
        txtYearCompra = new javax.swing.JTextField();
        cmbProblemas = new javax.swing.JComboBox<>();
        cmbMecanico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFamiliar = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        datosCoche.setBackground(new java.awt.Color(102, 102, 102));
        datosCoche.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos coche familiar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 30), new java.awt.Color(0, 0, 0))); // NOI18N
        datosCoche.setMinimumSize(new java.awt.Dimension(0, 0));
        datosCoche.setPreferredSize(new java.awt.Dimension(910, 250));
        datosCoche.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 15));

        matricula.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        matricula.setForeground(new java.awt.Color(0, 0, 0));
        matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Placa.png"))); // NOI18N
        matricula.setText("Matricula");
        datosCoche.add(matricula);

        txtMatricula.setBackground(new java.awt.Color(255, 255, 255));
        txtMatricula.setForeground(new java.awt.Color(0, 0, 0));
        txtMatricula.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(txtMatricula);

        marca.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        marca.setForeground(new java.awt.Color(0, 0, 0));
        marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Marca.png"))); // NOI18N
        marca.setText("Marca");
        datosCoche.add(marca);

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(txtMarca);

        aceite.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        aceite.setForeground(new java.awt.Color(0, 0, 0));
        aceite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/aceite.png"))); // NOI18N
        aceite.setText("Aceite");
        datosCoche.add(aceite);

        cmbAceite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Bueno", "Reemplazar" }));
        cmbAceite.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(cmbAceite);

        poseedor.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        poseedor.setForeground(new java.awt.Color(0, 0, 0));
        poseedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        poseedor.setText("Dueño");
        datosCoche.add(poseedor);

        txtPoseedor.setBackground(new java.awt.Color(255, 255, 255));
        txtPoseedor.setForeground(new java.awt.Color(0, 0, 0));
        txtPoseedor.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(txtPoseedor);

        yearCompra.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        yearCompra.setForeground(new java.awt.Color(0, 0, 0));
        yearCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Llantas.png"))); // NOI18N
        yearCompra.setText("Año de compra");
        datosCoche.add(yearCompra);

        txtYearCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtYearCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtYearCompra.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(txtYearCompra);

        cmbProblemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Problema a resolver", "Llenar llantas", "Reparar cilindraje", "Pintar coche" }));
        cmbProblemas.setPreferredSize(new java.awt.Dimension(200, 27));
        datosCoche.add(cmbProblemas);

        cmbMecanico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecánico asignado" }));
        cmbMecanico.setPreferredSize(new java.awt.Dimension(200, 27));
        datosCoche.add(cmbMecanico);

        add(datosCoche, java.awt.BorderLayout.NORTH);

        tablaFamiliar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Marca", "Estado del aceite", "Dueño", "Año de compra", "Problema", "Mecánico", "Costo reparación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFamiliar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaFamiliar);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelBotones.setBackground(new java.awt.Color(102, 102, 102));
        panelBotones.setForeground(new java.awt.Color(102, 102, 102));
        panelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 25));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 102));
        btnGuardar.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        panelBotones.add(btnGuardar);

        btnEliminar.setBackground(new java.awt.Color(0, 153, 102));
        btnEliminar.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelBotones.add(btnEliminar);

        btnModificar.setBackground(new java.awt.Color(0, 153, 102));
        btnModificar.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        panelBotones.add(btnModificar);

        add(panelBotones, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        if (cmbMecanico.getItemCount() == 1) {
            JOptionPane.showMessageDialog(this, "No tienes trabajadores, si puedes registralos", "Información", JOptionPane.WARNING_MESSAGE);
        } else if (txtMatricula.getText().isEmpty() || txtMarca.getText().isEmpty()
                || cmbAceite.getSelectedIndex() == 0 || txtPoseedor.getText().isEmpty()
                || cmbProblemas.getSelectedIndex() == 0 || cmbMecanico.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Brinde toda la información pertinente", "Información", JOptionPane.WARNING_MESSAGE);
        } else {

            if (modificar) {

                try {

                    tablaFamiliar.setValueAt(txtMatricula.getText(), filaSeleccionada, 0);
                    tablaFamiliar.setValueAt(txtMarca.getText(), filaSeleccionada, 1);
                    tablaFamiliar.setValueAt(cmbAceite.getSelectedItem(), filaSeleccionada, 2);
                    tablaFamiliar.setValueAt(txtPoseedor.getText(), filaSeleccionada, 3);
                    tablaFamiliar.setValueAt(Short.parseShort(txtYearCompra.getText()), filaSeleccionada, 4);
                    tablaFamiliar.setValueAt(cmbProblemas.getSelectedItem(), filaSeleccionada, 5);
                    tablaFamiliar.setValueAt(cmbMecanico.getSelectedItem(), filaSeleccionada, 6);

                    Mecanico mecanico = archivoMecanico.buscar(dataMecanicos.get((String) cmbMecanico.getSelectedItem()));

                    Coche cocheAtender = new Familiar(txtMarca.getText(), txtMatricula.getText(),
                            (String) cmbAceite.getSelectedItem(), (String) txtPoseedor.getText(),
                            (String) cmbProblemas.getSelectedItem(), mecanico, Short.parseShort(txtYearCompra.getText()));
                    cocheAtender.setCostoReparacion();

                    tablaFamiliar.setValueAt(cocheAtender.getCostoReparacion(), filaSeleccionada, 7);
                    archivoCoche.actualizarCoche(cocheAtender);
                    modificar = false;

                    txtMatricula.setText("");
                    txtMarca.setText("");
                    cmbAceite.setSelectedIndex(0);
                    txtPoseedor.setText("");
                    txtYearCompra.setText("");
                    cmbProblemas.setSelectedIndex(0);
                    cmbMecanico.setSelectedIndex(0);

                    txtMatricula.setEnabled(true);
                    JOptionPane.showMessageDialog(this, "Coche modificado", "Guardar", JOptionPane.PLAIN_MESSAGE);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Año ingresado es invalido", "Guardar", JOptionPane.WARNING_MESSAGE);
                }
            } else if (archivoCoche.buscar(txtMatricula.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Matricula ya registrada", "Guardar", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    Mecanico mecanico = archivoMecanico.buscar(dataMecanicos.get((String) cmbMecanico.getSelectedItem()));

                    Coche cocheAtender = new Familiar(txtMarca.getText(), txtMatricula.getText(),
                            (String) cmbAceite.getSelectedItem(), (String) txtPoseedor.getText(),
                            (String) cmbProblemas.getSelectedItem(), mecanico, Short.parseShort(txtYearCompra.getText()));
                    cocheAtender.setCostoReparacion();

                    filaFamiliar[0] = txtMatricula.getText();
                    filaFamiliar[1] = txtMarca.getText();
                    filaFamiliar[2] = (String) cmbAceite.getSelectedItem();
                    filaFamiliar[3] = txtPoseedor.getText();
                    filaFamiliar[4] = Integer.parseInt(txtYearCompra.getText());
                    filaFamiliar[5] = cmbProblemas.getSelectedItem();
                    filaFamiliar[6] = cmbMecanico.getSelectedItem();
                    filaFamiliar[7] = cocheAtender.getCostoReparacion();

                    dtmFamiliar.addRow(filaFamiliar);
                    archivoCoche.guardarCoche(cocheAtender);

                    txtMatricula.setText("");
                    txtMarca.setText("");
                    cmbAceite.setSelectedIndex(0);
                    txtPoseedor.setText("");
                    txtYearCompra.setText("");
                    cmbProblemas.setSelectedIndex(0);
                    cmbMecanico.setSelectedIndex(0);

                    JOptionPane.showMessageDialog(this, "Coche guardado", "Guardar", JOptionPane.PLAIN_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Año ingresado es invalido", "Guardar", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        if (modificar) {
            JOptionPane.showMessageDialog(this, "Guarde los cambios para poder eliminar",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaFamiliar.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabla de los coches vacia",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaFamiliar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un coche a eliminar",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else {
            String matriculaFamiliar = (String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 0);
            String marcaFamiliar = (String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 1);
            String aceiteFamiliar = (String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 2);
            String poseedorFamiliar = (String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 3);
            short yearCompraE = Short.parseShort(String.valueOf(tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 4)));
            String problema = (String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 5);

            Mecanico mecanicoEncargado = archivoMecanico.buscar(dataMecanicos.
                    get((String) tablaFamiliar.getValueAt(tablaFamiliar.getSelectedRow(), 6)));

            Coche familiar = new Familiar(marcaFamiliar, matriculaFamiliar, aceiteFamiliar, poseedorFamiliar, problema, mecanicoEncargado, yearCompraE);
            dtmFamiliar.removeRow(tablaFamiliar.getSelectedRow());
            archivoCoche.eliminarCoche(familiar);

            JOptionPane.showMessageDialog(this, "Eliminación con exito",
                    "Eliminar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (tablaFamiliar.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sin carros para modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE);
        } else if (tablaFamiliar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un carro a modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE);
        } else {
            int fila = tablaFamiliar.getSelectedRow();
            txtMatricula.setText((String) tablaFamiliar.getValueAt(fila, 0));
            txtMarca.setText((String) tablaFamiliar.getValueAt(fila, 1));
            cmbAceite.setSelectedItem((String) tablaFamiliar.getValueAt(fila, 2));
            txtPoseedor.setText((String) tablaFamiliar.getValueAt(fila, 3));
            txtYearCompra.setText(String.valueOf(tablaFamiliar.getValueAt(fila, 4)));
            cmbProblemas.setSelectedItem((String) tablaFamiliar.getValueAt(fila, 5));
            cmbMecanico.setSelectedItem((String) tablaFamiliar.getValueAt(fila, 6));

            txtMatricula.setEnabled(false);
            filaSeleccionada = tablaFamiliar.getSelectedRow();
            this.modificar = true;
        }
    }//GEN-LAST:event_btnModificarMouseClicked
    
    private void llenarTablaFamiliar() {
        for (Coche coche : archivoCoche.listarCoches()) {

            if (coche instanceof Familiar) {
                Familiar cocheFamiliar = (Familiar) coche;

                filaFamiliar[0] = cocheFamiliar.getMatricula();
                filaFamiliar[1] = cocheFamiliar.getMarca();
                filaFamiliar[2] = cocheFamiliar.getAceite();
                filaFamiliar[3] = cocheFamiliar.getPoseedor();
                filaFamiliar[4] = cocheFamiliar.getYearCompra();
                filaFamiliar[5] = cocheFamiliar.getProblema();
                filaFamiliar[6] = cocheFamiliar.getMecanicoEncargado().getNombre();
                filaFamiliar[7] = cocheFamiliar.getCostoReparacion();

                dtmFamiliar.addRow(filaFamiliar);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceite;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbAceite;
    public static javax.swing.JComboBox<String> cmbMecanico;
    private javax.swing.JComboBox<String> cmbProblemas;
    private javax.swing.JPanel datosCoche;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel matricula;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JLabel poseedor;
    private javax.swing.JTable tablaFamiliar;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPoseedor;
    private javax.swing.JTextField txtYearCompra;
    private javax.swing.JLabel yearCompra;
    // End of variables declaration//GEN-END:variables
}
