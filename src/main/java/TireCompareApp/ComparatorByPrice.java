import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorByPrice implements Comparator<Padanga> {


            @Override
            public int compare(Padanga o1, Padanga o2) {

                if (Double.compare (o1.getStopWet() / o1.getKaina(), (o2.getStopWet() / o2.getKaina())) > 0)
                {

                    return (int) (o1.getStopWet() / o1.getKaina());

                }
                if (Double.compare (o1.getStopDry() / o1.getKaina(), (o2.getStopDry() / o2.getKaina())) > 0)
                {

                    return (int) (o1.getStopDry() / o1.getKaina());

                }


                return Double.compare(o1.getStopSnow() / o1.getKaina(), o2.getStopSnow() / o2.getKaina());
            }


}

