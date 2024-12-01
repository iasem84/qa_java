import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void getFamilyReturnCorrectAnswerTest() {
        String expectedAnswer = "Кошачьи";
        String actualAnswer = feline.getFamily();
        assertEquals("Кошки относятся к семейству кошачьих!", expectedAnswer, actualAnswer);
    }

    @Test
    public void eatMeatReturnCorrectListTest() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = feline.eatMeat();
        assertEquals("Кошки - хищники, они не едят траву!", expectedList, actualList);
    }

    @Test
    public void getKittensWithArgsReturnCorrectResultTest(){
        int expectedResult = 4;
        int actualResult = feline.getKittens(4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutArgsReturnCorrectResultTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }
}
