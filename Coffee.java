package coffee;

import java.util.List;

/**
 * Created by taioyui on 20/05/2017.
 */
public abstract class Coffee {
    int water;
    int beans;

    public Coffee() {
        this.water = 50;
        this.beans = 10;
    }

    public abstract List<Cup> pour(int qnt) throws CloneNotSupportedException;
}
