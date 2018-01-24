package pattern.visitor;

public interface ShopItem {

    public double accept(ShoppingCartVisitor visitor);
}
