package Liskov;

public class BeerWithAlcohol extends Beer{

    public BeerWithAlcohol(String name, Integer Alcohol){
        this.name = name;
        this.alcohol = Alcohol;
    }

    @Override
    public void PrintLabelName() {
            System.out.println("Nombre de la cerveza: " + name); ;
    }

    @Override
    public void PrintLabelAlcohol() {
        System.out.println("Alcohol: " + alcohol + "%");;
    }
}
