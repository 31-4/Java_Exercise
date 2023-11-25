package ClassAndObjectLearning;

import java.util.Scanner;
public class Method01 {
    public static void main(String[] args){
//        方法使用
//        1. 方法写好后，如果不去调用(使用)，不会输出
//        2. 先创建对象 ,然后调用方法即可
        person p1 =new person();
        p1.speak();//调用方法
        p1.cal01();
        Scanner cal =new Scanner(System.in);
        int cal1 =cal.nextInt();
        p1.cal02(cal1);
        System.out.println("第一个数:");
        int cal2 =cal.nextInt();
        System.out.println("第二个数:");
        int cal3 =cal.nextInt();
//        把 方法 getSum 返回的值，赋给变量returnRes
        int returnRes = p1.GetSun(cal2 ,cal3);
        System.out.println("GetSun返回的结果是=" + returnRes);
    }
}
class person {
    String name;
    int age;
//    成员方法解读：
//    1. public : 表示这个方法是公开的
//    2. void : 表示方法没有返回值
//    3. speak() : speak()是方法的名称 , () 形参列表
//    4. {} 方法体, 可以写要执行的代码
//    5. System.out.println("我是一个好人");表示方法就是输出一句话
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int res = 0;
        for (int i = 1; i <+ 1000; i++){
            res += i;
        }
        System.out.println(res);
    }
//    1. (int n) 形参列表， 表示当前有一个形参 n, 可以接收用户输入
    public void cal02(int n){
        int j = 0;
        for (int i = 1; i <= n; i++){
            j += i;
        }
        System.out.println(j);
    }
    public int GetSun(int num1, int num2){
        int res =  num2 + num1;
        return res;
    }
}
