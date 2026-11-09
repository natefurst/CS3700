public class MultiUse {

    public static void main(String[] args) {
        multiUse(9);
        multiUse(10, 90);
        multiUse(4, 34, 87);
    }

    // when 1 number print 1 to number 
    public static void multiUse(int num) {
        System.out.println("Counting to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    // when 2 numbersfind the average
    public static void multiUse(double num1, double num2) {
        double average = (num1 + num2) / 2;
        System.out.println("The average is " + average);
    }

    // when 3 numbers find the maximum
    public static void multiUse(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("The maximum is " + max);
    }
}
