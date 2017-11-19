package lp2.grupo2.robson_sousa;

import lp2.grupo2.ana_cristina.TestJunit1;
import lp2.grupo2.ana_cristina.TestJunit2;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestJunit1.class, TestJunit2.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}