package code;

public class view_data_code {
   String p_id;
   String name;
   String quanity;
   String price;

   public view_data_code(String p_id, String name, String quanity, String price) {
        this.p_id = p_id;
        this.name = name;
        this.quanity = quanity;
        this.price = price;
    }
   
    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
   
   
}
