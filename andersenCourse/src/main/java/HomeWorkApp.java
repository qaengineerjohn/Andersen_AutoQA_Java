public class HomeWorkApp {

    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //2 task
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //3 task
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //4 task
    public static void printColor() {
        int value = 22;

        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 & value<=100){
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    //5 task
    public static void compareNumbers(){
        int a = -100;
        int b = 4;

        if (a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}// end class
