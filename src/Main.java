import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String s = sc.next();
        int r =120-n;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==1)
                c++;

        }
        int max = c+r;
        if(max>=90)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}