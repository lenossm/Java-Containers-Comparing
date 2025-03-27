package ge.tbc.testautomation.runners;

import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.*;
import java.util.List;
import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;

public class ContainersAndComparing {
    public static void main(String[] args) {

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-6667");


        Iterator<String> iterator = phoneNumbers.iterator();
        System.out.println("Phone Numbers: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Giorgi", "555-887-987");
        phoneBook.put("Nika", "555-542-231");
        phoneBook.put("Elene", "555-161-143");
        phoneBook.put("Lizi", "555-189-6667");

        System.out.println("\nNames with phone Numbers containing '8' : ");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey());
            }
        }

        TreeSet<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(4.5));
        treeSet.add(new Circle(3.3));
        treeSet.add(new Circle(7.1));
        treeSet.add(new Circle(3.3));
        treeSet.add(new Circle(10.7));
        treeSet.add(new Circle(3.7));
        treeSet.add(new Circle(4.1));
        treeSet.add(new Circle(6.9));
        treeSet.add(new Circle(4.5));
        treeSet.add(new Circle(9.6));

        System.out.println("\nTreeSet elements : ");
        for (Circle c : treeSet) {
            System.out.println(c);
        }

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1,2));
        rectangles.add(new Rectangle(7,5));
        rectangles.add(new Rectangle(3,8));
        rectangles.add(new Rectangle(6,4));

        Comparator<Rectangle> reverseComparator = (r1, r2) -> Double.compare(r2.getArea(), r1.getArea());

        rectangles.sort(reverseComparator);

        System.out.println( "\nSorted Rectangle objects:" );
        for (Rectangle r : rectangles) {
            System.out.println(r);
        }

    }



}
