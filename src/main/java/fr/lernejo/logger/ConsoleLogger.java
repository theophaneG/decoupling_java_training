package fr.lernejo.logger;

import java.util.Collections;
import java.util.Scanner;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        Scanner input = new Scanner(message);
        System.out.println(message);

    }
}
