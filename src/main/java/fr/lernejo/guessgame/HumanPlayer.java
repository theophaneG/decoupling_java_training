package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;


import java.util.Scanner;

public class HumanPlayer implements Player {
    private final String name;
    private final Logger logger = LoggerFactory.getLogger("player");

    public HumanPlayer(Scanner input) {
        System.out.println("entrer votre nom");
        name = input.nextLine();
    }

    @Override
    public long askNextGuess() {
        System.out.println("rentrer un nouveau : ");
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        sc.close();

        return l;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) System.out.println("votre nombre est plus petit que le nombre choisi");
        else System.out.println("votre nombre est plus grand que le nombre choisi");
    }
}
