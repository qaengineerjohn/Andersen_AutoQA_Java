package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList;
    private List<T> list;
    private double totalWeight;

    public Box() {
        list = new ArrayList<T>();
        this.fruitList = new ArrayList<>();
    }

    public void add(T obj) {
        list.add(obj);
        totalWeight = totalWeight + obj.getWeight();
    }

    public List<T> getList() {
        return list;
    }

    public double getTotalWeight() {
        System.out.println("Общий Вес:" + totalWeight);
        return totalWeight;
    }

    public void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке " + list.get(0).toString() + " в количестве: " + list.size()+ "шт" );
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getTotalWeight() == box.getTotalWeight();
    }

    public void move(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }
}//end class
