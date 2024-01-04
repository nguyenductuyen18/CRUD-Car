package com.example.demo22.controller;

import com.example.demo22.model.Car;
import com.example.demo22.sevice.CarService;

import com.example.demo22.sevice.ICarSevice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")

public class CarController {
    private final ICarSevice carService = new CarService();
@GetMapping("")
    public String showCar(Model model){
    List<Car> car= carService.findAll();
    model.addAttribute("car",car);
    return "/index";
}
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("car",new Car());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Car car){
        car.setId((int) (Math.random() * 100));
        carService.add(car);
        return "redirect:/car";
    }

}
