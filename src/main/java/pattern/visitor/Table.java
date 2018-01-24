package pattern.visitor;

public class Table implements ShopItem{

    private String type;
    private double price;

    public Table(String type , double price){
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
