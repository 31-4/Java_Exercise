package ClassAndObjectLearning;

public class MethodParameter01 {
    public static void main(String[] args){
        B b = new B();
        int a = 10;
        int i = b.Test(a);
        System.out.println(i);
    }
}
class B{
    public int Test(int i){
        if (i == 1){
            return i;
        }else {
            return Test( i - 1 ) * i;
        }
    }
}