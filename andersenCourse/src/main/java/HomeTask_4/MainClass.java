package HomeTask_4;

import HomeTask_4.TASK_1_2_3_4.Animals;
import HomeTask_4.TASK_1_2_3_4.Cats;
import HomeTask_4.TASK_1_2_3_4.Dogs;
import HomeTask_4.TASK_5.Cat;
import HomeTask_4.TASK_5.Plate;
import HomeTask_4.TASK_6.Payment;
import HomeTask_4.TASK_7.Park;

public class MainClass {

    public static void main(String[] args) {

        // Tasks 1-4
        System.out.println("--------------------------- TASK 1-4 -----------------------------------------------------");

        Animals[] animals = new Animals[5];
        animals[0] = new Cats("Barsik");
        animals[1] = new Dogs("Doggi");

        // CAT example
        animals[0].run(200);
        animals[0].swim(100);

        // DOG example
        animals[1].run(400);
        animals[1].swim(11);

        //Animals count:
        System.out.println("Всего животных создано: " + Animals.getCount());
        System.out.println("Всего создано собак: " + Dogs.getDogCount());
        System.out.println("Всего животных котов: " + Cats.getCatCount());


        //Task 5
        System.out.println("------------------------------- TASK 5 ---------------------------------------------------");
        Cat cat1 = new Cat("Fedya", 101,false);
        Cat cat2 = new Cat("Mars", 99,false);

        Plate plate = new Plate(100);
        plate.info();

        //Первый кот кушает
        cat1.eat(plate);
        plate.info();
        cat1.info();

        //Второй кот кушает
        cat2.eat(plate);
        plate.info();
        cat2.info();


        // Создаем котов
        Cat[] catsArray = new Cat[2];
        catsArray[0] =  new Cat("Snikers",10,false);
        catsArray[1] =  new Cat("Pluto",20,false);

        //Создаем тарелку и кормим котов
        Plate plate2 = new Plate(100);

        plate2.info();
        catsArray[0].eat(plate2);
        catsArray[0].info();
        catsArray[1].eat(plate2);
        catsArray[1].info();
        plate2.info();

        //добавляем в тареклу еду
        plate2.addFood(30);
        plate2.info();



        //Task 6
        System.out.println("----------------------------------- TASK 6 -----------------------------------------------");
        Payment payment1 = new Payment(1, "22.12.2024", 12, "Mars", "Nestle Inc","Milan","Italy","Low 22");
        payment1.info();
        Payment payment2 = new Payment(2,"23.12.2024",22,"Белгоспищепролм","Коммунарка","Минск","PБ","Свободы 20");
        payment2.info();



        //Task 7
        System.out.println("----------------------------------- TASK 7 -----------------------------------------------");
        Park newPark = new Park("CentralPark",10.0,"USA","NY","Low Steeet 22", 221289,"park@gmail.com","232323242","parkNY");
        newPark.info();
        newPark.address.info();
        newPark.contactInfo.info();
        }
}// end class
