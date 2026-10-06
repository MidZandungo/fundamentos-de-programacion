import java.util.InputMismatchException;
import java.util.Scanner;

public class nullCalificaciones {
    public static void main(String[] args) {
        try {
        Scanner sc=new Scanner(System.in);
        double calificacion_1=0;// DOUBLE SOLO SIRVE PARA INGRESAR NUMERO Y NO LETRAS
        double calificacion_2=0;
        double calificacion_3=0;
        double promedio=0;
            System.out.println("ingrese la calificacion 1");
            calificacion_1=sc.nextDouble();
            System.out.println("ingrese calificacion 2");
            calificacion_2=sc.nextDouble();
            System.out.println("ingrese su calificacion 3");
            calificacion_3=sc.nextDouble();
            promedio=(calificacion_1+calificacion_2+calificacion_3)/3;
            System.out.println("su calificacion final es:"+promedio);

        }catch (InputMismatchException me){//hacerlo correr el programa y el primer error pegar en cacth
            System.out.println("No es valido");
        }
    }
    }

