package com.example.demo22.sevice;

import com.example.demo22.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarService implements ICarSevice {
    private static Map<Integer, Car> cars;
    static {
        cars = new HashMap<>();
        cars.put(1,new Car(1,"BMW",400000,"oto"));
    }
    @Override
    public List<Car> findAll() {
        return new ArrayList<>(cars.values());
    }
    @Override
    public void add(Car car){
cars.put(car.getId(),car);
    }

    @Override
    public Car findById(int id) {
        return cars.get(id);
    }

    @Override
    public void update(int id, Car car) {
        cars.put(id, car);

    }
}
