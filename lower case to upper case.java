
CONVERT LOWER CASE TO UPPER CASE


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i;
        String res = new String();
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i)<='z')
                res+=(char)(str.charAt(i)-32);
            else
                res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
