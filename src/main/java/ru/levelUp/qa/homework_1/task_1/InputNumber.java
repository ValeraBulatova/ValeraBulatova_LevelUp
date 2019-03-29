package ru.levelUp.qa.homework_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputNumber {

    // TODO ??? зачем main?

    static Object num;

    void inputNumber() throws IOException {

        System.out.println("Input a number: ");
        BufferedReader number =
                new BufferedReader(new InputStreamReader(System.in));
        String input = number.readLine();
        num = input;

        try {
            this.num = Integer.parseInt(input);

        }catch (NumberFormatException exc) {
            try{this.num = Long.parseLong(input);

            }catch (NumberFormatException ex){
                this.num = Double.parseDouble(input);

            }
        }

    }
}
