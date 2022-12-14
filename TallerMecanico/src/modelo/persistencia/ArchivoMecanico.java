package modelo.persistencia;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Mecanico;

public class ArchivoMecanico extends Archivo {

    public ArchivoMecanico() {
        this("trabajadores.txt");
    }

    ;
    public ArchivoMecanico(String ruta) {
        super(ruta);
    }

    public Mecanico cargarDatos(String[] data) {
        String nombre = data[1];
        String cedula = data[2];
        int edad = Integer.parseInt(data[3]);

        return new Mecanico(cedula, nombre, edad);
    }

    public Mecanico buscar(String cedula) {
        Mecanico coche = null;

        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Mecanico tAux = this.cargarDatos(datos);

                if (tAux.getCedula().equals(cedula)) {
                    coche = tAux;
                    return coche;
                }
            }
        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "de la persona solicitada", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return coche;
    }

    public void guardarMecanico(Mecanico trabajador) {
        PrintWriter pw = null;
        try {
            this.wr = new FileWriter(this.archivo, true);
            pw = new PrintWriter(wr);

            if (trabajador == null) {
                pw.print("");
            } else {
                pw.println(trabajador.getDataStringFormat());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el trabajador", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public void eliminarMecanico(Mecanico trabajador) {
        ArchivoMecanico archivoTmp = new ArchivoMecanico("trabajadores.tpm");
        int i = 0;

        try {

            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {

                String datos[] = this.rd.nextLine().split(";");
                Mecanico tAux = this.cargarDatos(datos);

                if (!tAux.getCedula().equalsIgnoreCase(trabajador.getCedula())) {
                    archivoTmp.guardarMecanico(tAux);
                    i++;
                }
            }
            if (i == 0) {
                archivoTmp.guardarMecanico(null);
            }
            this.renombrarArchivo(archivoTmp.archivo);
            this.rd.close();

        } catch (FileNotFoundException ae) {

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el trabajador", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
    }

    public void actualizarMecanico(Mecanico trabajador) {
        this.eliminarMecanico(trabajador);
        this.guardarMecanico(trabajador);
    }

    public List<Mecanico> listarMecanicos() {
        
        List<Mecanico> listaMecanicos = new ArrayList();
        
        try {
            this.rd = new Scanner(this.archivo);
            while (this.rd.hasNext()) {
                String datos[] = this.rd.nextLine().split(";");
                Mecanico tAux = this.cargarDatos(datos);
                listaMecanicos.add(tAux);
            }
        } catch (FileNotFoundException ae) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo en busqueda "
                    + "de los trabajadores", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } finally {
            if (this.rd != null) {
                this.rd.close();
            }
        }
        return listaMecanicos;
    }
}
