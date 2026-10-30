import java.util.Scanner;

public class competenciaresistencia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int respuesta=0;
        do {
            int cantidad_participantes=0;
            int distancia_recorrida=0;
            int total_participantes=0;
            final int RONDAS=5;
            int rondas=0;
            int distancia_total=0;
            int promedio=0;
            int bajo=0;
            int mayor_distancia=0;
            int mejor_participante=0;
            int medio=0;
            int alto =0;
            System.out.println("ingrese la cantidad de participantes");
            cantidad_participantes= sc.nextInt();
            while (cantidad_participantes<=0) {
                System.out.println("la cantidad de participantes debe de ser mayor a 0");
                cantidad_participantes = sc.nextInt();
            }
         for (int p=1;p<=cantidad_participantes;p++){
             for (int r=1;r<=RONDAS;r++){
                 System.out.println("participante: "+p+"-ronda:"+r+"-distancia: ");
                 distancia_recorrida= sc.nextInt();
                 total_participantes=total_participantes+distancia_recorrida;
                 distancia_total=distancia_total+distancia_recorrida;
                 mayor_distancia=total_participantes;
                 mejor_participante=p;
                 if (distancia_recorrida<2){
                     System.out.println("rendimiento bajo");
                  bajo++;
                 }
                 if (distancia_recorrida>=2 && distancia_recorrida<=4){
                     System.out.println("rendimiento medio");
                     medio++;
                 }
                 if(distancia_recorrida>4){
                     System.out.println("rendimiento alto");
                     alto++;
                 }
             }
         }
            System.out.println("total distancia: "+total_participantes);
            System.out.println("promedio por ronda: "+total_participantes/RONDAS);
            System.out.println("que estadistica desea ver?");
            System.out.println("1. rondas de cada categoria");
            System.out.println("2. la persona que mas distancia recorrio");
            respuesta= sc.nextInt();
            switch (respuesta){
                case 1:
                    System.out.println("rendimiento bajo: "+bajo);
                    System.out.println("rendimiento medio: "+medio);
                    System.out.println("rendimiento alto: "+alto);
                    break;
                case 2:
                    System.out.println("el mejor participante: "+mejor_participante+"-recorrio: "+mayor_distancia);

                default:
                    System.out.println("opcion invalida");

            }
            System.out.println("dese agregar otra competencia? 1)si 2)no ");
            respuesta= sc.nextInt();
        }while (respuesta==1);
    }
}
