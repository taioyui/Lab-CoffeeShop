package coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taioyui on 20/05/2017.
 */
public class Americano extends Coffee {

    public Americano() {
        super();
        water = water + 100;
    }

    @Override
    public List<Cup> pour(int qnt) {
        List<Cup> cups = new ArrayList<Cup>();
        for (int i = 1; i <= qnt; i++) {
            cups.add(new BigCup(this));
        }
        return cups;
    }
}
