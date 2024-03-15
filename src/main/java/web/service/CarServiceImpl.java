package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(Integer count) {
        List<Car> listCar = new ArrayList<>();

        listCar.add(new Car("RAM", "black", 123));
        listCar.add(new Car("Dodge", "white", 134));
        listCar.add(new Car("Renault", "grey", 135));
        listCar.add(new Car("Volga", "yellow", 136));
        listCar.add(new Car("Chevrolet", "redCherry", 1325));

        if (count != null && count >= 1 && count < 5) {
            return listCar.subList(0, count);
        }
        return listCar;
    }
}