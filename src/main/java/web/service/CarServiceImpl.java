package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 585, 7000000));
        cars.add(new Car("Audi", 640, 6500000));
        cars.add(new Car("Lada", 105, 850000));
        cars.add(new Car("Honda", 280, 1450000));
        cars.add(new Car(")Nissan", 280, 2000000));
    }
    @Override
    public List<Car> getCarsList(Integer count) {
        return  cars.stream().limit(count).toList();
    }
}
