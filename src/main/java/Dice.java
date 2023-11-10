import java.util.Random;
public class Dice {

int numberOfDice;
//create a constructor
    public Dice(int numberOfDice) {
            this.numberOfDice = numberOfDice;

    }
//    Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee
//
//    Integer toss = dice.tossAndSum();
    public Integer tossAndSum(){
        Integer sum = 0;
        for(int i = 0; i < numberOfDice; i++){
            Random random = new Random();
            sum += random.nextInt( 6) +1;
        }
        return sum;
    }

    }

