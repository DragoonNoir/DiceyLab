
public class Bins {
    int min;
    int max;
    int[] possibleValues;
    public Bins(int min, int max) {

        this.min = min;
        this.max = max;
        possibleValues = new int[max - min + 1];// size 11

    }
    public Integer getBin(int binNumber){
        return this.possibleValues[binNumber - this.min];

    }

    public void incrementBin(int binNumber){
        this.possibleValues[binNumber - this.min] ++;

    }
    //create constructor(int min, max)

    //create get bin(int binNumber)
    //find value at bin Nummber
    //return value

    //create increament value at bin number +1


}
