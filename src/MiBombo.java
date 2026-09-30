import java.util.Scanner;
public class MiBombo {
    /*
    *
    * INSTITUTO TECNOLOGICO DE PACHUCA
    * FUNDAMENTOS DE PROGRAMACION
    * EJERCICIO: ESCUELA
    * EMILIANO HERNANDEZ GOMEZ - 2620
    * EMIR PEREZ MENDOZA - 26201147
    * */
    static void main() { // datos
        String nombre;
        String apellido;
        String edad;
        String carrera;
        String semestre;
        String promedio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = sc.nextLine();
        System.out.println("Escribe tu apellido");
        apellido = sc.nextLine();
        System.out.println("Escribe tu edad");
        edad = sc.nextLine();
        System.out.println("Escribe tu carrera");
        carrera = sc.nextLine();
        System.out.println("Escribe tu semestre");
        semestre = sc.nextLine();
        System.out.println("Escribe tu promedio");
        promedio = sc.nextLine();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ edad);
        System.out.println("Carrera:"+ carrera);
        System.out.println("Semestre: "+ semestre);
        System.out.println("Promedio: "+ promedio);
    }//fin de datos
}
