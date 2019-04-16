package ru.levelUp.qa.homework_1.task_1;

import java.io.IOException;

// TODO Проект не собирается. Нельзя запустить класс
public class CalculatorApp {


    public static void main(String[] args) throws IOException {
        CalculatorApp count = new CalculatorApp();
        count.calculate();
    }

    public void calculate() throws IOException {
        InputNumber newNumber = new InputNumber();
        newNumber.inputNumber();

        ChooseAction action = new ChooseAction();
        action.chooseAction(toString());
    }
}
