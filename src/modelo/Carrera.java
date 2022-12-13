package modelo;

public class Carrera extends Coche{

    private String motor;

    public Carrera() {
    }

    public Carrera(String marca, String matricula, String aceite, String poseedor, 
            String problema, Mecanico mecanicoEncargado, String motor) {
        super(marca, matricula, aceite, poseedor, problema, mecanicoEncargado);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    @Override
    public double getCostoReparacion() {
        if(this.motor.equals("dañado")){
            return super.getCostoReparacion() + 10000;
            
        }else{
            return super.getCostoReparacion();
        }
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Agencia: " + this.getPoseedor());
        System.out.println("Estado del motor el día de la reparación: " + this.motor);
    }

    @Override
    public String getDataStringFormat() {
        return "CR;"+ this.getMatricula()+ ";" + this.getMarca()+ ";" + this.getAceite() + 
                ";" + this.getPoseedor() + ";" + this.getProblema() + ";" + this.getMecanicoEncargado().getCedula()
                + ";" + this.motor;
    }
}
