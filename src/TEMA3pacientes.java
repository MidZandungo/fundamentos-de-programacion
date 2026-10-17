import java.util.Scanner;

public class TEMA3pacientes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            int niños = 0;
            int adolecentes = 0;
            int adultos = 0;
            int adultosMatores = 0;
            double dineroTtotal = 0;
            double descuentoTotal = 0;
            int totalPacientes = 0;
            String respuesta = "si";
            while (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Ingresa la edad del paciente: ");
                int edad = scanner.nextInt();
                System.out.println("Ingresa el costo de la consulta: ");
                double costo = scanner.nextDouble();
                double descuento = 0;
                if (edad < 12) {
                    niños++;
                    System.out.println("Categoria: Niño");
                }else if (edad >= 12 && edad <= 17) {
                    adolecentes++;
                    System.out.println("Categoria: Adolecentes");
                }else if (edad >= 18 && edad <= 59) {
                    adultos++;
                    System.out.println("Categoria: Adultos");
                }else {
                    adultosMatores++;
                    descuento = costo * 0.15;
                    costo = costo - descuento;
                    System.out.println("Categoria: Adultos Mayores");
                }
                dineroTtotal += costo;
                descuentoTotal += descuento;
                totalPacientes++;
                System.out.println("Registrar otro paciente: (Si/No): ");
                respuesta = scanner.next();
            }
            System.out.println("REPORTE FINAL");
            System.out.println("Total de niños: " + niños);
            System.out.println("Total de adolecentes: " + adolecentes);
            System.out.println("Total de adultos: " + adultos);
            System.out.println("Total de adultos mayores: " + adultosMatores);
            System.out.println("Dinero recaudado: $" + dineroTtotal);
            System.out.println("Descuentos aplicados: $" + descuentoTotal);
            if (totalPacientes > 0){
                double promedio = dineroTtotal/totalPacientes;
                System.out.println("Promedio pagado por paciente: $" + promedio);
            }else{
                System.out.println("No se registro ningun paciente.");
            }
            scanner.close();
        }
    }


