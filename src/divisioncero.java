import java.io.OutputStream;
import java.util.Scanner;

public class divisioncero {//

    public static void main(String[] args) {
        try {// para los errores


            Scanner sc = new Scanner(System.in);
            int a, b, c;// c=a/b
            String n=null;// asignar el null
            System.out.println("valor a");
            a = sc.nextInt();
            System.out.println("valor b");
            b = sc.nextInt();
            //dividir
            c = a / b;
            System.out.println("c = " + c);;
        }catch (ArithmeticException ae ){// cachar ese error y mostrar q no se puede, siempre es arimthetic excepcion
            System.out.println("no puedes divir por 0");
        }catch (NullPointerException np){//null__se pone asi
            System.out.println("estas manejando mal un null");

        }finally {//para cerrar los catch y el try
            System.out.println("me ejecutar siempre");
        }



    }

    }

