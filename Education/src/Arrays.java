public class Arrays {
    public static void main(String[] args) {
        arrayTest();

        multidimensionalArrayTest();

        reverseArray();

        printAndFillIntArray();

        compareArrays();

        getMinMaxIndex();

        System.out.println(getSumElements());
    }

    public static void arrayTest() {
        int[] values = {1, 4, 5, 5, 3}; // initializing an array

        System.out.println(values[2]);

        values[3] = 24; // add or replace element

        int[] values2 = new int[10]; // create an empty array  size = 10

        System.out.println(values2[0]); // initial value of empty array

        // Iteration over array
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
            System.out.println(values2[i]);
        }

        System.out.println();
    }

    public static void multidimensionalArrayTest() {
        int [][] values = new int[2][3]; // create an empty multidimensional array

        int[][] values2 = {  // initializing a multidimensional array
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iteration over a multidimensional array
        for (int i = 0; i < values2.length; i++) {
            for (int j = 0; j < values2[i].length; j++) {
                System.out.print(values2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printAndFillIntArray() {
        int[] arr = new int[100];

        int currentIndex = 0;

        for (int currentNumber = 1; currentIndex < arr.length; currentNumber++) {
            if (currentNumber % 13 == 0 || currentNumber % 17 == 0) {
                arr[currentIndex] = currentNumber;
                currentIndex++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void compareArrays() {
        int[][] values = {
                {1, 2, 3, 4},
                {5, 4, 7},
                {8}
        };

        int[][] values2 = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8}
        };

        System.out.println(equals(values, values2));
    }

    public static boolean equals(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            int[] values = arr1[i];
            int[] values2 = arr2[i];

            if (values.length != values2.length) {
                return false;
            }

            for (int j = 0; j < values.length; j++) {
                if (values[j] != values2[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void getMinMaxIndex() {
        int[] value = {1, 2, 4, 0, -8, 10, 353, 32};

        System.out.println(getIndexMinValue(value));
        System.out.println(getIndexMaxValue(value));
    }

    public static int getIndexMinValue(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }

    public static int getIndexMaxValue(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[index]) {
                index = i;
            }
        }

        return index;
    }

    public static int getSumElements() {
        int[] values = {31, 2, 3, -4, 5, 6, 7, 8, 9};
        
        int sum = 0;

        int min = getIndexMinValue(values);

        int max = getIndexMaxValue(values);

        int start = Math.min(min, max);

        int end = Math.max(min, max);

        for (int i = start + 1; i < end; i++) {
            sum += values[i];
        }

        return sum;
    }
}
