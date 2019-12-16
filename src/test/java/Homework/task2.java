package Homework;

public class task2 {
    public static void main (String[]args){
        String value= "original";
        System.out.println("Changed value of original text is " + abbreviated (value));
    }

    public static String abbreviated (String str) {
        String abbrValue="";
        int n=str.length();

        if (n < 2)
        {System.out.println("Please enter string with more than two characters!");
        }
        else
        {
            for (int i=1; i<=n-2; i++) {
                abbrValue = abbrValue+str.charAt(i);
            }
            System.out.println(abbrValue);
        }
            return abbrValue;
    }
}
