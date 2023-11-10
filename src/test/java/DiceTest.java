import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

@Test
public void testDiceConstructor(){
  int numberOfDice = 2;
    Dice dice = new Dice(numberOfDice);

    Assert.assertNotNull(dice);

}
@Test
public void testTossAndSum(){
  int numberOfDice = 2;
  int max = numberOfDice * 6;
  Dice dice = new Dice(numberOfDice);
  Integer actual = dice.tossAndSum();

  Assert.assertTrue( actual <= max);
  Assert.assertTrue( actual >= numberOfDice);
}

}
