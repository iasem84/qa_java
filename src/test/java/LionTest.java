import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void initLion() throws Exception {
        lion = new Lion("Самка", feline);
    }

    @Test
    public void getFoodReturnCorrectListTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = lion.getFood();
        assertEquals("Львы - хищники, они не едят траву!", expectedList, actualList);
    }

    @Test
    public void getKittensReturnCorrectResultTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
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
        Exception exception = assertThrows(Exception.class, () -> new Lion(" ", feline));
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
