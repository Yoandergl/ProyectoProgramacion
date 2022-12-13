package modelo;

public abstract class Coche {

    private String marca, matricula, aceite;
    private String poseedor;
    private String problema;
    private Mecanico mecanicoEncargado;
    private double costoReparacion;

    public Coche() {
    }

    public Coche(String marca, String matricula, String aceite, String poseedor, 
            String problema, Mecanico mecanicoEncargado) {
        this.marca = marca;
        this.matricula = matricula;
        this.aceite = aceite;
        this.poseedor = poseedor;
        this.problema = problema;
        this.mecanicoEncargado = mecanicoEncargado;
    }

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    public String getAceite() {return aceite;}
    public void setAceite(String aceite) {this.aceite = aceite;}

    public String getPoseedor() {return poseedor;}
    public void setPoseedor(String poseedor) {this.poseedor = poseedor;}

    public String getProblema() {return problema;}
    public void setProblema(String problema) {this.problema = problema;}
     
    public double getCostoReparacion() {return this.costoReparacion;}

    public Mecanico getMecanicoEncargado() {return mecanicoEncargado;}
    public void setMecanicoEncargado(Mecanico mecanicoEncargado) {
        this.mecanicoEncargado = mecanicoEncargado;
    }

    public void setCostoReparacion(){
        switch (this.problema) {
            case "Llenar llantas":
                this.costoReparacion = 4;
                break;
            case "Reparar cilindraje":
                this.costoReparacion = 700;
                break;
            default:
                this.costoReparacion = 200;
                break;
        }
    }
    
    public void imprimirDatos() {
        System.out.println("Marca: "+ this.marca);
        System.out.println("Matricula: "+ this.matricula);
        System.out.println("Problema: " + this.problema);
        System.out.println("Trabajador encargado: " + this.mecanicoEncargado.getNombre());
        System.out.println("Costo de la reparación: " + this.costoReparacion);
    }
    
    public abstract String getDataStringFormat();
}
