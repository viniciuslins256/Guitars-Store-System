package Guitar;

public class Guitar {
    private String model, producer;
    private double price;
    private int type, status;

    public Guitar(String model, String producer, int type, double price, int status){
        this.model = model;
        this.producer = producer;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public String getProducer() {
        return this.producer;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusString() {
       if(this.status == 0){
            return "Novo";
        }
        else{
            return "Usado";
        }
    }

    public int getType() {
        return this.type;
    }

    public String getTypeString() {
        if(this.type == 0){
            return "Acústica";
        }
        else{
            return "Elétrica";
        }
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

}