package ru.levelUp.qa.homework_1.task_1;

public class Degree {

    int degree (int a, int b){
        int result = 1;
        if (b == 0){
            result = 1;
        }else{
            for(int i = 0; i < b; i++){
                result *= a;
            }
        }
        return result;
    }
    long degree (long a, int b){
        long result = 1;
        if (b == 0){
            result = 1;
        }else{
            for(int i = 0; i < b; i++){
                result *= a;
            }
        }
        return result;
    }
    double degree (double a, int b){
        double result = 1;
        if (b == 0){
            result = 1;
        }else{
            for(int i = 0; i < b; i++){
                result *= a;
            }
        }
        return result;
    }
}

