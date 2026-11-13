import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = myRandoms.nextInt(2);
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor, int strategy) {
        if (strategy == 0)
            return myInitialGuess;

        else if (strategy == 1) 
            return 6 - openedDoor - myInitialGuess;

        else {
            int x = myRandoms.nextInt(2) +1;

            if (x==1)
                return myInitialGuess;
            else
                return 6 - openedDoor - myInitialGuess;
        }
    }
}