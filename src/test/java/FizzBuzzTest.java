import de.neuefische.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expect1_whenGivenNumber1() {
        //GIVEN
        int number = 1;
        //WHEN
        String actual= FizzBuzz.calculate(number);
        //THEN
        String expected = "1";
        Assertions.assertEquals(expected, actual);
    }
}
