import java.util.Scanner;

public class numeroamigos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int respuesta=0;
        do {
            int numero1=0;
            final int MINIMO=0;
            int numero2=0;
            int suma1=0;
            int suma2=0;
            System.out.println("ingrese el primer numero");
            numero1= sc.nextInt();
            while (numero1<=0){
                System.out.println("el numero debe ser mayor a 0");
                numero1= sc.nextInt();
            }
            System.out.println("ingrese el segundo numero");
            numero2= sc.nextInt();
            while (numero2<=0){
                System.out.println("el numero debe de ser mayor a 0");
                numero2= sc.nextInt();
            }
            for (int i=1; i <numero1;i++){
                if (numero1%i==0){
                    suma1=suma1+i;
                }
            }
            for (int i=1; i<numero2;i++){
                if (numero2%i==0){
                    suma2=suma2+i;
                }
            }
            System.out.println("1. mostrar la suma");
            System.out.println("2. mostrara solo el resultado");
            respuesta= sc.nextInt();
            switch (respuesta){
                case 1:
                    System.out.println("suma 1: "+suma1);
                    System.out.println("suma 2: "+suma2);
                    if (numero1==suma2 && numero2==suma1){
                        System.out.println("los numeros son amigos");
                    }else{
                        System.out.println("los numeros non son amigos");
                    }
                    break;
                case 2:
                    if (numero1==suma2 && numero2==suma1){
                        System.out.println("los numeros son amigos");
                    }else{
                        System.out.println("los numeros non son amigos");
                    }
                    break;
                default:
                    System.out.println("opcion invalida");

            }

            System.out.println("desea hacer otra operacion? 1)si, 2)no");
            respuesta= sc.nextInt();
        }while (respuesta==1);













    }


}
