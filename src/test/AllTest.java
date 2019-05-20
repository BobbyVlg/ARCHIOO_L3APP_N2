package test;
import calculatrice.Multiplication;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
        SoustractionTest.class , Multiplication.class
})


public class AllTest {
}
