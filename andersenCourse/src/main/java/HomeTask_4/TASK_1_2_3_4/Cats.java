package HomeTask_4.TASK_1_2_3_4;

public class Cats extends Animals {

    private static int catCount;

    public Cats(String name){
      super(name);
      catCount++;
  }

    public static int getCatCount() {
        return catCount;
    }

  @Override
    public void run(int distanceToRun){
      if (distanceToRun < 0 || distanceToRun > 200){
          System.out.println("Коты не могут пробежать более 200м либо значение отрицательное");
      } else {
          System.out.println(name + " пробежал: "+ distanceToRun+"м");
      }
  }

    @Override
    public void swim(int distanceToSwim) {
        System.out.println("Коты не плавают");
    }

}//end class
