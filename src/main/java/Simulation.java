public class Simulation {


    private int numberOfDice;
    private int numberOfThrows;
    private Dice dice;
    private Bins bin;

    public Simulation(int numberOfDice, int numberOfThrows) {
        this.numberOfDice = numberOfDice;
        this.numberOfThrows = numberOfThrows;
        this.bin = new Bins(numberOfDice, numberOfDice*6);
        this.dice = new Dice(numberOfDice);
    }

    public int getNumberOfDice() {
        return numberOfDice;

    }

    public int getNumberOfThrows() {
        return numberOfThrows;
    }
}
