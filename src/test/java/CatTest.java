import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline;
    Cat cat;

    @Before
    public void initCat(){
        feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnCorrectAnswerTest() {
        String expectedAnswer = "Мяу";
        String actualAnswer = cat.getSound();
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void getFoodReturnCorrectListTest() throws Exception {
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = cat.getFood();
        assertEquals(expectedList, actualList);
    }
}
