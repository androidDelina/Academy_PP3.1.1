package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static int carCount = 0;
    private List<Car> list;
    {
        list = new ArrayList<>();
        list.add(new Car(++carCount, "BMW", "X2", "Red"));
        list.add(new Car(++carCount, "BMW", "X3", "White"));
        list.add(new Car(++carCount, "BMW", "X3", "Blue"));
        list.add(new Car(++carCount, "BMW", "X4", "Black"));
        list.add(new Car(++carCount, "BMW", "X5", "Pink"));
    }

    @Override
    public List<Car> getNCars(int n) {
        return list.subList(0, n);
    }
}
