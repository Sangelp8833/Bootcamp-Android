package OpenClose;

public class Nasdaq100 {
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
}
