package ClassAndObjectLearning;

public class MethodExercise01 {
    public static void main(String[] args) {
//      1 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
//      2 根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
        AA a = new AA();
//    if(a)
        if (a.isOdd(125)){
            System.out.println("这是一个奇数");
        }else {
            System.out.println("这是一个偶数");
        }
    }
}
class AA{
    public boolean isOdd(int a){
//        if (a % 2 != 0){
//            return true;
//        }else {
//            return false;
//        }
        return a % 2 != 0 ;
//        S

    }
}