import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork {
    // Домашняя работа Владимира Дегтярева.

    public static void NOD() {
        // Найти наибольший общий делитель (НОД) двух чисел. Использовать цикл for

        System.out.println("\nВведите два натуральных числа\n" + "для нахождения их наибольшего общего делителя:\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое натуральное число:");
        int firstNum = in.nextInt();
        
        System.out.println("Введите второе натуральное число:");
        int secondNum = in.nextInt();

        int a = firstNum;
        int b = secondNum;

        int max = (firstNum > secondNum) ? firstNum : secondNum;

        if (a <=0 || b <= 0) {
            System.out.println("Необходимо указать два натуральных числа.\n" + "Повторите попытку.");
            } else if (a == b) {
                System.out.printf("Числа равны, поэтому их НОД равен %d", a);
            } else {

                for (int i = 0; i < max; i++) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }

            System.out.printf("Наибольший общий делитель для чисел %d и %d равен: %d\n", firstNum, secondNum, a);
            }
    }
    public static void DoubleSystem() {
        // Написать программу перевода числа из 10 системы счисления в 2 систему счисления

        System.out.println("\n\nЭта программа переводит число из десятичной системы счисления в двоичную.\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число в десятичной системе счисления:");

        int numDecimal = in.nextInt();
        StringBuilder numDouble = new StringBuilder();
        int numA = numDecimal;
        int numB = 0;

        if (numDecimal <= 0) {
            System.out.println("Необходимо указать только целое число больше нуля.\n" + "Повторите попытку.");
        } else {
            do {
                numB = numA % 2;
                numA = numA / 2;
                numDouble = numDouble.append(numB);

            } while (numA >= 1);
            System.out.printf("Число %d в двоичной системе счисления равно: %s\n", numDecimal, numDouble.reverse());
        }
    }
    public static void SixSystem() {
        // Написать программу перевода числа из 10 системы счисления в 16 систему счисления

        System.out.println("\n\nЭта программа переводит число из десятичной системы счисления в шестнадцатиричную.\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число в десятичной системе счисления:");

        int numDecimal = in.nextInt();
        StringBuilder numSix = new StringBuilder();
        int numA = numDecimal;
        int numB;
        //String numC;

        if (numDecimal <= 0) {
            System.out.println("Необходимо указать целое число больше нуля.\n" + "Повторите попытку.");
        } else {
            do {
                numB = numA % 16;
                numA = numA / 16;

                if (numB == 10) { numSix = numSix.append("A"); }
                    else if (numB == 11) { numSix = numSix.append("B"); }
                    else if (numB == 12) { numSix = numSix.append("C"); }
                    else if (numB == 13) { numSix = numSix.append("D"); }
                    else if (numB == 14) { numSix = numSix.append("E"); }
                    else if (numB == 15) { numSix = numSix.append("F"); }
                    else { numSix = numSix.append(numB); }

            } while (numA >= 1);
            System.out.printf("Число %d в шестнадцатиричной системе счисления равно: %s\n", numDecimal, numSix.reverse());
        }
    }
    public static void NewArray() {
/*      Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
        Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
        Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. Задачу решить наиболее оптимальным способом */

        int [] arr = {2, -3, 1, 3, 3, 10, 1, 0, 7, 4};  // здесь можно задать массив

        int numS = 7;     // здесь можно ввести число, определяемое как сумма чисел m и n

        System.out.println("\n\nЭта программа находит в заданном в её коде массиве чисел такие, которые в сумме дают 7.\n");
        System.out.printf("В массиве " + Arrays.toString(arr) +
                "\nсуществуют такие числа, сумма которых равна %d.\nВот эти числа и их индексы:\n", numS);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == (numS - arr[i]) && i < j) {
                    System.out.printf("%d[%d] + %d[%d] = %d\n", arr[i], i, arr[j], j, numS);
                }
            }
        }


    }

    public static void main(String[] args) {
        HomeWork.NOD();
        HomeWork.DoubleSystem();
        HomeWork.SixSystem();
        HomeWork.NewArray();
    }
}
