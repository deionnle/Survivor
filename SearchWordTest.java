import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchWordTest {

    @Test
    public void referenceTest() {
        int len = 12;
        String s = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";
        String subs = "строк";
        assertArrayEquals(new int[] {0,0,0,1,0,0,0}, SearchWord.WordSearch(len,s,subs));
    }
    @Test
    public void oneWordTest() {
        int len = 10;
        String s = "Привет";
        String subs = "строк";
        assertArrayEquals(new int[] {0}, SearchWord.WordSearch(len,s,subs));
    }
    @Test
    public void oneStrTest() {
        int len = 15;
        String s = "Одна строка";
        String subs = "строка";
        assertArrayEquals(new int[] {1}, SearchWord.WordSearch(len,s,subs));
    }
    @Test
    public void oneStrNoWordTest() {
        int len = 15;
        String s = "Одна строка";
        String subs = "строк";
        assertArrayEquals(new int[] {0}, SearchWord.WordSearch(len,s,subs));
    }
    @Test
    public void zeroWordsTest() {
        int len = 8;
        String s = "Тогда на первом шаге будет получена такая последовательность строк";
        String subs = "ноль";
        assertArrayEquals(new int[] {0,0,0,0,0,0,0,0,0}, SearchWord.WordSearch(len,s,subs));
    }
    @Test
    public void maxTest () {
        int len = 10;
        String s = "Ваш стартап получил миллионные инвестиции на создание нового поискового движка.";
        String sub = "создание";
        assertArrayEquals(new int[] {0,0,0,0,0,0,1,0,0,0},SearchWord.WordSearch(len,s,sub));
    }

    @Test
    public void repeatedTest () {
        int len = 5;
        String s = "два плюс два умножить на два равно шесть";
        String sub = "два";
        assertArrayEquals(new int[] {1,0,1,0,0,0,1,0,0},SearchWord.WordSearch(len,s,sub));
    }

    @Test
    public void numbersTest () {
        int len = 10;
        String s = "555";
        String sub = "subs";
        assertArrayEquals(new int[] {0},SearchWord.WordSearch(len,s,sub));
    }

    @Test
    public void numbers2Test () {
        int len = 3;
        String s = "111999111";
        String sub = "111";
        assertArrayEquals(new int[] {1,0,1},SearchWord.WordSearch(len,s,sub));
    }
}