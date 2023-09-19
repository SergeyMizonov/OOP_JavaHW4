package Homework4;

public class Program {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("Weight of box №1: " + box1.getWeight());
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("Weight of box №2: " + box2.getWeight());
        System.out.println("The weight of the boxes is " + (box1.compare(box2) ? "same" : "different") + ".");
        System.out.println("Box №1 contains " + box1.getProduct().get(0).getClass().getSimpleName());
        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("Weight of box №3: " + box3.getWeight());
        System.out.println("Box №3 contains " + box3.getProduct().get(0).getClass().getSimpleName());
        box1.shiftSingleItem(box3);
        System.out.println("Weight of box №3: " + box3.getWeight());
        System.out.println("Weight of box №1: " + box1.getWeight());
        try {
            box2.shiftSingleItem(box3);
        } catch (BoxMix e) {
            System.out.println(e);
        }
        System.out.println("Weight of box №3: " + box3.getWeight());
        System.out.println("Weight of box №2: " + box2.getWeight());
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxMix a) {
            System.out.println(a);
        }
        System.out.println("Weight of box №3: " + box3.getWeight());
    }
}
