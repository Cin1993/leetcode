package src.com.cinnnn;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNext()){
            n = scanner.nextInt();
        }
        List<Integer> primeList = new ArrayList<>();

        for (int i = 3;i < 1000;i++){
            if (isPrime(i)){
                primeList.add(i);
            }
        }

        int count = 0;
        for(int i = 0;i < primeList.size();i++){
            for (int j = 0;j < primeList.size();j++){
                if (i <= j){
                    if (primeList.get(i) + primeList.get(j) == n){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= java.lang.Math.sqrt(n);i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}


  /*  public static void main(String [] args){
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }*/
