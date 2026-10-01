package ejercicios;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class calificaciones {//
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        int promedio=0;
        int calificacion_1 = 0;
        int calificacion_2 = 0;
        int calificacion_3 = 0;
        System.out.println("ponga la calificacion 1");
        calificacion_1 = sc.nextInt();
        System.out.println("ponga la calificacion 2");
        calificacion_2 = sc.nextInt();
        System.out.println("ponga la calificacion 3");
        calificacion_3 = sc.nextInt();
        promedio=(calificacion_1+calificacion_2+calificacion_3)/3;
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("el alumno esta aprobado");

        }else {
            System.out.println("el alumno esta reprobado");

        }
        if (calificacion_1< MINIMO_UNIDAD) {
            System.out.println("presentar recuperacion de la unidad 1");
        }
        if (calificacion_2< MINIMO_UNIDAD) {
            System.out.println("presentar recuperacion de la unidad 2");
        }
        if (calificacion_3< MINIMO_UNIDAD) {
            System.out.println("presentar recuperacion de la unidad 3");
        }

        System.out.println("calificacion 1:"+calificacion_1);
        System.out.println("calificacion 2:"+calificacion_2);
        System.out.println("calificacion 3:"+calificacion_3);
        System.out.println("promedio:"+promedio);
        if (promedio>= MINIMO_APROBATORIO){
            System.out.println("resultado final: aprobado");

        }else{
            System.out.println("resultado final: reprobado");
        }
        }

    }
