package ClassAndObjectLearning;

public class RecursionExercise01_2 {
    public static void main(String[] args){
        int day = 8;
        t t1 =new t();
        int peachNum = t1.peach(day);
        if(peachNum != -1) {
            System.out.println("第 " + day + "天有" + peachNum + "个桃子");
        }

    }
}
class t{
     public int peach(int day){
         if(day == 10) {//第 10 天，只有 1 个桃
             return 1;
         } else {
             if ( day >= 1 && day <=9 ) {
                 return (peach(day + 1) + 1) * 2;//规则，自己要想
             } else {
                 System.out.println("day 在 1-10");
                 return -1;
             }
         }
    }
}