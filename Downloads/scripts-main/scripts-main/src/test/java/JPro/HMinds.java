package JPro;

import java.util.Arrays;
import java.util.Scanner;

public class HMinds {

    public static void main(String[] args) {

        Scanner userData=new Scanner(System.in);
        System.out.println("Enter the Amount to be added");
        int amount=userData.nextInt();

        String str="i have 1000 rupees";
        String[] s= str.split(" ");

        for (int i=0; i<s.length; i++)
        {
            if (s[i].equals("1000"))
            {
                int amountPresent= Integer.parseInt(s[i]);
                amountPresent+=amount;
                s[i]= String.valueOf(amountPresent);
            }
        }

        String sent=Arrays.toString(s);
        str=String.join(" ",s);
        System.out.println(str);

    }
}
