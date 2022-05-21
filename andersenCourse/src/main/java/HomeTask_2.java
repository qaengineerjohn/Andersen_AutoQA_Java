public class HomeTask_2 {

    public static void main(String[] arg) {

        // 1 task:
        checkSum(10, 11);

        // 2 task:
        checkNumber(0);

        // 3 task:
        determineNumber(0);

        // 4 task:
        printString("Hello, World!", 3);

        // 5 task:
        refactorArray();

        // 6 task:
        fillArray();

        // 7 task:
        checkArray();

        // 8 task:
        twoDimensionalArray();
    }


    // 1 task:
    public static boolean checkSum(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        if (sum >= 10 & sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // 2 task:
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }


    // 3 task:
    public static boolean determineNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число, и" + " return FALSE");
            return false;
        } else {
            System.out.println("Отрицательное число, и" + " return TRUE");
            return true;
        }
    }

    //4 task:
    public static void printString(String stringToPrint, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(stringToPrint);
        }
    }

    //5 task
    public static void refactorArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i]);
        }
    }

    //6 task
    public static void fillArray() {

        int[] array = new int[100];
        for (int i = 0; i < 100; i++)
            array[i] = i;

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    //7 task
    public static void checkArray() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + "-" + array[i] + " ");
        }
    }

    //8 task
    public static void twoDimensionalArray(){
        int[][] array = new int[5][5];

        array[0][0] = 1;
        array[1][1] = 1;
        array[2][2] = 1;
        array[3][3] = 1;
        array[4][4] = 1;

        array[0][4] = 1;
        array[1][3] = 1;
        array[3][1] = 1;
        array[4][0] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

} // end class
