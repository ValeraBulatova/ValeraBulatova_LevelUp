package ru.levelUp.qa.homework_1.task_1;

public class Factorial {
    int factorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
        }
        return result;

    }
}
