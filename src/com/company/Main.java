package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car,CarOptions>cars=new HashMap<>();
        cars.put(new Car(1,"01KG001AA"),new CarOptions(2021,"MercedesBenzS600",120000,"Black"));
        cars.put(new Car(2,"01KG002AA"),new CarOptions(2020,"ToyotaLC200",100000,"White"));
        cars.put(new Car(3,"01KG003AA"),new CarOptions(2019,"AudiA8",20000,"Grey"));
        cars.put(new Car(4,"01KG004AA"),new CarOptions(2018,"BMWx7",70000,"Sonun"));


//        cars.forEach((car, carOptions) -> System.out.println(car+" "+carOptions));
        
        for (Map.Entry<Car,CarOptions>a: cars.entrySet()) {
            System.out.println((a.getKey()) + " "+ a.getValue());
        }
    }
}
