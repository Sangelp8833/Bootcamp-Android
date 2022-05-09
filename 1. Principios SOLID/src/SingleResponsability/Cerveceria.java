package SingleResponsability;

import java.util.Scanner;

public class Cerveceria {

    // Responsabilidad única.
    // Una clase debería tener solamente una responsabilidad.
    // Mejor reutilización del código.
    // Falicidad para hacer pruebas unitarias.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Beer beer = new Beer();
        SendMessage mensaje = new SendMessage(beer);


        System.out.println("Nombre de la cerveza: ");
        beer.setName(scanner.next());
        scanner.nextLine();

        System.out.println("Marca de la cerveza: ");
        beer.setBrand(scanner.next());
        scanner.nextLine();

        System.out.println("Litros de la cerveza: ");
        beer.setLiters(scanner.nextInt());
        scanner.nextLine();

        mensaje.send();

    }
}
