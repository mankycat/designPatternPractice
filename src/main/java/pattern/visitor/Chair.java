package pattern.visitor;

public class Chair implements ShopItem{

    private String type;
    private double price;

    public Chair(String type , double price){
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
