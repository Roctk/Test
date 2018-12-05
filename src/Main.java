import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int check;
        int num;
        Scanner in = new Scanner(System.in);
        Set arr = new Set<Integer>();
        for (int i=0;i<10;i++)
        {
            num=new Random().nextInt(10);
            arr.add(num);
        }
        for (int i=0;i<10;i++)
        {
            num=new Random().nextInt(10);
            System.out.print(num+"____");
            arr.contains(num);
        }


        System.out.println(Arrays.asList(arr.get()));
        arr.add(in.next());//11
    }
}
