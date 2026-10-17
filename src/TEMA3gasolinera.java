import java.util.Scanner;

public class TEMA3gasolinera {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int cargas=0;
        int litros_cargados=0;
        double importe=0;
        int precio_litro=0;
        final double CUARENTA_LI=0.05;
        final int CUARENTA=40;
        int total_litros=0;
        int litros_vendidos=0;
        int antes_descuento=0;
        double total_cobrado=0;
        int importe_promedio=0;
        int continuar=0;
        double importe_antes=0;
        do{
            System.out.println("litros cargados:");
            litros_cargados=sc.nextInt();
            System.out.println("precio por litro: ");
            precio_litro=sc.nextInt();
            if (litros_cargados<=0 && precio_litro<=0) {
                System.out.println("los litros y el precio deben de ser mayores a 0");
            }else{
                importe=litros_cargados*precio_litro;
                importe_antes=importe_antes+importe;
                cargas=cargas+1;
            }
            if (litros_cargados>=CUARENTA) {
                importe=importe-(importe*CUARENTA_LI);
                antes_descuento=antes_descuento+1;
                System.out.println("se aplico un descuento del 5%");
                cargas=cargas+1;

            }
            total_litros=total_litros+litros_cargados;
            total_cobrado=total_cobrado+importe;


            System.out.println("desea terminar el registro? 1) si 2)no");
            continuar= sc.nextInt();

        }while (continuar==2);

        System.out.println("total litros vendidos: "+total_litros);
        System.out.println("cargas: "+cargas);
        System.out.println("total: "+total_cobrado);
        System.out.println("cargas que recibieron descuento:"+antes_descuento);
        System.out.println("importe antes del descuento:"+importe_antes);
        System.out.println("importe promedio de cargas:"+(total_cobrado/cargas));












    }
}
