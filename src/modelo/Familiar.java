package modelo;

public class Familiar extends Coche{
    
    private short yearCompra;

    public Familiar() {
    }

    public Familiar(String marca, String matricula, String aceite, String poseedor, 
            String problema, Mecanico mecanicoEncargado, short yearCompra) {
        super(marca, matricula, aceite, poseedor, problema, mecanicoEncargado );
        this.yearCompra = yearCompra;
    }

    public short getYearCompra() {
        return yearCompra;
    }

    public void setYearCompra(short yearCompra) {
        this.yearCompra = yearCompra;
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Dueño: " + this.getPoseedor());
        System.out.println("Año de compra: " + this.yearCompra);
    }

    @Override
    public String getDataStringFormat() {
        return "F;"+ this.getMatricula()+ ";" + this.getMarca()+ ";" + this.getAceite() + 
                ";" + this.getPoseedor() + ";" + this.getProblema() + ";" + this.getMecanicoEncargado().getCedula()
                + ";" + this.yearCompra;
    }
}
