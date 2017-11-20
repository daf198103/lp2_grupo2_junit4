package lp2.grupo2.robson_sousa;

import lp2.grupo2.ana_cristina.TestJunit1; import lp2.grupo2.ana_cristina.TestJunit2;
import lp2.grupo2.eduardo_ribeiro.DisciplineTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class, // Test ignored
        TestJunit2.class,
        DisciplineTest.class,
        TestMethodOrder.class
})

public class AllTests {
}
