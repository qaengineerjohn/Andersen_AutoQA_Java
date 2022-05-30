package HomeTask_4.TASK_5;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite,boolean satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public  void eat(Plate plate){
        if (plate.decreaseFood(appetite) == true){
          System.out.println("Кот покушал и кот сыт");
          satiety = true;
        } else {
            System.out.println("Кот не покушал и кот не сыт");
            satiety = false;
        }
    }

    public void info(){
        System.out.println("---------\n"+"Кот: \n" + "Имя кота: " + name + "\n" + "Аппетит кота: " + appetite + "\n" + "Сытость кота: " + satiety + "\n----------------");
    }
}//end class
