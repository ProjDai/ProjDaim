 package com.example.Car.model;

public class Car {
   private Long carId;
   private String name;
   public Long getCarId() {
      return carId;
   }
   public void setCarId(Long carId) {
      this.carId = carId;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   @Override
   public String toString() {
      return "Car [carId=" + carId + ", name=" + name + "]";
   }
   
}
