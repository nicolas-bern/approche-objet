package tri;

import sets.Pays;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays pays1, Pays pays2) {
        if (pays1.getNbHbts() > pays2.getNbHbts()){
            return 1;
        } else {
            return -1;
        }
    }
}
