public class Main {

    public static void main(String[] args) {

        String[][] array4x4 = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        try {
            try {
                int result = MethodToCheckArray4x4.method(array4x4);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка ввода");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.number1 + "x" + e.number2);
        }
    }
}//end class
