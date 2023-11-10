
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimulationTest {
    @Test
    public void testSimulationConstructor(){
        int numberOfDice = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);

        Assert.assertNotNull(simulation);
    }
   @Test
    public void testRunSimulation(){
        int numberOfDices = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDices, numberOfTosses);
        simulation.runSimulation();
   }

}