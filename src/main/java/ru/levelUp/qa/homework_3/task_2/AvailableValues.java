package ru.levelUp.qa.homework_3.task_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AvailableValues {

    private static final String[] storageNames = {"Samsung Galaxy A5", "Samsung Galaxy A7",
            "Iphone 5", "Iphone 6+", "Iphone 87", "Huaway 3", "Nokia 3310", "Simiens 13",
            "Satellite phone", "Yandex phone", "Linux phone"};

    String createName() {
        int i = (int) (Math.random() * storageNames.length);
        return storageNames[i];
    }

    double createPrice (){

        BigDecimal bd = new BigDecimal(1000 * Math.random());
        BigDecimal counting = bd.setScale(2, RoundingMode.HALF_UP);
        double price = Double.parseDouble(String.valueOf(counting));

        return price;
    }
}

