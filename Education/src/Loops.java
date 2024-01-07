public class Loops {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorialWhile(5));
        System.out.println(getSum(12345));
        System.out.println(getSumFor(12345));
        System.out.println(getSumFromSale());
        System.out.println(isSimpleNumber(5));
        System.out.println(recursionFactorial(5));
    }

    public static int getFactorial(int n) {
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int getFactorialWhile(int n) {
        int result = 1;

        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }

        return result;
    }

    public static int getSum(int num) {
        int sum = 0;

        int currentValue = num;

        while (currentValue != 0) {
            sum += currentValue % 10;

            currentValue /= 10;
        }

        return sum;
    }

    public static int getSumFor(int num) {
        int sum = 0;

        for (int currentValue = num; currentValue != 0; currentValue /= 10) {
            sum += currentValue % 10;
        }

        return sum;
    }

    public static double getSumFromSale() {
        double sum = 24;

        for (int year = 1627; year < 2024; year++) {
            sum += (sum * 0.05);
        }

        return sum;
    }

    public static boolean isSimpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int recursionFactorial(int n) {
        if (n == 1) return 1;

        return n * recursionFactorial(--n);
    }
}