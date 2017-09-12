import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

/**
 * Created by hghawsi on 12.09.2017.
 */
public class MethodReferenceTest {
    @Test
   public void givenStaticFn_createsFunctionalInterfaceWithMethRef_pass(){
        BiFunction<Integer, Integer, Integer> adder = MethodReference::add;
        int addResult = adder.apply(5, 6);
        assertEquals(11, addResult);
    }

}