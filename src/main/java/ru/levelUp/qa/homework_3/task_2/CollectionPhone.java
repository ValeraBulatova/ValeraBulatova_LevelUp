package ru.levelUp.qa.homework_3.task_2;


import java.util.ArrayList;
import java.util.List;

public class CollectionPhone {

    public static void main(String[] args) {
        InputMethod inputMethod = new InputMethod();
        AvailableValues values = new AvailableValues();

        List<MobilePhone> phones = new ArrayList<>();
        inputMethod.inputNumber();

        for (int i = 0; i < inputMethod.min; i++) {
            String phoneName = values.createName();
            double price = values.createPrice();
            phones.add(new MobilePhone(phoneName, price));
            System.out.println(phones.get(i));
        }

        //System.out.println(phones.get());
        System.out.println(MethodSku.getSkuInRange(phones));
        System.out.println("Phones with price bigger than middle: " + MethodSku.middlePrice(phones));
        System.out.println(MethodSku.byPrice(phones));
    }
}