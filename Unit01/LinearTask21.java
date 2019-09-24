//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять
//местами дробную и целую части числа и вывести полученное значение числа

public class LinearTask21 {
    public static void task21(){
        float r = 823.556f;
        float integer = (int)r;
        float fractional  = r%1;
        float result = integer * 0.001f  + fractional  * 1000f;
        System.out.printf("%.3f",result);
    }
}
