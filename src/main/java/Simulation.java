public class Simulation {
//create a constructor int numberOfDices, int numberOfTosses)
    //create sim method
    //use values in constructor
    //sim the toss throwing
    //print results
    int numberOfDices;
    int numberOfTosses;
    Bins bin;

    public Simulation (int numberOfDices, int numberOfTosses){
        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberOfTosses;
    }
    public void runSimulation(){
        Dice dice = new Dice (this.numberOfDices);
        bin = new Bins (this.numberOfDices, this.numberOfDices * 6);

        for(int i = 0; i <numberOfTosses; i++){
            bin.incrementBin(dice.tossAndSum());
        }
//        for (int i=2; i <= numberOfDices * 6; i++){
//            System.out.println("Value at bin number " + i + " : " + bin.getBin(i));
//        }
    }
    // print results
    //stars how do we know how many
    //numbers
    //dice sum
//sim num
    //percentages
//    format
//    spacing
    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of " + this.numberOfDices + " dice tossed " + this.numberOfTosses + "times.");
        System.out.println("***");

        for(int i = numberOfDices; i <= numberOfDices *6; i++){
            //value : #tossedThatValue : percentage ***************
            String str = String.format(" %2d :%9d: %1.2f", i,bin.getBin(i), (double)this.bin.getBin(i) / this.numberOfTosses);//format to space

            //stars
            double percent = (double) this.bin.getBin(i) /this.numberOfTosses;
            int num = (int) (percent * 100);
            String stars = "*".repeat(num);//
            System.out.println(str + " " + stars);




        }
    }
}
