package org.codelity;
import java.util.*;
import java.util.stream.Collectors;
public class Season {
    private int getAmplitude(List<Integer> data) {
        return Collections.max(data) - Collections.min(data);
    }
    public String solution(int[] T) {
        String WINTER = "WINTER";
        String AUTUMN = "AUTUMN";
        String SUMMER = "SUMMER";
        String SPRING = "SPRING";

        List<Integer> list = Arrays.stream(T).boxed().collect(Collectors.toList());
        int numberOfDays = list.size() / 4;
        List<Integer> winter = list.subList(0, numberOfDays);
        List<Integer> spring = list.subList(numberOfDays, numberOfDays * 2);
        List<Integer> summer = list.subList(numberOfDays * 2, numberOfDays * 3);
        List<Integer> autumn = list.subList(numberOfDays * 3, numberOfDays * 4);
        TreeMap<Integer, String> seasonAmplitude = new TreeMap<>();
        seasonAmplitude.put(getAmplitude(winter), WINTER);
        seasonAmplitude.put(getAmplitude(spring), SPRING);
        seasonAmplitude.put(getAmplitude(summer), SUMMER);
        seasonAmplitude.put(getAmplitude(autumn), AUTUMN);
        return seasonAmplitude.lastEntry().getValue();
    }
    public static void main(String args[]) {
        int[] arg2 = {-3, -14, -5, 7, 8, 42, 8, 3};
        Season s=new Season();
        System.out.println(s.solution(arg2));

    }

}
