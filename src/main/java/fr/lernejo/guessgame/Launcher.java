package fr.lernejo.guessgame;

import java.security.SecureRandom;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Simulation guessgame = new Simulation(new HumanPlayer(sc));
        SecureRandom random = new SecureRandom();
        // long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long random_Number = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        guessgame.initialize(random_Number);
        guessgame.loopUntilPlayerSucceed();
    }

}
