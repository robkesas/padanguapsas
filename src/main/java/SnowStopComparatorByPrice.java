import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SnowStopComparatorByPrice implements Comparator<Padanga> {


            @Override
            public int compare(Padanga o1, Padanga o2) {

                return Double.compare(o1.getStopSnow()/ o1.getKaina(), o2.getStopSnow()/ o2.getKaina());
            }


    }


