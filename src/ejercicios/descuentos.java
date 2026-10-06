package ejercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class descuentos {//
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        final double FRECUENTE = 0.10;//double para decimal
        final double VIP = 0.20;
        final int NORMAL = 0;
        final double ADICIONAL = 0.05;
        String nombre_cliente;
        int tipo_cliente;
        int monto_compra;
        double total = 0;
        System.out.println("ingrese su nombre:");
        nombre_cliente = sc.nextLine();
        System.out.println("ingrese el monto de compra");
        monto_compra = sc.nextInt();
        total = monto_compra;//para asignar 2 valores en este caso total del 5% y del monto puesto entonces puede tener 2 valores
        System.out.println("ingrese el tipo de cliente 1. cliente normal, 2. cliente frecuente y 3. cliente VIP");
        tipo_cliente = sc.nextInt();
        if (monto_compra > 2000) {
            total = monto_compra - (monto_compra * ADICIONAL);
            System.out.println("se le aplico un 5% de descuento:" + total);
        }
        if (tipo_cliente <= 1 && tipo_cliente > 0) {

        }
        if (tipo_cliente <= 2 && tipo_cliente > 1) {
            total =total - (total * FRECUENTE);

        }
        if (tipo_cliente <= 3 && tipo_cliente > 2) {
            total = total - (total * VIP);

        }

            System.out.println("monto original:" + monto_compra);

        if(monto_compra>2000) {
            System.out.println("descuento adicional:" + ADICIONAL+"%");

        }if (tipo_cliente<=2 && tipo_cliente>1){
            System.out.println("descuento por cliente frecuente:"+FRECUENTE+"%");
        }if (tipo_cliente<=3 && tipo_cliente>2) {
            System.out.println("descuento por VIP:"+VIP+"%");


        }
        System.out.println("total a pagar:"+total);
    }
}
