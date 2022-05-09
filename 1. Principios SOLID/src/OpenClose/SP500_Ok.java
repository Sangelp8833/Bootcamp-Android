package OpenClose;

public class SP500_Ok implements IActivoFinanciero{

    private Float OpenPrice;
    private Float ClosePrice;
    private Float MaxHisto;


    public Float getOpenPrice() {
        return OpenPrice;
    }

    public void setOpenPrice(Float openPrice) {
        OpenPrice = openPrice;
    }

    public Float getClosePrice() {
        return ClosePrice;
    }

    public void setClosePrice(Float closePrice) {
        ClosePrice = closePrice;
    }

    public Float getMaxHisto() {
        return MaxHisto;
    }

    public void setMaxHisto(Float maxHisto) {
        MaxHisto = maxHisto;
    }

    @Override
    public void EsHoraDeInvertir() {
        if ((this.getMaxHisto() - this.getClosePrice())/100 > 2){
            System.out.println("Es hora de invertir en el SP500");
        }else{
            System.out.println("Todavía no es hora de invetir");
        }
    }
}
