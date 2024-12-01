import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void initCat() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnCorrectAnswerTest() {
        String expectedAnswer = "Мяу";
        String actualAnswer = cat.getSound();
        assertEquals("Кошки мяукают", expectedAnswer, actualAnswer);
    }

    @Test
    public void getFoodReturnCorrectListTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals("Кошки - хищники, они не едят траву!", expectedResult, actualResult);
    }
}
