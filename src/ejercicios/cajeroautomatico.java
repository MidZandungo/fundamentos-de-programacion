package ejercicios;

import java.util.Scanner;

public class cajeroautomatico {//
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int saldo=0;
        int limite_retiro=500;
        int cantidad =0;
        final int LIMITE_RETIRO=5000;// constante se escribe con mayusculas
        System.out.println("escriba su ejercicios.practica2.salario disponible");
        saldo=sc.nextInt();
        System.out.println("cantidad que desea retirar");
        cantidad = sc.nextInt();
        if (cantidad <=0){
            System.out.println("error, debe de ser mayor a cero la cantidad");
        }
        if (cantidad >limite_retiro){
            System.out.println("no puede retirar esa cantidad de dinero intente nuevamente");

        } else if (cantidad >saldo) {
            System.out.println("fondos insuficientes");
        }else  {
            saldo = saldo - cantidad;
            System.out.println("retiro autorizado, efectibo entregado: " + cantidad);
            System.out.println("saldo restante:" + saldo);
            if (saldo<500)
                System.out.println("su saldo es menor a 500");


        }


    }





    }
