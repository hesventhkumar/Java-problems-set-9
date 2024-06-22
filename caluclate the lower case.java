
// ACCEPT STRING AND CALCULATE THE LOWER CASE

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,count=0;
        for( i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }
        }
        System.out.println(count);



    }
}
