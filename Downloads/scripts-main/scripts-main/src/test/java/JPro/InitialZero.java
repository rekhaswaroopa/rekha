package JPro;

public class InitialZero {

    public static void main(String[] args) {

//        String s="32400121200";
//        String s1="00003241212";
//        initialZero(s);

    }

    public static void initialZero(String s)
    {
        String str="";
        for (int i=0 ; i<s.length(); i++)
        {
            if(s.charAt(i)=='0')
            {
                str+=s.charAt(i);
            }
        }
        for (int i=0 ; i<s.length(); i++)
        {
            if(s.charAt(i)!='0')
            {
                str+=s.charAt(i);
            }
        }
        System.out.println(str);

    }
}
