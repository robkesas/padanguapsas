import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Padanga> padangos = new ArrayList<>();

        padangos.add(new Padanga("Toyo Snowprox s943", 37.42, 100.00, 152.0, 50.0));
        padangos.add(new Padanga("potatoTires", 40.2, 100.0, 174.0, 50.0));
        padangos.add(new Padanga("tiresPotato", 64.0, 100.0, 159.0, 50.0));
        padangos.add(new Padanga("potatoTires", 71.1, 100.0, 177.0, 50.0));
        padangos.add(new Padanga("potatoTires", 69.9, 100.0, 200.0, 50.0));
        padangos.add(new Padanga("Sudgume", 25.0, 100.0, 199.0, 50.0));
        padangos.add(new Padanga("potatoTires", 96.5, 100.0, 193.0, 50.0));
        padangos.add(new Padanga("Kormoran", 44.0, 100.0, 210.0, 50.0));
        padangos.add(new Padanga("potatoTires", 20.0, 100.0, 149.0, 50.0));
        padangos.add(new Padanga("potatoTires", 39.0, 100.0, 157.0, 50.0));
        padangos.add(new Padanga("WestLake", 74.2, 100.0, 183.0, 50.0));


        Collections.sort(padangos, new SnowStopComparatorByPrice());

        for (Padanga p: padangos) {
            System.out.println(p);
        }

    }
}


