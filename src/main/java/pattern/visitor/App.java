package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor pattern implementation practice
 */
public class App {

    public static void main(String[] args){

        List<ShopItem> itemList = new ArrayList<>();
        itemList.add(new Table("desk" , 20));
        itemList.add(new Table("desk2" , 15));
        itemList.add(new Chair("chair" , 10));
        itemList.add(new Chair("chair2" , 16));

        ShoppingCart cart = new ShoppingCart();

        double sum = 0;
        for (ShopItem item : itemList){
            sum += item.accept(cart);
        }

        System.out.print(sum);

    }
}
