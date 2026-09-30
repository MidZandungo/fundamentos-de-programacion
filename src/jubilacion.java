import java.util.Scanner;
public class jubilacion {//

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        final int edad_jubilacion=65;
        String nombre;
        int edad= 0 ;
        System.out.println("escribe tu nombre");
        nombre = sc .nextLine();
        System.out.println("escribe tu edad");
        edad = sc.nextInt();
        if (edad>=edad_jubilacion){// si
            System.out.print(nombre+"tiene"+edad+"años y esta listo para jubilarse");
        }
        else {//sino
            System.out.println(nombre+"tiene"+(edad_jubilacion-edad)+"años aun no se puede jubilar");
        }//fin si


    }

      }