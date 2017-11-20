package lp2.grupo2.robson_sousa;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMethodOrder {

    @Test
    public void secondMethod() {
        System.out.println("second");
    }

    @Test
    public void firstMethod() {
        System.out.println("first");
    }

    @Test
    public void thirdMethod() {
        System.out.println("third");
    }
}
