import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Recursion2Test {

    @Test
    public void lenTest(){
        List<String> list = new ArrayList<>();
        list.add("Расчет");
        list.add("длины");
        list.add("списка");
        list.add("4");
        assertEquals(4,Recursion2.ListLen(list));
    }

    @Test
    public void palindromTest() {
        assertEquals(true,Recursion2.palindrom("шалаш"));
        assertEquals(true,Recursion2.palindrom("абвгвба"));
        assertEquals(true,Recursion2.palindrom("кабак"));
        assertEquals(true,Recursion2.palindrom("ааа"));
        assertEquals(false,Recursion2.palindrom("абвгдвба"));
        assertEquals(false,Recursion2.palindrom("палиндром"));
    }
}