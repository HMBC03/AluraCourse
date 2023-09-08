import javax.swing.*;

import static java.lang.Float.parseFloat;


public class ConversorMoneda extends Conversiones {

    public static void main(String[] args) {
        String opc;


        opc = JOptionPane.showInputDialog(null, "Seleccione la conversión", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Dolar a Pesos", "Pesos a Dolares"}, "Seleccion").toString();

        switch (opc) {
            case "Pesos a Dolar":
                cantidad = parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos a convertir"));
                JOptionPane.showMessageDialog(null, cantidad + " Pesos son: " + convertirPesos(cantidad) + " Dolares");
                break;
            case "Dolar a Pesos":
                cantidad = parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dolares a convertir"));
                JOptionPane.showMessageDialog(null, cantidad + " dolares son: " + convertirdolares(cantidad) + " Pesos");
                break;

        }


    }}
