package ArrayExercise;

import java.util.Scanner;
public class TwoDimensionalArray02 {
    public static void main(String[] args){
        Scanner arr1 =new Scanner(System.in);
        int arr2 = 0;
        System.out.println("输入数组列数");
        arr2 = arr1.nextInt();
        int[][] arr =new int[arr2][];

//        int s = 0;
//        int a1 = 0;
        for (int i = 0; i < arr.length; i++){
            arr [i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][0] = 1;
//                arr[i][arr.length - arr.length] = 1;
//                System.out.println(arr[i][j]);
                if ( j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }

            }
        }
        for (int a = 0; a < arr.length; a++){
            for (int j1 = 0; j1 < arr[a].length; j1++) {
                System.out.print(arr[a][j1] + "\t");
            }
            System.out.println();
        }
        System.out.println("题目：\n" +
                "杨辉三角");
        System.out.println("错误：\n" +
                "对数组的设置过于理想化");
        System.out.println("过程：\n" +
                "import java.util.Scanner;\n" +
                "public class TwoDimensionalArray02 {\n" +
                "    public static void main(String[] args){\n" +
                "        Scanner arr1 =new Scanner(System.in);\n" +
                "        int arr2 = 0;\n" +
                "        System.out.println(\"输入数组列数\");\n" +
                "        arr2 = arr1.nextInt();\n" +
                "        int[][] arr =new int[arr2][];\n" +
                "\n" +
                "        for (int i = 0; i < arr.length; i++){\n" +
                "            arr [i] = new int[i + 1];\n" +
                "            for (int j = 0; j < arr[i].length; j++) {\n" +
                "                if ( j == 0 || j == arr[i].length - 1){\n" +
                "                    arr[i][j] = 1;\n" +
                "                }else {\n" +
                "                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        }\n" +
                "        for (int a = 0; a < arr.length; a++){\n" +
                "            for (int j1 = 0; j1 < arr[a].length; j1++) {\n" +
                "                System.out.print(arr[a][j1] + \"\\t\");\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "        }\n" +
                "    }\n" +
                "}");
        System.out.println("评价：\n"  +
                "对if判断语句使用不熟练导致对其无法进行内部数字填充以及对首尾的数字1的赋值");
    }
}