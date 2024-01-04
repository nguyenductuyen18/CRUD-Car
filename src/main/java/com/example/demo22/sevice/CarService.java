package com.example.demo22.sevice;

import com.example.demo22.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarService implements ICarSevice {
    private static Map<Integer, Car> car;
    static {
        car = new HashMap<>();
        car.put(1,new Car(1,"BMW",400000,"oto"));
    }
    @Override
    public List<Car> findAll() {
        return new ArrayList<>(car.values());
    }
}
