
// PRINT THE NUMBER  IN THE GIVEN STRING

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,res=0 ,flag=0;
        for( i=0;i<str.length();i++){
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
            res= res*10+(str.charAt(i)-48);
        flag=1;
        }
       if(flag==1)
           System.out.println(res);
       else
           System.out.println(0);
    }
}

//OUTPUT
//hesventh12345
// 12345
