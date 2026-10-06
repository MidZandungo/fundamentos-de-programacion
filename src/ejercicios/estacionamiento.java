package ejercicios;

import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo_vehiculo = 0;
        int horas_estacionamiento = 0;
        final int MOTOCICLETA = 10;
        final int COCHE = 20;
        final int CAMIONETA = 30;
        double tarifa = 0;
        final double DESCUENTODIEZ = 0.10;
        final double DESCUENTOVEINTE = 0.20;
        double total = 0;
        int subtotal = 0;
        total = tarifa;
        System.out.println("ingrese su tipo de vehiculo: 1. motocicleta, 2. automóvil y 3. camioneta");
        tipo_vehiculo = sc.nextInt();
        System.out.println("ingrese cuantas estuvo en el estacionamiento");
        horas_estacionamiento = sc.nextInt();
        if (horas_estacionamiento <= 0) {
            System.out.println("las horas no son validas");
        }
        if (tipo_vehiculo >= 1 && tipo_vehiculo < 2) {
            tarifa = (horas_estacionamiento * COCHE);
        }
        if (tipo_vehiculo >= 2 && tipo_vehiculo < 3) {
            tarifa = (horas_estacionamiento * MOTOCICLETA);
        }
        if (tipo_vehiculo >= 3 && tipo_vehiculo < 4) {
            tarifa = (horas_estacionamiento * CAMIONETA);
        }
        if (horas_estacionamiento >= 5 && horas_estacionamiento < 10) {
            total = tarifa - (tarifa * DESCUENTODIEZ);
        } else if (horas_estacionamiento >= 10) {
            total = tarifa - (tarifa * DESCUENTOVEINTE);
        } else {
            total = tarifa;
        }

        if (tipo_vehiculo >= 1 && tipo_vehiculo < 2) {
            System.out.println("tipo de vehiculo: motocicleta");
        }
        if (tipo_vehiculo >= 2 && tipo_vehiculo < 3) {
            System.out.println("tipo de vehiculo: carro");
        }
        if (tipo_vehiculo >= 3 && tipo_vehiculo < 4) {
            System.out.println("tipo de vehiculo: camioneta");
            System.out.println("horas:" + horas_estacionamiento);
            if (tipo_vehiculo >= 1 && tipo_vehiculo < 2) {
                System.out.println("tarifa: 10");
            }
            if (tipo_vehiculo >= 2 && tipo_vehiculo < 3) {
                System.out.println("tarifa: 20");
            }
            if (tipo_vehiculo >= 3 && tipo_vehiculo < 4) {
                System.out.println("tarifa: 30");
            }
            System.out.println("subtotal:" + tarifa);
            if (horas_estacionamiento >= 5 && horas_estacionamiento < 10) {
                System.out.println("descuento: 10%");
            }

            if (horas_estacionamiento >= 10) {
                System.out.println("descuento: 20%");
            }


            System.out.println("total:" + total);

        }
    }
}
