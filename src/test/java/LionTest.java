import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    Lion lion;
    Feline feline;

    @Before
    public void initLion() throws Exception {
        feline = new Feline();
        lion = new Lion("Самка", feline);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesExceptionTest() {
        assertThrows(Exception.class, () -> new Lion(" ", feline));
    }

    @Test
    public void exceptionTextTest() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        try {
            new Lion(" ", feline);
        } catch(Exception e) {
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
