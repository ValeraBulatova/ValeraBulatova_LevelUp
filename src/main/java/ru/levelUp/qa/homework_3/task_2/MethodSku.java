package ru.levelUp.qa.homework_3.task_2;
import java.util.ArrayList;
import java.util.List;

public class MethodSku {

    static InputMethod cost = new InputMethod();

    static List<MobilePhone> getSkuInRange(List<MobilePhone> inputData) {

        List<MobilePhone> results = new ArrayList<>();
        cost.inputPrice();
        for (MobilePhone item : inputData) {
            if(item.getCost() < InputMethod.max && item.getCost() > InputMethod.min) {
                results.add(item);
            }
        }
        return results;
    }
    double variableCost;
    int i = 0;
    static List<MobilePhone> middlePrice(List<MobilePhone> price){
        List<MobilePhone> results = new ArrayList<>();
        double variableCost = 0;
        int i = 0;
        for (MobilePhone item : price) {
            variableCost += item.getCost();
            i++;
        }
        double middleCost = variableCost / i;

        for (MobilePhone item : price) {
            if(item.getCost() > (middleCost + 20)) {
                results.add(item);
            }
        }
        return results;
    }

    static String byPrice (List<MobilePhone> name){
        String findName = null;
        cost.desiredPrice();
        int i = 0;
        for (MobilePhone item : name) {
            if(item.getCost() == InputMethod.min) {
                findName = item.getName();
                i++;
                if (i == 2) {
                    break;
                }
            }
        }
        if (findName == null) {
            System.out.println("Unfortunately we do not have phone with desired price");
        }
        return findName;
    }

}


