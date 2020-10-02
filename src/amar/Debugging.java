package amar;

public class Debugging {
    int solution(int N) {
        int largest = 0;
        int shift = 0;
        int temp = N;
        for (int i = 1; i <= 30; ++i) {
            int index = (temp & 1);
            temp = ((temp >> 1) | (index << 29));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;
    }
    public static void main(String[] args) {
        Debugging debugging=new Debugging();
        System.out.println(debugging.solution(9736));

    }
}
