package examples;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
        BigDecimal ejbMethodCall = BigDecimal.valueOf(13743895345L);
        BigInteger ejbMethodCallInt = ejbMethodCall.toBigInteger();

        System.out.println(ejbMethodCallInt);
    }
}
