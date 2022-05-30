package HomeTask_4.TASK_1_2_3_4;

public class Animals {

    public String name;
    private static int animalCount;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getCount() {
        return animalCount;
    }

    public void run(int distanceToRun){
        System.out.println(name + " пробежал: "+ distanceToRun);
    }

    public void swim(int distanceToSwim){
        System.out.println(name + " проплыл: "+ distanceToSwim);
    }

}// end class
