package modelo;

public class Mecanico {

    private String nombre, cedula;
    private int edad;

    public Mecanico() {
    }

    public Mecanico(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() {return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    
    public void imprimirDatos() {
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de nacimiento: " + this.edad);
    }
    
    public String getDataStringFormat(){
        return "T;"+ this.nombre+ ";" + this.cedula + ";" + this.edad;
    }
}
