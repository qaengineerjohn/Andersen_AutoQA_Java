public class MyArrayDataException extends Exception {
    public int number1;
    public int number2;

    MyArrayDataException(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}//end class

