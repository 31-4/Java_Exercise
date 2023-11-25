package ClassAndObjectLearning;

public class Method02 {
    public static void main(String[] args){
        MyTools arr1 =new MyTools();
        int[][] arr =new int[][]{{0, 0, 1},{1 ,1 ,1},{1 ,1 ,3}};
        arr1.printarr(arr);
    }
}
class MyTools {
    public void printarr (int [][] map){
        for (int i = 0; i< map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
