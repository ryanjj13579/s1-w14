public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty();
         int countRuns = 0;
         myWinTotal = 0;
         int strategy = 0; //0 is stay, 1 is switch, 2 is random
         //loop for my strategies!
         for (int i = 0; i < 3; i++){
            strategy++;
         }
         //you write this...
        while(countRuns < numGames){
            myWinTotal += m.playGame(strategy);
            countRuns ++;
        }
         //stop here...
         System.out.println((myWinTotal * 1.0)/numGames);
    }
    
    
}      
