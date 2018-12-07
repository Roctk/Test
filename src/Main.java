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
            num=new Random().nextInt(20);
            arr.add(num);
            System.out.print(num +" ");
        }
        System.out.println();
        for (int i=0;i<1000;i++)
        {
            num=new Random().nextInt(20);
            arr.contains(num);
            System.out.print(num+" ");
        }
        System.out.println();


        arr.get();
        arr.add(in.next());//11
        arr.get();


    }
}
