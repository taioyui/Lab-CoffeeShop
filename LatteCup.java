package coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taioyui on 20/05/2017.
 */
public class LatteCup implements Cup {

    private Coffee coffee;

    public LatteCup(Coffee coffee) {
        this.coffee = coffee;
    }

    /**
     * Created by taioyui on 01/05/2017.
     */
    public static class CoffeeShop {
        public static void main(String args[]) {


            List<Cup> americanoCups = new Americano().pour(2);
            List<Cup> espressoCups = new Espresso().pour(3);
            List<Cup> latteCups = new Latte().pour(1);

            List<Cup> order = new ArrayList<Cup>();
            order.addAll(americanoCups);
            order.addAll(espressoCups);
            order.addAll(latteCups);

            System.out.println(";");
        }
    }
}
