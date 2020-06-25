package CalculatorNew;

public class RomanNumeral {

        static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };
        static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
        public static int convertRomanToInt(String romanNumeral) throws NumberFormatException
        {
                int number = toArabic(romanNumeral);
                if ( number == -1)
                {
                    throw new NumberFormatException("Invalid format");
                }
            return number;
        }

    private static int toArabic(String value){

        if(value.equals("I")) return 1;
         if(value.equals("II")) return 2;
           if(value.equals("III")) return 3;
             if(value.equals("IV")) return 4;
               if(value.equals("V")) return 5;
                 if(value.equals("VI")) return 6;
                   if(value.equals("VII")) return 7;
                     if(value.equals("VIII")) return 8;
                       if(value.equals("IX")) return 9;
                         if(value.equals("X")) return 10;
        else    return -1;
    }
        public static String convertIntegerToRoman(int number)
        {
            String romanValue = "";

            int N = number;

            while ( N > 0 )
            {
                for (int i = 0; i < numbers.length; i++)
                {
                    if ( N < numbers[i] )
                    {
                        N -= numbers[i-1];
                        romanValue += letters[i-1];
                        break;
                    }
                }
            }
            return romanValue;
        }

    }
