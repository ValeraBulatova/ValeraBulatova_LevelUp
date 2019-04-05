package ru.levelUp.qa.homework_3.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMethod {

    static double min;
    static double max;

    void inputNumber(){
        System.out.println("Input amount of sku:");
        BufferedReader inputMin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = inputMin.readLine();
            this.min = Integer.parseInt(input);
        }catch (IOException exp){
            System.out.println("Ochen' zhal'");
        }
    }

    void desiredPrice(){
        System.out.println("Input desired price");
        BufferedReader inputMin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = inputMin.readLine();
            this.min = Double.parseDouble(input);
        }catch (IOException exp){
            System.out.println("Ochen' zhal'");
        }
    }

    void inputPrice(){
        System.out.println("Input minimum price");
        BufferedReader inputMin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = inputMin.readLine();
            this.min = Double.parseDouble(input);
        }catch (IOException exp){
            System.out.println("Ochen' zhal'");
        }
        System.out.println("Input maximum price");
        BufferedReader inputMax = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputM = inputMax.readLine();
            this.max = Double.parseDouble(inputM);
        }catch (IOException exp){
            System.out.println("Ochen' zhal'");
        }

    }
}

