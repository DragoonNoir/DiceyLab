public class Simulation {
//create a constructor int numberOfDices, int numberOfTosses)
    //create sim method
    //use values in constructor
    //sim the toss throwing
    //print results
    int numberOfDices;
    int numberOfTosses;

    public Simulation (int numberOfDices, int numberOfTosses){
        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberOfTosses;
    }
    public void runSimulation(){
        Dice dice = new Dice (this.numberOfDices);
        Bins bin = new Bins (this.numberOfDices, this.numberOfDices * 6);

        for(int i = 0; i <numberOfTosses; i++){
            bin.incrementBin(dice.tossAndSum());
        }
        for (int i=2; i <= numberOfDices * 6; i++){
            System.out.println("Value at bin number" + i + ":" + bin.getBin(i));
        }
    }


}
