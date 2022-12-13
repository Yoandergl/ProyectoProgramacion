package modelo.persistencia;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Camion;
import modelo.Carrera;
import modelo.Coche;
import modelo.Familiar;
import modelo.Mecanico;
import vista.Ventanas.VentanaPrincipal;

public class ArchivoCoche extends Archivo {

    public ArchivoCoche() {
        this("coches.txt");
    }

    public ArchivoCoche(String ruta) {
        super(ruta);
    }

    public Coche cargarDatos(String[] data) {

        Coche coche;

        String matricula = data[1];
        String marca = data[2];
        String aceite = data[3];
        String poseedor = data[4];
        String problema = data[5];
        Mecanico trabajadorEncargado = VentanaPrincipal.archivoMecanico.buscar(data[6]);

        switch (data[0]) {
            case "F":

                short yearCompra = Short.parseShort(data[7]);
                coche = (Familiar) new Familiar(marca, matricula, aceite, poseedor,
                        problema, trabajadorEncargado, yearCompra);
                coche.setCostoReparacion();
                return coche;

            case "CM":

                int mercancia = Integer.parseInt(data[7]);
                coche = new Camion(marca, matricula, aceite, poseedor,
                        problema, trabajadorEncargado, mercancia);
                coche.setCostoReparacion();
                return coche;

            default:

                String motor = data[8];
                coche = new Carrera(marca, matricula, aceite, poseedor,
                        problema, trabajadorEncargado, motor);
                return coche;
        }
    }

    public Coche buscar(String matricula) {
        Coche coche = null;

        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Coche cAux = this.cargarDatos(datos);

                if (cAux.getMatricula().equals(matricula)) {
                    coche = cAux;
                    return coche;
                }
            }
        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "del coche solicitado", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return coche;
    }

    public void guardarCoche(Coche coche) {
        PrintWriter pw = null;
        try {
            this.wr = new FileWriter(this.archivo, true);
            pw = new PrintWriter(wr);

            if (coche == null) {
                pw.print("");
            } else {
                pw.println(coche.getDataStringFormat());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el coche", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public void eliminarCoche(Coche coche) {
        ArchivoCoche archivoTmp = new ArchivoCoche("coches.tpm");
        int i = 0;

        try {

            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {

                String datos[] = this.rd.nextLine().split(";");
                Coche cAux = this.cargarDatos(datos);

                if (!cAux.getMatricula().equalsIgnoreCase(coche.getMatricula())) {
                    archivoTmp.guardarCoche(cAux);
                    i++;
                }
            }
            if (i == 0) {
                archivoTmp.guardarCoche(null);
            }
            this.renombrarArchivo(archivoTmp.archivo);
            this.rd.close();

        } catch (FileNotFoundException ae) {

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar en el archivo", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
    }

    public void actualizarCoche(Coche coche) {
        this.eliminarCoche(coche);
        this.guardarCoche(coche);
    }

    public List<Coche> listarCoches() {
        List<Coche> listaCoches = new ArrayList();
        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Coche cAux = this.cargarDatos(datos);
                listaCoches.add(cAux);
            }
        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "de los coches solicitados", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return listaCoches;
    }
}
