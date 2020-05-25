package office;

public class StringDemo {
    public static String sqlPassword(){
        return "process";
    }
    public static void main(String[] args) {
        char[] password=StringDemo.sqlPassword().toCharArray();
        String newOne=String.valueOf(password);
        System.out.println(newOne);

    }
}
