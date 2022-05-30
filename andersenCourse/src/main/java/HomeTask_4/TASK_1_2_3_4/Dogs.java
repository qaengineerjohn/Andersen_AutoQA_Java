package HomeTask_4.TASK_1_2_3_4;

public class Dogs extends Animals {
    private static int dogCount;

    public Dogs(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distanceToRun){
        if (distanceToRun < 0 || distanceToRun > 500){
            System.out.println("Собака не может пробежать более 500м либо значение отрицательное");
        } else {
            System.out.println(name + " пробежал: "+ distanceToRun + "м");
        }
    }

    @Override
    public void swim(int distanceToSwim) {
        if (distanceToSwim < 0 || distanceToSwim > 10){
            System.out.println("Собака не может проплыть более 10м либо значение отрицательное");
        } else {
            System.out.println(name + " пролыл: "+ distanceToSwim + "м");
        }
    }

}// end class
