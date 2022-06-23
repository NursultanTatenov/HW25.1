package com.company;

import java.util.Objects;

public class CarOptions {
    int yearOfCarProduction;
    String carModel;
    int carPrice;
    String carColor;

    public CarOptions(int yearOfCarProduction, String carModel, int carPrice, String carColor) {
        this.yearOfCarProduction = yearOfCarProduction;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarOptions that = (CarOptions) o;
        return yearOfCarProduction == that.yearOfCarProduction && carPrice == that.carPrice && Objects.equals(carModel, that.carModel) && Objects.equals(carColor, that.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfCarProduction, carModel, carPrice, carColor);
    }

    @Override
    public String toString() {
        return "CarOptions{" +
                "yearOfCarProduction=" + yearOfCarProduction +
                ", carModel='" + carModel + '\'' +
                ", carPrice=" + carPrice +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
