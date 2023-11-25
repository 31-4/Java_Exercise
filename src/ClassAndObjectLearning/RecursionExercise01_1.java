package ClassAndObjectLearning;

import java.util.Scanner;
public class RecursionExercise01_1 {
    public static void main(String[] args){
        Scanner j =new Scanner(System.in);
        System.out.println("请输入的大于1的整数");
        T t =new T();
        int j1 = j.nextInt();
        int i = t.fibonacci(j1);
        System.out.println("当 n="+ j1 +" 对应的斐波那契数=" + i);
    }
}
class T{
    public int  fibonacci(int n){
        if (n >= 1){
            if ( n == 1 || n == 2){
                return 1;
            }else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else {
            System.out.println("要求输入的 n>=1 的整数");
            return -1;
        }
    }
}
