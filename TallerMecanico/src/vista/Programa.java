package vista;

import com.formdev.flatlaf.FlatDarkLaf;

public class Programa {

    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }
}
