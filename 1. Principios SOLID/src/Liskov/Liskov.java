package Liskov;

public class Liskov {
    public static void main(String[] args) {

        Beer sinAlcohol = new BeerWithAlcohol("Corona", 0);
        sinAlcohol.PrintLabelName();
        sinAlcohol.PrintLabelAlcohol();

        sinAlcohol = new BeerWoAlcoholLabel("Corona", 0);
        sinAlcohol.PrintLabelName();
        sinAlcohol.PrintLabelAlcohol(); // Aquí va arrojar un error por un método que no existe violando el principio de Liskov (diferentes comportamientos ante la entidad cerveza).

        // Para solucionar este error lo que se puede hacer en crear otra clase abstracta que se llame "BeerWithAlcohol"
        // que implemente los mé todos para imprimir las etiquietas de alcohol.


    }
}
