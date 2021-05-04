package design_patterns.structural.adapter;

import design_patterns.structural.adapter.car.*;
import design_patterns.structural.adapter.jet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        //Create cars & use car adapter to make car interface as machine
        List<Car> cars = getCars();
        List<CarAdapter> carAdapters = new ArrayList<>();
        for (Car car : cars) {
            CarAdapter newCarAdapter = new CarAdapter(car);
            carAdapters.add(newCarAdapter);
        }


        //Create jets & use jet adapter to make jet interface as machine
        List<Jet> jets = getJets();
        List<JetAdapter> jetAdapters = new ArrayList<>();
        for (Jet jet : jets) {
            JetAdapter newJetAdapter = new JetAdapter(jet);
            jetAdapters.add(newJetAdapter);
        }


        //Call operate method on each element of adapter list
        startMachineOperation(carAdapters, jetAdapters);
    }

    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Ferrari());
        cars.add(new Mercedes());
        cars.add(new Tesla());
        return cars;
    }

    public static List<Jet> getJets() {
        List<Jet> jets = new ArrayList<>();
        jets.add(new F16());
        jets.add(new F22());
        jets.add(new MIG35());
        jets.add(new SU35());
        return jets;
    }

    public static void startMachineOperation(List<?>... lists) {
        for (int i = 0; i < lists.length; i++) {
            List<Machine> machines = (List<Machine>) lists[i];
            for (Machine machine : machines)
                LOGGER.info(machine.operate());
        }
    }

}
