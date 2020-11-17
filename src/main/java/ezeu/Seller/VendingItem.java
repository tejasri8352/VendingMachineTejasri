package ezeu.Seller;

public class VendingItem {
    private String itemname;
    private int price;
    private int quantity;

    public VendingItem(String itemname, int price, int quantity){
        super();
        this.itemname=itemname;
        this.price=price;
        this.quantity=quantity;
    }

    public VendingItem(VendingItem item){
        super();
        this.itemname=item.itemname;
        this.price=item.price;
        this.quantity=0;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "item name="+itemname+"  price ="+price+ "$  quantity:"+quantity+" \n";
    }
}

