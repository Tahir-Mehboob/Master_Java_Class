package com.amigoscode.cli_project.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Cars {

    // fields
    private String Brand;
    private String regNum;
    private BigDecimal rentalPricePerDay;
    private boolean isElectric;

    //constructor
    public Cars(){
    }

   public Cars(String brand, String regNum, BigDecimal rentalPricePerDay, boolean isElectric) {
        this.Brand = brand;
        this.regNum = regNum;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isElectric = isElectric;
    }

    // getter and setter

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getRegNumn() {
        return regNum;
    }

    public void setRegNumn(String regNumn) {
        this.regNum = regNumn;
    }

    public BigDecimal getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    // hash code and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return isElectric == cars.isElectric && Objects.equals(Brand, cars.Brand) && Objects.equals(regNum, cars.regNum) && Objects.equals(rentalPricePerDay, cars.rentalPricePerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand, regNum, rentalPricePerDay, isElectric);
    }


    // toStrings


    @Override
    public String toString() {
        return "Cars{" +
                "Brand='" + Brand + '\'' +
                ", regNum='" + regNum + '\'' +
                ", rentalPricePerDay=" + rentalPricePerDay +
                ", isElectric=" + isElectric +
                '}';
    }
}
