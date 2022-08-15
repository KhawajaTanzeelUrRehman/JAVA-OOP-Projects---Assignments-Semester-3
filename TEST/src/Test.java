import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int space =0;
        for (int i = n ; i>0; i--){
            String s = " ";
            String st = s.repeat(space);
            String s1 = "*";
            String st1 = s1.repeat(i);
            System.out.println(st+st1);

            space++;
        }

    }

}
