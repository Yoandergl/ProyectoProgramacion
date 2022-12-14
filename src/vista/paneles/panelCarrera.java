package vista.paneles;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Carrera;
import modelo.Coche;
import modelo.Mecanico;
import static vista.Ventanas.VentanaPrincipal.archivoCoche;
import static vista.Ventanas.VentanaPrincipal.archivoMecanico;
import static vista.Ventanas.VentanaPrincipal.centrarColumnas;
import static vista.paneles.PanelMecanico.dataMecanicos;

public class panelCarrera extends javax.swing.JPanel {

    public static DefaultTableModel dtmCarrera;
    private Object[] filaCarrera = new Object[8];
    private boolean modificar = false;
    private int filaSeleccionada;

    public panelCarrera() {
        initComponents();
        dtmCarrera = (DefaultTableModel) tablaCarrera.getModel();

        centrarColumnas(tablaCarrera);
        llenarTablaCarrera();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
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
        agencia = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        numMercncia = new javax.swing.JLabel();
        cmbMotor = new javax.swing.JComboBox<>();
        cmbProblemas = new javax.swing.JComboBox<>();
        cmbMecanico3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrera = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        datosCoche.setBackground(new java.awt.Color(102, 102, 102));
        datosCoche.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos coche carrera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 30), new java.awt.Color(0, 0, 0))); // NOI18N
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

        agencia.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        agencia.setForeground(new java.awt.Color(0, 0, 0));
        agencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Nombre.png"))); // NOI18N
        agencia.setText("Agencia");
        datosCoche.add(agencia);

        txtAgencia.setBackground(new java.awt.Color(255, 255, 255));
        txtAgencia.setForeground(new java.awt.Color(0, 0, 0));
        txtAgencia.setPreferredSize(new java.awt.Dimension(130, 27));
        datosCoche.add(txtAgencia);

        numMercncia.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        numMercncia.setForeground(new java.awt.Color(0, 0, 0));
        numMercncia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Llantas.png"))); // NOI18N
        numMercncia.setText("Estado del motor");
        datosCoche.add(numMercncia);

        cmbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Estable", "Riesgo", "Da??ado" }));
        datosCoche.add(cmbMotor);

        cmbProblemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Problema a resolver", "Llenar llantas", "Reparar cilindraje", "Pintar coche" }));
        cmbProblemas.setPreferredSize(new java.awt.Dimension(200, 27));
        datosCoche.add(cmbProblemas);

        cmbMecanico3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mec??nico asignado" }));
        cmbMecanico3.setPreferredSize(new java.awt.Dimension(200, 27));
        datosCoche.add(cmbMecanico3);

        add(datosCoche, java.awt.BorderLayout.NORTH);

        tablaCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matr??cula", "Marca", "Estado del aceite", "Due??o", "Estado del motor", "Problema", "Mec??nico", "Costo reparaci??n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tablaCarrera.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCarrera);

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

        if (cmbMecanico3.getItemCount() == 1) {
            JOptionPane.showMessageDialog(this, "No tienes trabajadores, si puedes registralos", "Informaci??n", JOptionPane.WARNING_MESSAGE);
        } else if (txtMatricula.getText().isEmpty() || txtMarca.getText().isEmpty()
                || cmbAceite.getSelectedIndex() == 0 || txtAgencia.getText().isEmpty()
                || cmbProblemas.getSelectedIndex() == 0 || cmbMotor.getSelectedIndex() == 0
                || cmbMecanico3.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Brinde toda la informaci??n pertinente", "Informaci??n", JOptionPane.WARNING_MESSAGE);
        } else {

            if (modificar) {

                tablaCarrera.setValueAt(txtMatricula.getText(), filaSeleccionada, 0);
                tablaCarrera.setValueAt(txtMarca.getText(), filaSeleccionada, 1);
                tablaCarrera.setValueAt(cmbAceite.getSelectedItem(), filaSeleccionada, 2);
                tablaCarrera.setValueAt(txtAgencia.getText(), filaSeleccionada, 3);
                tablaCarrera.setValueAt(cmbMotor.getSelectedItem(), filaSeleccionada, 4);
                tablaCarrera.setValueAt(cmbProblemas.getSelectedItem(), filaSeleccionada, 5);
                tablaCarrera.setValueAt(cmbMecanico3.getSelectedItem(), filaSeleccionada, 6);

                Mecanico mecanico = archivoMecanico.buscar(dataMecanicos.get((String) cmbMecanico3.getSelectedItem()));

                Coche cocheAtender = new Carrera(txtMarca.getText(), txtMatricula.getText(),
                        (String) cmbAceite.getSelectedItem(), (String) txtAgencia.getText(),
                        (String) cmbProblemas.getSelectedItem(), mecanico, (String) cmbMotor.getSelectedItem());
                cocheAtender.setCostoReparacion();

                tablaCarrera.setValueAt(cocheAtender.getCostoReparacion(), filaSeleccionada, 7);
                archivoCoche.actualizarCoche(cocheAtender);
                modificar = false;

                txtMatricula.setText("");
                txtMarca.setText("");
                cmbAceite.setSelectedIndex(0);
                txtAgencia.setText("");
                cmbMotor.setSelectedIndex(0);
                cmbProblemas.setSelectedIndex(0);
                cmbMecanico3.setSelectedIndex(0);

                txtMatricula.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Coche modificado", "Guardar", JOptionPane.PLAIN_MESSAGE);

            } else if (archivoCoche.buscar(txtMatricula.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Matricula ya registrada", "Guardar", JOptionPane.WARNING_MESSAGE);
            } else {
                Mecanico mecanico = archivoMecanico.buscar(dataMecanicos.get((String) cmbMecanico3.getSelectedItem()));

                Coche cocheAtender = new Carrera(txtMarca.getText(), txtMatricula.getText(),
                        (String) cmbAceite.getSelectedItem(), (String) txtAgencia.getText(),
                        (String) cmbProblemas.getSelectedItem(), mecanico, (String) cmbMotor.getSelectedItem());
                cocheAtender.setCostoReparacion();

                filaCarrera[0] = txtMatricula.getText();
                filaCarrera[1] = txtMarca.getText();
                filaCarrera[2] = (String) cmbAceite.getSelectedItem();
                filaCarrera[3] = txtAgencia.getText();
                filaCarrera[4] = (String) cmbMotor.getSelectedItem();
                filaCarrera[5] = cmbProblemas.getSelectedItem();
                filaCarrera[6] = cmbMecanico3.getSelectedItem();
                filaCarrera[7] = cocheAtender.getCostoReparacion();

                dtmCarrera.addRow(filaCarrera);
                archivoCoche.guardarCoche(cocheAtender);

                txtMatricula.setText("");
                txtMarca.setText("");
                cmbAceite.setSelectedIndex(0);
                txtAgencia.setText("");
                cmbMotor.setSelectedIndex(0);
                cmbProblemas.setSelectedIndex(0);
                cmbMecanico3.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Coche guardado", "Guardar", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        if (modificar) {
            JOptionPane.showMessageDialog(this, "Guarde los cambios para poder eliminar",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaCarrera.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tabla de los coches vacia",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else if (tablaCarrera.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un coche a eliminar",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else {
            String matriculaCamion = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 0);
            String marcaCamion = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 1);
            String aceiteCamion = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 2);
            String EmpresaCamion = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 3);
            String mercanciaE = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 4);
            String problema = (String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 5);

            Mecanico mecanicoEncargado = archivoMecanico.buscar(dataMecanicos.
                    get((String) tablaCarrera.getValueAt(tablaCarrera.getSelectedRow(), 6)));

            Coche carrera = new Carrera(marcaCamion, matriculaCamion, aceiteCamion, EmpresaCamion, problema, mecanicoEncargado, mercanciaE);
            dtmCarrera.removeRow(tablaCarrera.getSelectedRow());
            archivoCoche.eliminarCoche(carrera);

            JOptionPane.showMessageDialog(this, "Eliminaci??n con exito",
                    "Eliminar", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (tablaCarrera.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sin carros para modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE);
        } else if (tablaCarrera.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un carro a modificar",
                    "Modificar", JOptionPane.PLAIN_MESSAGE);
        } else {

            int fila = tablaCarrera.getSelectedRow();
            txtMatricula.setText((String) tablaCarrera.getValueAt(fila, 0));
            txtMarca.setText((String) tablaCarrera.getValueAt(fila, 1));
            cmbAceite.setSelectedItem((String) tablaCarrera.getValueAt(fila, 2));
            txtAgencia.setText((String) tablaCarrera.getValueAt(fila, 3));
            cmbMotor.setSelectedItem((String) tablaCarrera.getValueAt(fila, 4));
            cmbProblemas.setSelectedItem((String) tablaCarrera.getValueAt(fila, 5));
            cmbMecanico3.setSelectedItem((String) tablaCarrera.getValueAt(fila, 6));

            txtMatricula.setEnabled(false);
            filaSeleccionada = tablaCarrera.getSelectedRow();
            this.modificar = true;
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void llenarTablaCarrera() {
        for (Coche coche : archivoCoche.listarCoches()) {

            if (coche instanceof Carrera) {
                Carrera cocheCamion = (Carrera) coche;

                filaCarrera[0] = cocheCamion.getMatricula();
                filaCarrera[1] = cocheCamion.getMarca();
                filaCarrera[2] = cocheCamion.getAceite();
                filaCarrera[3] = cocheCamion.getPoseedor();
                filaCarrera[4] = cocheCamion.getMotor();
                filaCarrera[5] = cocheCamion.getProblema();
                filaCarrera[6] = cocheCamion.getMecanicoEncargado().getNombre();
                filaCarrera[7] = cocheCamion.getCostoReparacion();

                dtmCarrera.addRow(filaCarrera);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceite;
    private javax.swing.JLabel agencia;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbAceite;
    public static javax.swing.JComboBox<String> cmbMecanico3;
    private javax.swing.JComboBox<String> cmbMotor;
    private javax.swing.JComboBox<String> cmbProblemas;
    private javax.swing.JPanel datosCoche;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel numMercncia;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTable tablaCarrera;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
