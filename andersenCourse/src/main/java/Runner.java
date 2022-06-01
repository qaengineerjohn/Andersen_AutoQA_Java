import Task_2.Apple;
import Task_2.Box;
import Task_2.Orange;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        //Task_1
        System.out.println("-----------Task_1-----------");
        Integer[] arrayInt= {1,2,3,4,5};
        changeElementsPositionInArray(arrayInt,0,1);
        System.out.println(Arrays.toString(arrayInt));

        String[] arrayString = {"one","two","three","four","five"};
        changeElementsPositionInArray(arrayString,3,4);
        System.out.println(Arrays.toString(arrayString));


        //Task 2
        System.out.println("-----------Task_2-----------");
        // создаем и заполняем коробку orangeBox1
        Box<Orange> orangeBox1 = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        // создаем orangeBox2
        Box<Orange> orangeBox2 = new Box();

        // создаем и заполняем коробку appleBox1
        Box<Apple> appleBox1 = new Box();
        appleBox1.add(new Apple());

        // создаем и заполняем коробку appleBox2
        Box<Apple> appleBox2 = new Box();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        //выводим информацию о коробках и их заполненности
        System.out.println("-----------Вывод информации о коробках -----------");
        orangeBox1.info();
        orangeBox2.info();
        appleBox1.info();
        appleBox2.info();

        //выводим информацию о весе
        System.out.println("-----------Вывод информации о весе -----------");
        orangeBox1.getTotalWeight();
        orangeBox2.getTotalWeight();
        appleBox1.getTotalWeight();
        appleBox2.getTotalWeight();

        //пример сравнения коробок
        System.out.println("-----------Сравнение-----------");
        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox1));
        System.out.println("Сравнить вес appleBox1 и appleBox: " + appleBox1.compare(appleBox2));

        //перемещение
        System.out.println("-----------Перемещение-----------");
        orangeBox1.info();
        orangeBox2.info();
        orangeBox1.move(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();

    }

    // Task_1 Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <T> void changeElementsPositionInArray(T[] array, int index1, int index2) {
        T value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }
}//end class