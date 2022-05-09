package SingleResponsability;

public class SendMessage {

    private Beer beer;

    public SendMessage(Beer beer){
        this.beer = beer;
    }

    public void send(){
        System.out.println("Buenas noticias!!! \nAcabamos de lanzar una nueva cerveza" +
                "\n Nombre: " + beer.getName() +
                "\n Marca: " + beer.getBrand() +
                "\n Litros: " + beer.getLiters() +
                "\nYa disponible por tan solo" + " 1200" + " COP"); // Aquí se puede agregar a la clase beer el precio de la cerveza.
    }

}
