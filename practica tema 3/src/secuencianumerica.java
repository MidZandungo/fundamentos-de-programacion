import java.util.Scanner;

public class secuencianumerica {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int respuesta=0;
        do {
            int numero=0;
            int DIVISIBLE2=0;
            int MULTIPLO=0;
            int divisibleamb=0;
            int ambos=0;
            int contador_pares=0;
            int contador_impares=0;
            int contador_multiplos=0;
            System.out.println("Escriba un numero entero positivo:");
            numero = sc.nextInt();
            while (numero <= 0) {
                System.out.println("Debe ser mayor que cero:");
                numero = sc.nextInt();
                }
            for (int i = 1; i <= numero; i++) {
                if (i % 4 == 0) {
                    DIVISIBLE2 = DIVISIBLE2 + i;
                }
                if (i % 3 == 0) {
                    MULTIPLO = MULTIPLO + 1;
                }
                if (i % 4 == 0 && i % 3 == 0) {
                    ambos = ambos + 1;
                }
                if (i % 2 == 0) {
                    contador_pares = contador_pares + 1;
                } else {
                    contador_impares = contador_impares + 1;
                }
                if (i % 5 == 0) {
                    contador_multiplos = contador_multiplos + 1;
                }
            }
                System.out.println("suma de los divisibles entre 4:"+DIVISIBLE2);
                System.out.println("cantidad de multiplos de 3:"+MULTIPLO);
                System.out.println("divisibles entre 4 y 3a la vez:"+ambos);


                System.out.println("que estadistica desea ver?");
                System.out.println("1. numero pares");
                System.out.println("2. numeros impares");
                System.out.println("3. multiplos de 5");
                respuesta= sc.nextInt();
                switch (respuesta) {
                    case 1:
                        System.out.println("pares:"+contador_pares);
                        break;
                    case 2:
                        System.out.println("impares:"+contador_impares);
                        break;
                    case 3:
                        System.out.println("multiplos de 5:"+contador_multiplos);
                        break;
                    default:
                        System.out.println("opcion invalida");
                }

            System.out.println("desea repetir el analisis? 1)si 2)no");
                respuesta= sc.nextInt();
        }while(respuesta==1);



    }

}
