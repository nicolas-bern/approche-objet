package tri;

import sets.Pays;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

    @Override
    public int compare(Pays pays1, Pays pays2) {
        if (pays1.getPibHbts() > pays2.getPibHbts()){
            return 1;
        } else {
            return -1;
        }
    }
}
