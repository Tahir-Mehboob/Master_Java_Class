package com.amigoscode.organize_the_code.car;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Car implements Serializable {
    private CarBrand brand;
    private BigDecimal price;

    public Car(CarBrand brand, BigDecimal price) {
        this.brand = brand;
        this.price = price;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand == car.brand && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", price=" + price +
                '}';
    }
}
