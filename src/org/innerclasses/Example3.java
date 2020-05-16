package org.innerclasses;
interface Connection{
    void createStatement();
}
class DriverManager{
    static Connection getConnection(){
        Connection connection=new Connection() {
            @Override
            public void createStatement() {
                System.out.println("getting Connection from Oracle");
            }
        };
        return connection;
    }
}
public class Example3 {
    public static void main(String[] args) {
        Connection connection=DriverManager.getConnection();
        connection.createStatement();
    }
}
