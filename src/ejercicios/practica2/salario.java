package ejercicios.practica2;

import java.util.Scanner;
public class salario {//
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre_del_empleado;
        int horas_trabajadas = 0;
        int horas_extra = 0;
        int pago_hora = 0;
        int salario_total = 0;
        final int HORAS_NORMALES = 40;
        System.out.println("nombre del empleado");
        nombre_del_empleado = sc.nextLine();
        System.out.println("horas trabajadas");
        horas_trabajadas = sc.nextInt();
        System.out.println("pago por hora");
        pago_hora = sc.nextInt();
        if (horas_trabajadas <= 40) {
            salario_total = horas_trabajadas * pago_hora;
            System.out.println("su ejercicios.practica2.salario total es de:" + salario_total);

        }
        if (horas_trabajadas > 40) {
            horas_extra = horas_trabajadas - 40;
            salario_total = (horas_extra * 2 *pago_hora) + (HORAS_NORMALES * pago_hora);
            System.out.println("su ejercicios.practica2.salario total es de:" + salario_total);


        }
        System.out.println("nombre:" + nombre_del_empleado);
        System.out.println("horas trabajadas:" + horas_trabajadas);
        System.out.println("pago por hora:" + pago_hora);
        System.out.println("horas normales:" + HORAS_NORMALES);
        System.out.println("horas extra:"+horas_extra);
        System.out.println("ejercicios.practica2.salario total:"+salario_total);
    }





    }

