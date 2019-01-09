package src.com.cinnnn.TestPackage;

public class Test {


    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int romanValue = 0;
        int[] temp = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'I': temp[i] = 1;
                    break;
                case 'V': temp[i] = 5;
                    break;
                case 'X': temp[i] = 10;
                    break;
                case 'L': temp[i] = 50;
                    break;
                case 'C': temp[i] = 100;
                    break;
                case 'D': temp[i] = 500;
                    break;
            }
        }

        for (int i = 1; i < chars.length; i++) {
            if (temp[i] > temp[i-1]){
                romanValue = romanValue - temp[i-1];
            }else {
                romanValue = romanValue + temp[i-1];
            }
        }
        return romanValue+temp[chars.length-1];
    }





    public  static  void main (String[] args){
        System.out.println(romanToInt("VIIII"));

    }
}


