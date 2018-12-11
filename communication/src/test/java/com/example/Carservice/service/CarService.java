 package com.example.Carservice.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.Car.model.Car;

@Service
public class CarService {

   private static Map<Long, Car> carRepository = null;

   static {

      Stream<String> carStream = Stream.of("1,E320", "2,S500",
              "3,Swastika  Mitra");

      carRepository = carStream.map(carStr -> {
          String[] info = carStr.split(",");
          return createCar(new Long(info[0]), info[1]);
      }).collect(Collectors.toMap(Car::getCarId, car -> car));

   }

   private static Car createCar(Long id, String name) {
      Car car = new Car();
      car.setCarId(id);
      car.setName(name);
      return car;
   }

   public Car findById(Long id) {
      return CarRepository.get(id);
   }

   public Collection<Car> findAll() {
      return CarRepository.values();
   }

}

