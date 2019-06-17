import java.util.Scanner;
public class tools {
    /**
     * print a line on the screen
     * 
     * @param a what symbol to print
     * @param x how many lines to print
     * @param y how many columns to print
     */
    // a = symbol, x = line, y = column
    // method 1
    public static void printLine(String a, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
    /**
     * print a line on the screen
     * 
     * @param a what symbol to print
     * @param y how many columns to print
     */
    // method 2
    public static void printSquare(String a, int x, int y) {
        for (int i = 0; i < x; i++) {
            printLine(a, y);
        }
    }
    // method 3
    /**
     * print a line on the screen
     * 
     * @param a what symbol to print
     * @param x how many lines to print
     * @param y how many columns to print
     */
    public static void printRectangle1(String a, int x, int y) {
        for (int i = 0; i < y; i++) {
            printLine(a, y);
        }
        System.out.println();
    }
    // get a integer from user input
    public static int getInt() {
        System.out.println("Enter an Integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static int getInt(String str) {
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    // get a String
    /**
     * public: range static: class methods, className, toolsName() String: the type
     * of return, void: non return getStr: methodName (String str): parameter list,
     * (int x, int y, String str) (int x) <> )(int a)
     * 
     * @param str
     * @return
     */
    public static String getStr() {
        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    // add method in tools.java
    public static int add(int a, int b) {
        return a + b;
    }
    /**
     * !!!Pass bt Value but this method don't work as intended because java pass
     * parameter by value
     * 
     * @param c
     * @return
     */
    public static int modify(int c) {
        return c = 5;
    }
    // local variable局部变量
    // public static void modify(int c) {
    // c = 5;
    // }
    public static String weekday(int d) {
        if (d == 1) {
            return "Monday";
        } else if (d == 2) {
            return "Tuesday";
        } else if (d == 3) {
            return "Wednesday";
        } else if (d == 4) {
            return "Thursday";
        } else if (d == 5) {
            return "Friday";
        } else if (d == 6) {
            return "Saturday";
        } else if (d == 7) {
            return "Sunday";
        } else {
            return "You have to enter a number between 1 - 7";
        }
    }
}
