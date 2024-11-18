package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "blue", "model1"));
        cars.add(new Car(2, "red", "model2"));
        cars.add(new Car(3, "yellow", "model3"));
        cars.add(new Car(4, "green", "model4"));
        cars.add(new Car(5, "black", "model5"));
    }

    @Override
    public List<Car> getSomeCarsFromList(int amount) {

        List<Car> someCars = cars.stream()
                .limit(amount)
                .collect(Collectors.toList());
        return someCars;
    }

}
