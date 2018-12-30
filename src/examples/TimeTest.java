package examples;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TimeTest {

    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.print(localDateTime);
    }
}
