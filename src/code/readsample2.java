package code;


public class readsample2 {

    String TransactionID;
    String CustomerID;
    String ProductID;
    String ProductName;
    String Quantity;
    String PriceperUnit;
    String Date;
    String TotalPrice;
    String Region;

    public readsample2(String TransactionID, String CustomerID, String ProductID, String ProductName, String Quantity, String PriceperUnit, String Date, String TotalPrice, String Region) {
        this.TransactionID = TransactionID;
        this.CustomerID = CustomerID;
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.PriceperUnit = PriceperUnit;
        this.Date = Date;
        this.TotalPrice = TotalPrice;
        this.Region = Region;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPriceperUnit() {
        return PriceperUnit;
    }

    public void setPriceperUnit(String PriceperUnit) {
        this.PriceperUnit = PriceperUnit;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

}
