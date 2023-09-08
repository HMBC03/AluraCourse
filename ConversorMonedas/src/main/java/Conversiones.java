import javax.swing.*;

import static java.lang.Float.parseFloat;

public class Conversiones {
    static float cantidad;
    private static double dolar=4000;
    private double pesos;
    static double convertirPesos(double cantidad){
        cantidad/=dolar;
        return cantidad;
    }
    static double convertirdolares(double cantidad) {
        cantidad*=dolar;
        return cantidad;
    }




}
