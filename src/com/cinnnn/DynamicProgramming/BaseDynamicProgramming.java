package src.com.cinnnn.DynamicProgramming;

import java.util.HashMap;

/**
 * 动态规划基础题：
 * 有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。
 * 要求用程序来求出一共有多少种走法。
 */
public class BaseDynamicProgramming {

    public static void main(String[] args) {
        System.out.println(recursionMethod(10));
        System.out.println(memorandumMethod(10, new HashMap<>()));
        System.out.println(downtoTopMethod(10));
    }

    /**
     * 递归法
     * 定义F(n)为走第n阶楼梯的次数
     * F(1) = 1
     * F(2) = 2
     * F(n) = F(n-1) + F(n-2) (n>=3)
     */
    public static int recursionMethod(int n) {
        if (n < 1)
            return 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return recursionMethod(n - 1) + recursionMethod(n - 2);
    }

    /**
     * 备忘录方法：将之前的结果保存起来
     */
    public static int memorandumMethod(int n, HashMap<Integer, Integer> memorandum) {
        if (n < 1)  return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (memorandum.containsKey(n)){
            return memorandum.get(n);
        }else {
            int value = memorandumMethod(n-1, memorandum) + memorandumMethod(n-2, memorandum);
            memorandum.put(n, value);
            return value;
        }
    }

    /**
     * 自底向上方法，时间复杂度和空间复杂度都是最小
     *
     */
    public static int downtoTopMethod(int n){
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1;
        int b = 2;
        int temp = 0;
        for (int i = 3; i <= n;i ++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }


}
