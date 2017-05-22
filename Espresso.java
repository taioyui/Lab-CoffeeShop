package coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taioyui on 20/05/2017.
 */
public class Espresso extends Coffee {

    public Espresso() {
        super();
    }

    @Override
    public List<Cup> pour (int qnt) {
        List<Cup> cups = new ArrayList<Cup>();
        for (int i = 1; i<=qnt; i++){
            cups.add(new SmallCup(this));
        }
        return cups;
    }
}
