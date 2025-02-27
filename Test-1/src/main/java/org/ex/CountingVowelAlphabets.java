package org.ex;


public class CountingVowelAlphabets {
    private int j;

    public void getCount(String s) {
        s=s.toLowerCase();
        int vowel=0,number=0,constant=0,spaces=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)== 'a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowel++;
            }
            if(s.charAt(i)==' ') {
                spaces++;
            }



        }
        System.out.println("Vowels>>"+vowel+"Constant>>"+constant+"spaces>>"+spaces+"Numbers>>"+number);
    }

    public static void main(String[] args) {
        String s="Abcd 123 jolilflnkcjs 333 BBBB";
        CountingVowelAlphabets c=new CountingVowelAlphabets();
        c.getCount(s);
    }
}

