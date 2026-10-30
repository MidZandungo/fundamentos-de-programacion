import java.util.Scanner;

public class ahorromensual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int respuestra=0;

        do {
            int cnatidad_inicial=0;
            int mtea_ahorro=0;
            int plazo=0;
            int ahorro_mensual=0;
            double saldo=0;
            double intereses=0;
            int mes_meta=0;
            final double INT=0.01;
            double total_inte=0;
            int meta=0;
            double saldo_total=0;
            saldo=cnatidad_inicial;
            System.out.println("ingrese su dinero actual");
            cnatidad_inicial=sc.nextInt();
            while (cnatidad_inicial<=0) {
                System.out.println("el numero debe ser mayor a 0");
                cnatidad_inicial= sc.nextInt();
            }
            System.out.println("ingrese su meta de ahorro");
            mtea_ahorro= sc.nextInt();
            while (mtea_ahorro<=0){
                System.out.println("el numero debe ser mayor a 0");
                mtea_ahorro= sc.nextInt();
            }
            System.out.println("ahorro mensual fijo");
            ahorro_mensual= sc.nextInt();
            while (ahorro_mensual<=0){
                System.out.println("el numero debe ser mayor a 0");
                ahorro_mensual= sc.nextInt();
            }
            System.out.println("ingrese el plazo que desea:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            respuestra= sc.nextInt();
                switch (respuestra){
                    case 1:
                        plazo=6;
                        break;
                    case 2:
                        plazo=12;
                        break;
                    case 3:
                        plazo=24;
                        break;
                    default:
                        System.out.println("ingrese otro numero");
                }
            for (int mes=1;mes<=plazo; mes++) {
                saldo = saldo + ahorro_mensual;
                intereses = saldo * INT;
                saldo = saldo + intereses;
                total_inte = total_inte + intereses;
                if (saldo>=mtea_ahorro && mes_meta==0){
                    mes_meta=mes;
                }
            }
            System.out.println("saldo final: "+saldo);
            System.out.println("intereses: "+total_inte);
                if (mes_meta>0) {
                    System.out.println("usted alcanzo la meta en el mes: "+mes_meta);
                }else{
                    System.out.println("usted no cumplio la meta");
                }

            System.out.println("desea correr otra meta? 1) si, 2)no");
                respuestra= sc.nextInt();
        }while (respuestra==1);
    }
}
