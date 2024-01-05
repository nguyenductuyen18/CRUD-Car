package com.example.demo22.sevice;

import com.example.demo22.model.Car;

import java.util.List;

public interface ICarSevice {
    public abstract List<Car> findAll();

    void add(Car addCar);

    Object findById(int id);

    void update(int id, Car car);



    void delete(int id);
}



