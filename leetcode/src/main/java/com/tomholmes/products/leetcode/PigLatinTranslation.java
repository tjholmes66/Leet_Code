package com.tomholmes.products.leetcode;

public class PigLatinTranslation
{
    private final static String AY = "ay";

    private static String translation(String input)
    {
        char[] letters = input.toCharArray();
        
        int vowelIndex = 0;
        for( int i = 0; i <= letters.length-1 ; i++ ) {
            char ch = letters[i];
            if( ch=='a' || ch=='e' || ch=='i' ||  ch=='o' || ch=='u') {
                vowelIndex = i;
                break;
            }
        }
        
        String prefix = input.substring(0,vowelIndex);
        String stem = input.substring(vowelIndex, input.length());
        String result = stem + prefix + AY;
        
        return result;
    }

    public static void main(String[] args)
    {
        String input = "stop";
        System.out.println(translation(input));
        input = "welcome";
        System.out.println(translation(input));
        input = "hello";
        System.out.println(translation(input));
        input = "food";
        System.out.println(translation(input));
        input = "island";
        System.out.println(translation(input));
        input = "eunoia";
        System.out.println(translation(input));
    }

}
