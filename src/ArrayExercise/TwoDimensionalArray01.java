package ArrayExercise;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        int[][] arr ={{4 ,6} ,{1 ,4 ,5 ,7},{-2}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
//                System.out.print(arr[i][j]);
            }
        }
        System.out.println("题目：\nint arr[][]={{4,6},{1,4,5,7},{-2}}; 遍历该二维数组，并得到和");
        System.out.println("过程:\n" +
                "public class TwoDimensionalArray01 {\n" +
                "    public static void main(String[] args) {\n" +
                "        int[][] arr ={{4 ,6} ,{1 ,4 ,5 ,7},{-2}};\n" +
                "        int sum = 0;\n" +
                "        for(int i = 0; i < arr.length; i++){\n" +
                "            for ( int j = 0; j < arr[i].length; j++) {\n" +
                "                sum += arr[i][j];\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(sum= + sum);\n" +
                "    }\n" +
                "}");
        System.out.println("答案：\nsum=" + sum);
        System.out.println("评价：\n特别失败没法独立完成代码需要借助视频");
    }
}