package ru.levelUp.qa.homework_3.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    double a;
    double b;
    double c;
    double read;
    void number(){
    Reader reader = new Reader();
        System.out.println("Input a");
        reader.reading();
    this.a = reader.read;
        System.out.println("Input b");
        reader.reading();
    this.b = reader.read;
        System.out.println("Input c");
        reader.reading();
    this.c = reader.read;
    }

    void reading() {
        try {
            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            String a = scanner.readLine();
            this.read = Double.parseDouble(a);
        }catch (IOException a){
            System.out.println("Neozhidanno");
        }
    }
}
