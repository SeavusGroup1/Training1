package Homework;

public class task1 {
    public static void main(String args[]) {
        String value = "World";
        System.out.println(reversing(value));
    }

    public static String reversing (String str) {
            String reversedValue = "";
            for (int i=str.length()-1; i>=0; --i){
                reversedValue=reversedValue+str.charAt(i);
            }
            return reversedValue;
    }
}
