import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PadanguDatabase {

    public static void main(String[] args) {

        List<Padanga> padangos = new ArrayList<>();

        padangos.add(new Padanga("Toyo Snowprox s943", 37.42, 38.0, 152.0, 99.0));
        padangos.add(new Padanga("potatoTires", 40.2, 99.0, 174.0, 70.0));
        padangos.add(new Padanga("tiresPotato", 64.0, 140.0, 159.0, 30.0));
        padangos.add(new Padanga("potatoTires", 71.1, 200.0, 177.0, 20.0));
        padangos.add(new Padanga("potatoTires", 69.9, 273.0, 200.0, 90.0));
        padangos.add(new Padanga("Sudgume", 25.0, 100.0, 199.0, 50.0));
        padangos.add(new Padanga("potatoTires", 96.5, 50.0, 193.0, 70.0));
        padangos.add(new Padanga("Kormoran", 44.0, 130.0, 210.0, 50.0));
        padangos.add(new Padanga("potatoTires", 20.0, 202.0, 149.0, 20.0));
        padangos.add(new Padanga("potatoTires", 39.0, 73.0, 157.0, 50.0));
        padangos.add(new Padanga("WestLake", 74.2, 173.0, 183.0, 14.0));


        Collections.sort(padangos, new ComparatorByPrice());

        for (Padanga p: padangos) {
            System.out.println(p);
        }

    }
}


