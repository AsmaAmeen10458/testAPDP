package code;

public class readcsv {
    String p_id;
    String name;
    String quantity;
    String price;

    public readcsv(String p_id, String name, String quantity, String price) {
        this.p_id = p_id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    
    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }
    
    
}
