import java.util.Scanner;
public class aprovados {//

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int calificacion_final=0;
        System.out.println("escribe tu nombre");
        nombre = sc.nextLine();
        System.out.println("escribe tu calificacion final");
        calificacion_final= sc.nextInt();
        if (calificacion_final>=70){
            System.out.print(nombre+"usted aprobo");// &&
        }
        else {
            System.out.print(nombre+", usted reprobo");
        }


    }















}
