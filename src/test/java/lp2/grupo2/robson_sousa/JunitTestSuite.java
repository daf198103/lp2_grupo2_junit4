package lp2.grupo2.robson_sousa;

import lp2.grupo2.ana_cristina.TestJunit1;
import lp2.grupo2.ana_cristina.TestJunit2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})

public class JunitTestSuite {
}
