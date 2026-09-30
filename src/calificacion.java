import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class calificacion {//
    public static void main  (String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int calificacion=0;
        System.out.println("escriba su nombre");
        nombre= sc.nextLine();
        System.out.println("escriba su calificacion");
        calificacion=sc.nextInt();
        if (calificacion<59){
            System.out.print(calificacion+", reprobado");
        } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("Suficiente");
        } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("bien");

        } else if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("muy bien");

        } else if (calificacion>=90 && calificacion<= 100) {
            System.out.println("excelente");
        }
    }
    }








