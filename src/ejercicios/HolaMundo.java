package ejercicios;

import java.util.Scanner;

/*
*
* INSTITUTO TECNOLOGICO DE PACHUCA
* FUNDAMENTOS DE PROGRAMACION
* EJERCICIO: HOLA MUNDO
* EMILIANO HERNANDEZ GOMEZ 2620
* EMIR PEREZ MENDOZA 26201147
* 23/09/2026*/

public class HolaMundo {

    public static void main() {

        String nombre;
        final String SALUDO = "Hola ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println(SALUDO + nombre); //IMPRIMIR NOMBRE

    }

} //FIN DE CLASE
