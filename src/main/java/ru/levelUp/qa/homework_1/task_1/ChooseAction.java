package ru.levelUp.qa.homework_1.task_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseAction {


    void chooseAction(String str) throws  IOException {
        InputNumber newNumber = new InputNumber();

        Sum sum = new Sum();
        Subtraction minus = new Subtraction();
        Divide devider = new Divide();
        Multiple mult = new Multiple();
        Factorial factorial = new Factorial();
        Degree degree = new Degree();
        System.out.println("To choose action enter: +, -, /, *, ! or d");

        BufferedReader method = new BufferedReader(new InputStreamReader(System.in));
        String action = method.readLine();

        if(action.equalsIgnoreCase("+")){

            if (InputNumber.num instanceof Integer){
                int firstNumber = (int) newNumber.num;
                newNumber.inputNumber();

                if(InputNumber.num instanceof Integer) {
                    int secondNumber = (int) InputNumber.num;
                    System.out.println("Result: " + sum.sum(firstNumber, secondNumber));


                }else if (InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + sum.sum(firstNumberCast, secondNumber));

                }else if(InputNumber.num instanceof Long){
                    long firstNumberLong = (long) firstNumber;
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + sum.sum(firstNumberLong, secondNumber));
                }

            }else if(InputNumber.num instanceof Double){
                double firstNumber = (double) InputNumber.num;
                newNumber.inputNumber();

                if (InputNumber.num instanceof Integer) {
                    int variableToCast = (int) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + sum.sum(firstNumber, secondNumber));

                }else if (InputNumber.num instanceof Double){
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + sum.sum(firstNumber, secondNumber));



                }else if (InputNumber.num instanceof Long){
                    long variableToCast = (long) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + sum.sum(firstNumber, secondNumber));
                }



            }else if(InputNumber.num instanceof Long){
                long firstNumber = (long) InputNumber.num;
                newNumber.inputNumber();
                if(InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println(sum.sum(firstNumberCast, secondNumber));
                }else{
                    long secondNumber = (long) InputNumber.num;
                    System.out.println(sum.sum(firstNumber, secondNumber));
                }
            }


        }else if(action.equalsIgnoreCase("-")){

            if (InputNumber.num instanceof Integer){
                int firstNumber = (int) newNumber.num;
                newNumber.inputNumber();

                if(InputNumber.num instanceof Integer) {
                    int secondNumber = (int) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumber, secondNumber));


                }else if (InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumberCast, secondNumber));

                }else if(InputNumber.num instanceof Long){
                    long firstNumberLong = (long) firstNumber;
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumberLong, secondNumber));
                }

            }else if(InputNumber.num instanceof Double){
                double firstNumber = (double) InputNumber.num;
                newNumber.inputNumber();

                if (InputNumber.num instanceof Integer) {
                    int variableToCast = (int) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + minus.minus(firstNumber, secondNumber));

                }else if (InputNumber.num instanceof Double){
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumber, secondNumber));



                }else if (InputNumber.num instanceof Long){
                    long variableToCast = (long) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + minus.minus(firstNumber, secondNumber));
                }
            }else if(InputNumber.num instanceof Long){
                long firstNumber = (long) InputNumber.num;
                newNumber.inputNumber();
                if(InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumberCast, secondNumber));
                }else{
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + minus.minus(firstNumber, secondNumber));
                }
            }

        }else if(action.equalsIgnoreCase("/")){
            if (InputNumber.num instanceof Integer){
                int firstNumber = (int) newNumber.num;
                newNumber.inputNumber();

                if(InputNumber.num instanceof Integer) {
                    int secondNumber = (int) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumber, secondNumber));


                }else if (InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumberCast, secondNumber));

                }else if(InputNumber.num instanceof Long){
                    long firstNumberLong = (long) firstNumber;
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumberLong, secondNumber));
                }

            }else if(InputNumber.num instanceof Double){
                double firstNumber = (double) InputNumber.num;
                newNumber.inputNumber();

                if (InputNumber.num instanceof Integer) {
                    int variableToCast = (int) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + devider.divide(firstNumber, secondNumber));

                }else if (InputNumber.num instanceof Double){
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumber, secondNumber));



                }else if (InputNumber.num instanceof Long){
                    long variableToCast = (long) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + devider.divide(firstNumber, secondNumber));
                }
            }else if(InputNumber.num instanceof Long){
                long firstNumber = (long) InputNumber.num;
                newNumber.inputNumber();
                if(InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumberCast, secondNumber));
                }else{
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + devider.divide(firstNumber, secondNumber));
                }
            }

        }else if (action.equalsIgnoreCase("*")){
            if (InputNumber.num instanceof Integer){
                int firstNumber = (int) newNumber.num;
                newNumber.inputNumber();

                if(InputNumber.num instanceof Integer) {
                    int secondNumber = (int) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumber, secondNumber));


                }else if (InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumberCast, secondNumber));

                }else if(InputNumber.num instanceof Long){
                    long firstNumberLong = (long) firstNumber;
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumberLong, secondNumber));
                }

            }else if(InputNumber.num instanceof Double){
                double firstNumber = (double) InputNumber.num;
                newNumber.inputNumber();

                if (InputNumber.num instanceof Integer) {
                    int variableToCast = (int) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + mult.mult(firstNumber, secondNumber));

                }else if (InputNumber.num instanceof Double){
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumber, secondNumber));



                }else if (InputNumber.num instanceof Long){
                    long variableToCast = (long) InputNumber.num;
                    double secondNumber = (double) variableToCast;
                    System.out.println("Result: " + mult.mult(firstNumber, secondNumber));
                }
            }else if(InputNumber.num instanceof Long){
                long firstNumber = (long) InputNumber.num;
                newNumber.inputNumber();
                if(InputNumber.num instanceof Double){
                    double firstNumberCast = (double) firstNumber;
                    double secondNumber = (double) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumberCast, secondNumber));
                }else{
                    long secondNumber = (long) InputNumber.num;
                    System.out.println("Result: " + mult.mult(firstNumber, secondNumber));
                }
            }

        }else if(action.equalsIgnoreCase("!")){

            if (InputNumber.num instanceof Integer) {
                int a = (int) InputNumber.num;
                int result = factorial.factorial(a);
                System.out.println("Factorial is " + result);
            }else{
                System.out.println("Entered number is not relevant to factorial");
            }

        }else if(action.equalsIgnoreCase("d")){

            if (InputNumber.num instanceof Integer) {
                int a = (int) newNumber.num;
                newNumber.inputNumber();
                int b = (int) InputNumber.num;
                System.out.println("Result: " + degree.degree(a, b));
            }else if(InputNumber.num instanceof Double){
                double a = (double) InputNumber.num;
                newNumber.inputNumber();
                int b = (int) InputNumber.num;
                System.out.println("Result " + degree.degree(a, b));
            }else if (InputNumber.num instanceof Long){
                long a = (long) InputNumber.num;
                newNumber.inputNumber();
                int b = (int) InputNumber.num;
                System.out.println("Result " + degree.degree(a, b));
            }

        }else {
            System.out.println("Entered action is not correct");
        }


    }
}
