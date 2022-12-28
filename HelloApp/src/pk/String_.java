package pk;

public class String_ {
    static public void main(String args[]) {
        String str = "     heloo       ";
        System.out.println(str.trim());

        // Comparison
        str = "ABC";
        System.out.println(str.compareTo("ABCD"));
        System.out.println(str.compareTo("ABC"));
        System.out.println(str.compareTo("AB"));

        // casting
        int x = 10;
        str = String.valueOf(x);
        String str1 = x + "";
        System.out.println(str1);

        // Reference value
        String s1 = new String("HELLO!");
        String s2 = new String("HELLO!");
        String s3 = "HELLO!";
        String s4 = "HELLO!";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println("###############################");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        // equals methode uniquement compaté par valeur , pandant que la methode '=='
        // comparé par valeur et par refference.
        System.out.println("###############################");
        String s5 = "HHH", s6 = "hhh";
        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println("###############################");
        String s7 = " hey, My name's Mo";
        s7 = s7.replace("hey", "Hello!");
        System.out.println(s7);

        System.out.println("###############################");
        System.out.println(s4.substring(1));
        System.out.println(s4.substring(1,3));

        String aryString = "AA-BB-DD-FF-GG";
        for(String st: aryString.split("-")){
            System.out.println(st);
        }

    }

}