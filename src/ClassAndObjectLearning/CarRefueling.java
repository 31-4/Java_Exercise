package ClassAndObjectLearning;

import java.util.Scanner;
public class CarRefueling {
    public static void main(String[] args){
//        创建一个文本扫描器
        Scanner CarFuelTank01 = new Scanner(System.in);
//        输入油箱显示（包括最大油箱储备设置）
        System.out.print("油箱上限:");
        int MaximumFuelTankReserve = CarFuelTank01.nextInt();
        GasStation RefuelingVolume = new GasStation();
        System.out.println();
//        输入的油量
        System.out.print("输入的油量:");
        int AmountOfOilInput = CarFuelTank01.nextInt();
        RefuelingVolume.OilLevelDisplay(MaximumFuelTankReserve, AmountOfOilInput);
//        最大油量储备
//        输出油量
        System.out.println(RefuelingVolume);
    }
}
class GasStation {
//    显示油量 + 最大油箱储备
    public void OilLevelDisplay(int MaximumFuelTankReserve, int AmountOfOilInput) {
        for (int i = 0; i <= MaximumFuelTankReserve; i += AmountOfOilInput) {
            System.out.println("当前油箱储存了" + i + "L");
        }
    }
}
