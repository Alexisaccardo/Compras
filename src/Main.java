import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******** COMPRAS ********");
        double tipoA = 150000;
        double tipoB = 250000;

        System.out.print("Ingrese el objeto que desea adquirir (A o B): ");
        String tipo = scanner.nextLine();

        if (tipo.equals("tipoA")) {
            System.out.print("Ingrese la cantidad de objetos que vas a comprar: ");
            double cantidad = scanner.nextDouble();

            if (cantidad <= 0) {
                System.out.print(" la cantidad ingresada es invalida");

            } else {

                double valortotal = 0;
                valortotal = tipoA * cantidad;
                System.out.print("Su valor a pagar es: "+valortotal);
            }
            }
            else if (tipo.equals("tipoB")) {
                System.out.print("Ingrese la cantidad de objetos que vas a comprar: ");
                double cantidad2 = scanner.nextDouble();

                if (cantidad2 <= 0) {
                    System.out.print(" la cantidad ingresada es invalida");

                }

                double valortotal = 0;
                valortotal = tipoB * cantidad2;
                System.out.print("Su valor a pagar es: "+valortotal);


            }else {
                System.out.print("Solo se admiten objetos tipo A y tipo B");
        }
        }
    }

