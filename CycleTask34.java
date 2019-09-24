//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class CycleTask34 {
    public static void task34(){
        int i = 1059;
        int temp = i;
        int j = 3;
        int sum = 0;
        while(i < 9999){
            while(j >= 0){
                sum += temp/Math.pow(10, j);
                temp %= Math.pow(10, j);
                j--;
            }
            if(sum == 15){
                System.out.println(i + " ");
            }
            i++;
            temp = i;
            j = 3;
            sum = 0;
        }
    }
}
