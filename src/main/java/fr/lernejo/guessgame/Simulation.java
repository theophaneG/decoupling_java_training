package fr.lernejo.guessgame;


import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player ;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
        this.numberToGuess = numberToGuess;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
        //TODO implement me
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        boolean start = false;
        int mynumber = 0;
        do {
            System.out.println("entrer votre nombre : ");
            Scanner sc = new Scanner(System.in);
            try {
                mynumber = sc.nextInt();
                sc.nextLine();
                start = true;
            } catch (NoSuchElementException e) {
                start = false;

            }
        }while (!start);
        if (mynumber == numberToGuess)
        {
            System.out.println("vous avez trouvez la solution");
            return true;
        }
        player.respond(mynumber < numberToGuess);
        //TODO implement me
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while(!nextRound());
        //TODO implement me
    }
}
