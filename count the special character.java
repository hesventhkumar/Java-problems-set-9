
// ACCEPT STRING  COUNT THE SPECIAL CHARACTER


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,count=0;
        for( i=0;i<str.length();i++){
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='0' &&  str.charAt(i)<='9')){
                count++;
            }
        }
        System.out.println(count);
    }
}

//   OUTPUT

// Hesventm007@#$
// 3
