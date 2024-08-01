package Practise_Coding;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MergeArrayListToQueue {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Create a Queue (LinkedList is commonly used to implement Queue interface)
        Queue<Integer> queue = new LinkedList<>();

        // Merge elements from list1 and list2 into the Queue
        for (Integer num : list1) {
            queue.offer(num); // Adds element to the end of Queue
        }
        for (Integer num : list2) {
            queue.offer(num); // Adds element to the end of Queue
        }

        // Print the elements of the Queue (merged elements)
        System.out.println("Merged Queue elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // Retrieves and removes the head of the Queue
        }
    }
}
