package modelo;

public class Camion extends Coche{
    private int mercancia;

    public Camion() {
    }

    public Camion(String marca, String matricula, String aceite, String poseedor, 
            String problema, Mecanico mecanicoEncargado, int cantMercancia) {
        super(marca, matricula, aceite, poseedor, problema, mecanicoEncargado);
        this.mercancia = cantMercancia;
    }

    public int getMercancia() {
        return mercancia;
    }

    public void setMercancia(int mercancia) {
        this.mercancia = mercancia;
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Empresa: " + this.getPoseedor());
        System.out.println("Cantidad de la mercancia: "
                + "el día de ingreso al taller: " + this.mercancia);
    }

    @Override
    public String getDataStringFormat() {
        return "CA;"+ this.getMatricula()+ ";" + this.getMarca()+ ";" + this.getAceite() + 
                ";" + this.getPoseedor() + ";" + this.getProblema() + ";" + this.getMecanicoEncargado().getCedula()
                + ";" + this.mercancia;
    }
}
