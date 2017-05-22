package coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taioyui on 20/05/2017.
 */
public class Latte extends Coffee {

    private int milk;

    public Latte() {
        super();
        milk=50;

    }

    @Override
    public List<Cup> pour (int qnt) {
        List<Cup> cups = new ArrayList<Cup>();
        for (int i = 1; i<=qnt; i++){
            cups.add(new LatteCup(this));
        }
        return cups;
    }
}
