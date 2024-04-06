package test;

import structures.Bag;

public class BagDriver {
    public static void main(String[] args) {
        Bag bagOfColors = new Bag(10);
        bagOfColors.add("blue");
        bagOfColors.add("red");
        bagOfColors.add("yellow");
        bagOfColors.add("white");
        bagOfColors.add("purple");

        System.out.println(bagOfColors);

        System.out.println("Contains(blue): " + bagOfColors.contains("blue"));
        System.out.println("Contains(black): " + bagOfColors.contains("black"));

        System.out.println("Remove(blue): " + bagOfColors.remove("blue"));
        System.out.println(bagOfColors);
        System.out.println("Contains(Purple): " + bagOfColors.contains("purple"));
        System.out.println("Size: "+bagOfColors.size());
    }
}
