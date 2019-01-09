package src.com.cinnnn.BaseAlgorithm;

import javax.xml.bind.SchemaOutputResolver;

/**
 * 进制转换类
 */
public class BinaryConversion {
    /**
     *  十进制转二进制 方法1：普通循环
     * @param n 十进制数
     */
    public static void decimal2Binary1(int n){
        String result = new String("");
        while (n != 0) {
            result = n % 2 + result;
            n /= 2;
        }
        System.out.println("方法1："+result);
    }

    /**
     * 将最高位的数移至最低位（移31位），
     * 除过最低位其余位置清零，使用& 操作，
     * 可以使用和1相与（&），由于1在内存中除过最低位是1，
     * 其余31位都是零，然后把这个数按十进制输出；再移次高位，
     * 做相同的操作，直到最后一位
     *  十进制转二进制 方法2：移位操作
     * @param n 十进制数
     */
    public static void decimal2Binary2(int n){
        for (int i = 31; i >= 0;i--){
            System.out.print(n >>> i & 1);
        }
    }

    /**
     *  十进制转二进制 方法3：使用java自带的方法
     * @param n 十进制数
     */
    public static void decimal2Binary3(int n){
        String res = Integer.toBinaryString(n);
        System.out.printf(res);
    }

    /**
     *  任意进制转10进制
     * @param s 二进制字符串
     */
    public static void decimal (String s){
        // 2进制转10进制
        Integer.valueOf(s,2);
        // 8进制转10进制
        Integer.valueOf(s,8);
        // 16进制转10进制
        Integer.valueOf(s,16);
    }


    public static void main(String[] args) {

    }
}
