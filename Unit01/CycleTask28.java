//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
//        результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
//        также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки
//        программа (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
import java.util.Scanner;

public class CycleTask28 {
    public static void task28(){
        Scanner in = new Scanner(System.in);
        float x, y;
        char operation = 1;
        String str;
        while(operation != '0') {
            System.out.println("enter the operation '+', '-', '*', '/'");
            str = in.nextLine();
            operation = str.charAt(0);
            if(operation == '0'){
                break;
            }
            if ((operation != '+') && (operation != '-') && (operation != '*') && (operation != '/')) {
                System.out.println("wrong enter");
                continue;
            }

            System.out.println("enter x");
            x = in.nextFloat();
            System.out.println("enter y");
            y = in.nextFloat();

            if (operation == '/' && y == 0) {
                System.out.println("division by zero");
            }
            if(operation == '+'){
                System.out.println(x+y);
            }
            if(operation == '-'){
                System.out.println(x-y);
            }
            if(operation == '*'){
                System.out.println(x*y);
            }
            if(operation == '/'){
                System.out.println(x/y);
            }
            in.nextLine(); // ест \n
        }
    }
}
