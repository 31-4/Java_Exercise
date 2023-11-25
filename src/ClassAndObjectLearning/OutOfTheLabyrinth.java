package ClassAndObjectLearning;
import java.util.Scanner;
// 注:此程序还未写完
// Note: This program has not been completed yet
public class OutOfTheLabyrinth {
    public static void main(String[] args){
        Labyrinth ObstaclesNumber_1 =new Labyrinth();
        ObstaclesNumber_1.ObstaclesNumber();
//        接受了两个返回值,用数组返回
        int[] arr = ObstaclesNumber_1.ObstaclesNumber();
//        提取数组中的数据
        int i = arr[0];
        int j = arr[1];
//        迷宫数据的传入
        Labyrinth LabyrinthArea = new Labyrinth();
        LabyrinthArea.LabyrinthArea(8, 7, j, i);
    }
}
class Labyrinth{
    public int[] ObstaclesNumber(){
/*
//        Scanner ObstaclesNumber = new Scanner(System.in);
//        System.out.println("输入障碍物数量");
//        int ObstaclesNumberDataEntry = ObstaclesNumber.nextInt();
//        for (int i = 0; i < ObstaclesNumberDataEntry; i++) {
//        输入迷宫障碍物的坐标
        Scanner ObstacleCoordinates = new Scanner(System.in);
        System.out.println("迷宫障碍物横坐标");
        int ObstacleAbscissa = ObstacleCoordinates.nextInt();
        System.out.println("迷宫障碍物纵坐标");
        int ObstacleOrdinate = ObstacleCoordinates.nextInt();
        return new int[]{ObstacleOrdinate,ObstacleAbscissa };
//        }
    }

 */
    public void LabyrinthArea(int column,int line,int ObstacleOrdinate,int ObstacleAbscissa) {
//        1. 用二维数组创建迷宫,表示迷宫的面积
//        2. 规则:0 表示可以走的路; 1 表示障碍物; 2 表示走过的路;
        int[][] LabyrinthArea = new int[column][line];
//        3. 把最上面的一行和最下面的一行设置为 1
//        注:下面的for循环只适合规则图形(虽然是一个废话)

        for (int i = 0; i < LabyrinthArea[0].length - 1; i++) {
            LabyrinthArea[0][i] = 1;
            LabyrinthArea[LabyrinthArea.length - 1][i] = 1;
        }
//        4.把中间的最右面的一列和最左面的一列设置为全部 1
        for (int i = 0; i < LabyrinthArea.length; i++) {
            LabyrinthArea[i][0] = 1;
            LabyrinthArea[i][LabyrinthArea[i].length - 1] = 1;
        }
//        障碍物设置
        if (ObstacleOrdinate < LabyrinthArea.length && ObstacleAbscissa < LabyrinthArea[0].length) {
                    LabyrinthArea[ObstacleOrdinate - 1][ObstacleAbscissa - 1] = 1;
        } else {
                System.out.println("输入错误:\n纵坐标不能超过 :" + LabyrinthArea.length + "横坐标不能超过 :" + LabyrinthArea[0].length);
        }
        System.out.println("=======当前地图情况========");
        for (int i = 0; i < LabyrinthArea.length; i++) {
            for (int j = 0; j < LabyrinthArea[i].length; j++) {
                System.out.print(LabyrinthArea[i][j]);
            }
            System.out.println();
        }
    }
}
