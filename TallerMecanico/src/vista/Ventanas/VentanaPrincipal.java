package vista.Ventanas;


import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.persistencia.ArchivoCoche;
import modelo.persistencia.ArchivoMecanico;
import vista.paneles.PanelCamion;
import vista.paneles.PanelFamiliar;
import vista.paneles.PanelMecanico;

public class VentanaPrincipal extends javax.swing.JFrame {

    //Datos de las tablas y los archivos
    public static ArchivoCoche archivoCoche = new ArchivoCoche();
    public static ArchivoMecanico archivoMecanico = new ArchivoMecanico();
    public static DefaultTableCellRenderer centrarColumna = new DefaultTableCellRenderer();

    private PanelFamiliar panelFamiliar;
    private PanelCamion panelCamion;
    private PanelMecanico panelMecanico;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        centrarColumna.setHorizontalAlignment(SwingConstants.CENTER);
        
        panelFamiliar = new PanelFamiliar();
        panelCamion = new PanelCamion();
        panelMecanico = new PanelMecanico();
        contenedorPaneles.add("Familiares", panelFamiliar);
        contenedorPaneles.add("Camiones",panelCamion);
        contenedorPaneles.add("Trabajadores", panelMecanico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPaneles = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(910, 519));

        contenedorPaneles.setBackground(new java.awt.Color(102, 102, 102));

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

    public static void centrarColumnas(JTable tabla) {
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrarColumna);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane contenedorPaneles;
    // End of variables declaration//GEN-END:variables
}
