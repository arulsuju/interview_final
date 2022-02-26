package lamda;

import java.time.Clock;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Arul","Suju","Rekha");
        Clock clock = Clock.systemDefaultZone();
        long start=clock.millis();
        System.out.println(start);
        System.out.println(list.stream()
                .map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));
        long end=clock.millis();
        System.out.println(end);
        long responseTime=end-start;
        System.out.println("The time taken is"+responseTime);
    }
}
