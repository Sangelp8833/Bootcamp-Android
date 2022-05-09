package SingleResponsability;

public class Beer {

    private String name;
    private String brand;
    private Integer liters;

    public Beer(){

    }

    public Beer(String name, String brand, Integer liters){
        this.name = name;
        this.brand = brand;
        this.liters = liters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getLiters() {
        return liters;
    }

    public void setLiters(Integer liters) {
        this.liters = liters;
    }
}
