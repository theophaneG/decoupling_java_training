package fr.lernejo.logger;

import java.util.Collections;
import java.util.Scanner;

public class ConsoleLogger implements Logger{
    public void log(String message) {

        System.out.println(message);

    }
}
