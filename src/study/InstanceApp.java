package study;
import java.io.PrintWriter; 
import java.io.IOException;
import java.io.FileNotFoundException;
public class InstanceApp{
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();
        
        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();
    }
}