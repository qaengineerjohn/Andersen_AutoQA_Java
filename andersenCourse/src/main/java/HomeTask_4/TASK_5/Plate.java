package HomeTask_4.TASK_5;

public class Plate {

    private int food;
    public Plate(int food){
        this.food = food;
    }


    public boolean decreaseFood(int appetite) {
        if (appetite >= 0 && appetite <= food){
            food -= appetite;
            return true;
        } else {
            System.out.println("Не хватает еды");
            return false;
        }
    }

    public void addFood(int foodToAdd){
        food+= foodToAdd;
        System.out.println("В тарелку добавили еду в количестве: " + foodToAdd);
    }

    public void info(){
        System.out.println("В тарелке: " + food);
    }
}// end class
