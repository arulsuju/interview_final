import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class SampleHash{
    private String name;
    private int age;

    public SampleHash(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SampleHash)) return false;
        SampleHash that = (SampleHash) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
public class WhyShouldOverrideHashandEquals {

    public static void main(String[] args) {

        SampleHash sampleHash=new SampleHash("Suju",32);
        SampleHash sampleHash1=new SampleHash("Suju",32);
        Map<SampleHash,String> map=new HashMap<>();
        map.put(sampleHash,"cse");
        map.put(sampleHash1,"cse");

        System.out.println(map.size());
       for(SampleHash sampleHash2:map.keySet()){
           System.out.println(map.toString());
       }

    }
}
