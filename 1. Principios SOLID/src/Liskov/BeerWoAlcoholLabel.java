package Liskov;

public class BeerWoAlcoholLabel extends Beer{

    public BeerWoAlcoholLabel(String name, Integer alcohol){
        this.name = name;
        this.alcohol = alcohol;
    }

    @Override
    public void PrintLabelName() {
        System.out.println("Nombre: " + name);
    }

    @Override
    public void PrintLabelAlcohol() {
        throw new Error();
    }
}
