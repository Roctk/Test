import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set arr = new Set(13);
        for (int i=0;i<13;i++)
            arr.add(in.next());
    }
}
