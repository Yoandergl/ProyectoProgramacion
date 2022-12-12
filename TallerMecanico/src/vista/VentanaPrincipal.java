package vista;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Coche;
import modelo.Familiar;
import modelo.Mecanico;
import modelo.persistencia.ArchivoCoche;
import modelo.persistencia.ArchivoMecanico;

public class VentanaPrincipal extends javax.swing.JFrame {

    //Datos de las tablas y los archivos
    public static ArchivoCoche archivoCoche = new ArchivoCoche();
    public static ArchivoMecanico archivoMecanico = new ArchivoMecanico();
    Map<String, String> dataMecanicos = new HashMap();

    boolean modificar = false;
    boolean modificarMecanico = false;
    int filaSeleccionada, filaSeleccionadaMecanico;

    public static DefaultTableModel dtmMecanico;
    public static Object[] filaMecanico = new Object[3];

    public static DefaultTableModel dtmFamiliar;
    public static Object[] filaFamiliar = new Object[8];

    public static TableRowSorter filtro;
    public static DefaultTableCellRenderer centrarColumna = new DefaultTableCellRenderer();

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);

        centrarColumna.setHorizontalAlignment(SwingConstants.CENTER);
        dtmMecanico = (DefaultTableModel) tablaMecanicos.getModel();
        dtmFamiliar = (DefaultTableModel) tablaFamiliar.getModel();

        centrarColumnas(tablaFamiliar);
        centrarColumnas(tablaMecanicos);
        llenarTablaMecanico();
        llenarTablaFamiliar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPaneles = new javax.swing.JTabbedPane();
        panelFamiliar = new javax.swing.JPanel();
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
        paneltrabajadores = new javax.swing.JPanel();
        datosCoche3 = new javax.swing.JPanel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMecanicos = new javax.swing.JTable();
        panelBotones3 = new javax.swing.JPanel();
        btnGuardarTrabajador = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        btnModificarTrabajador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        contenedorPaneles.setBackground(new java.awt.Color(102, 102, 102));

        panelFamiliar.setLayout(new java.awt.BorderLayout());

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

        panelFamiliar.add(datosCoche, java.awt.BorderLayout.NORTH);

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

        panelFamiliar.add(jScrollPane1, java.awt.BorderLayout.CENTER);

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

        panelFamiliar.add(panelBotones, java.awt.BorderLayout.PAGE_END);

        contenedorPaneles.addTab("Familiar", panelFamiliar);

        paneltrabajadores.setLayout(new java.awt.BorderLayout());

        datosCoche3.setBackground(new java.awt.Color(102, 102, 102));
        datosCoche3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Mecanicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 30), new java.awt.Color(0, 0, 0))); // NOI18N
        datosCoche3.setMinimumSize(new java.awt.Dimension(0, 0));
        datosCoche3.setPreferredSize(new java.awt.Dimension(910, 160));
        datosCoche3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 15));

        cedula.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Placa.png"))); // NOI18N
        cedula.setText("Cedula");
        datosCoche3.add(cedula);

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche3.add(txtCedula);

        nombre.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        nombre.setText("Nombre");
        datosCoche3.add(nombre);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche3.add(txtNombre);

        edad.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        edad.setText("Edad");
        datosCoche3.add(edad);

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche3.add(txtEdad);

        paneltrabajadores.add(datosCoche3, java.awt.BorderLayout.NORTH);

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

        paneltrabajadores.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        panelBotones3.setBackground(new java.awt.Color(102, 102, 102));
        panelBotones3.setForeground(new java.awt.Color(102, 102, 102));
        panelBotones3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 25));

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
        panelBotones3.add(btnGuardarTrabajador);

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
        panelBotones3.add(btnEliminarTrabajador);

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
        panelBotones3.add(btnModificarTrabajador);

        paneltrabajadores.add(panelBotones3, java.awt.BorderLayout.PAGE_END);

        contenedorPaneles.addTab("Mecanicos", paneltrabajadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPaneles)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        if (modificarMecanico) {
            JOptionPane.showMessageDialog(this, "Guarde los cambios antes de poder eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaMecanicos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sin trabajadores para eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaMecanicos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione el trabajador a eliminar", "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else {

            String cedulaTrabajador = (String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 0);
            String nombreTrabajador = (String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 1);
            int edadTrabajador = (int) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 2);

            Mecanico trabajador = new Mecanico(cedulaTrabajador, nombreTrabajador, edadTrabajador);

            dataMecanicos.remove((String) tablaMecanicos.getValueAt(tablaMecanicos.getSelectedRow(), 0));
            cmbMecanico.removeItem(trabajador.getNombre());
            dtmMecanico.removeRow(tablaMecanicos.getSelectedRow());
            archivoMecanico.eliminarMecanico(trabajador);

            JOptionPane.showMessageDialog(this, "eliminación con exito",
                "Eliminar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void btnGuardarTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarTrabajadorMouseClicked

        if (txtNombre.getText().isEmpty() || txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "LLenar los campos requeridos",
                "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {

            if (modificarMecanico) {
                try {
                    tablaMecanicos.setValueAt(txtCedula.getText(), filaSeleccionadaMecanico, 0);
                    tablaMecanicos.setValueAt(txtNombre.getText(), filaSeleccionadaMecanico, 1);
                    tablaMecanicos.setValueAt(Integer.parseInt(txtEdad.getText()), filaSeleccionadaMecanico, 2);

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
            }
            else if(archivoMecanico.buscar(txtCedula.getText()) != null){
                JOptionPane.showMessageDialog(this,"Mecanico ya registrado", "Guardar", JOptionPane.WARNING_MESSAGE);
            }
            else {
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

    private void llenarTablaMecanico() {
        for (Mecanico mecanico : archivoMecanico.listarMecanicos()) {

            filaMecanico[0] = mecanico.getCedula();
            filaMecanico[1] = mecanico.getNombre();
            filaMecanico[2] = mecanico.getEdad();

            dataMecanicos.put(mecanico.getNombre(), mecanico.getCedula());
            cmbMecanico.addItem(mecanico.getNombre());
            dtmMecanico.addRow(filaMecanico);
        }
    }

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

    private void centrarColumnas(JTable tabla) {
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrarColumna);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceite;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarTrabajador;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarTrabajador;
    private javax.swing.JLabel cedula;
    private javax.swing.JComboBox<String> cmbAceite;
    private javax.swing.JComboBox<String> cmbMecanico;
    private javax.swing.JComboBox<String> cmbProblemas;
    private javax.swing.JTabbedPane contenedorPaneles;
    private javax.swing.JPanel datosCoche;
    private javax.swing.JPanel datosCoche3;
    private javax.swing.JLabel edad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotones3;
    private javax.swing.JPanel panelFamiliar;
    private javax.swing.JPanel paneltrabajadores;
    private javax.swing.JLabel poseedor;
    private javax.swing.JTable tablaFamiliar;
    private javax.swing.JTable tablaMecanicos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoseedor;
    private javax.swing.JTextField txtYearCompra;
    private javax.swing.JLabel yearCompra;
    // End of variables declaration//GEN-END:variables
}
