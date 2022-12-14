package modelo;

import java.util.ArrayList;

public class Taller {
    
    private final ArrayList<Mecanico> trabajadores;
    private final ArrayList<Coche> coches;
    
    public Taller() {
        trabajadores = new ArrayList();
        coches = new ArrayList();
    }
    
    public void agregarTrabajador(Mecanico trabajador) {
        
        if(this.buscarTrabajador(trabajador.getNombre()) == null 
                || this.buscarTrabajador(trabajador.getCedula()) == null) {
            this.trabajadores.add(trabajador);
        }
    }
    public void agregarCoche(Coche coche) {
        
        if(this.buscarCoche(coche.getMatricula()) == null) {
            this.coches.add(coche);
        }
    }
    /*
    public double getFactura(String fecha) {
        
        double factura = 0;
        for(Coche coche: this.coches){
            
            if(coche.getFechaReparacion().equals(fecha)) {
                coche.setCostoReparacion();
                factura += coche.getCostoReparacion();
            }
        }
        return factura;
    }*/

    public ArrayList<Mecanico> getTrabajadores() {
        return trabajadores;
    }
    /*
    public ArrayList<Coche> getCoches(String fecha) {
        
        ArrayList<Coche> cochesFecha = new ArrayList();
        
        for(Coche coche: this.coches){
            
            if(coche.getFechaReparacion().equals(fecha)) {
                coche.setCostoReparacion();
                cochesFecha.add(coche);
            }
        }
        return cochesFecha;
    }*/
    
    public Mecanico buscarTrabajador(String data) {
        
        for(Mecanico trabajador: this.trabajadores) {
            if (trabajador.getNombre().equals(data) || trabajador.getCedula().equals(data)) {
                return trabajador;
            }
        }
        return null;
    }
    
    public Coche buscarCoche(String matriula) {
        for(Coche coche: this.coches) {
            if(coche.getMatricula().equals(matriula)) {
                return coche;
            }
        }
        return null;
    }
}
