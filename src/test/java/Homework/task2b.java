package Homework;

public class task2b { public static void main (String[]args){
    String value= "original";
    System.out.println("Changed value of original text is " + abbreviated (value));
}

    public static String abbreviated (String str) {
        String abbrValue="";
        abbrValue=str.substring(1,str.length()-1);
        return abbrValue;
    }
}