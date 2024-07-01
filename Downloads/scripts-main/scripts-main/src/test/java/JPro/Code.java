package JPro;

public class Code {

    public static void main(String[] args) {

        String s="AAABBCCCDDDD";

        String s1="3A2B3C4D";
        sequence(s);

    }


    public static void sequence(String s)
    {
        boolean[] visited=new boolean[s.length()];
        for (int i=0; i<s.length(); i++)
        {
            int count=1;
            if (!visited[i]) {
                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(i)==s.charAt(j))
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.print(count+""+s.charAt(i));
            }
        }


    }

}
