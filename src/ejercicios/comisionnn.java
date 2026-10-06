package ejercicios;

import java.util.Scanner;

    public class comisionnn {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int saldo=0;
            int cantidad_retirar=0;
            final int COMISION=10;
            final int LIMITE_RETIRO=5000;
            int total=0;

            System.out.println("ingrese su saldo");
            saldo=sc.nextInt();
            System.out.println("ingrese la cantidad que quiera retirar");
            cantidad_retirar=sc.nextInt();
            if (cantidad_retirar<=0) {
                System.out.println("la cantidad que desea retirar debe ser mayor a 0");
            }
            else if (cantidad_retirar>LIMITE_RETIRO) {
                System.out.println("el limite para retirar debe ser menor a 5000");
            }
            else if (cantidad_retirar+COMISION>saldo) {
                System.out.println("fondos insuficientes");

            }
            else{
                int total_descontado=cantidad_retirar+COMISION;
                int saldo_final=saldo-total_descontado;
                System.out.println("retiro autorizado");
                System.out.println("saldo final:"+ saldo_final);
                System.out.println("comision:"+COMISION);
                System.out.println("monto retirado:"+cantidad_retirar);


            }
        }
        }


