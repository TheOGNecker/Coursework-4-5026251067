/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2026-2027
 * Coursework   : 04
 * Student ID   : 5026251067
 * Full Name    : Ezra Gavrila Simangunsong
 * Class        : C
 */

// Important Notes:
// CRUD
// C - Create
// R - Read
// U - Update
// D - Delete

import java.util.*;

public class Practice {

    // public static void main(String[] args){
    //     ArrayList<Integer> l = new ArrayList<>();
    //     l.add(5);
    //     l.add(10);
    //     l.add(5);
    //     l.add(15);
    //     l.add(1, 9);
    //     l.set(3, 25);
    //     l.remove(2);
    //     // l.remove(l.indexOf(5));
    //     l.remove((Integer) 5);
    //     System.out.println(l);
    // }

    
    // // Coursework 4 - Problem 1
    // public static void collectionMystery4(ArrayList<Integer> v) {
    //     for (int i = 1; i < v.size(); i += 2) {
    //         if (v.get(i - 1) >= v.get(i)) {
    //             v.remove(i);
    //             v.add(0, 0);
    //         }
    //     }
    //     System.out.println(v);
    // }

    // public static void main(String[] args) {
    //     ArrayList<Integer> la = new ArrayList<>();
    //     ArrayList<Integer> lb = new ArrayList<>();
    //     ArrayList<Integer> lc = new ArrayList<>();
    //     Integer[] a = {10, 20, 10, 5};
    //     Integer[] b = {8, 2, 9, 7, -1, 55};
    //     Integer[] c = {0, 16, 9, 1, 64, 25, 25, 14, 0};
    //     la.addAll(Arrays.asList(a));
    //     lb.addAll(Arrays.asList(b));
    //     lc.addAll(Arrays.asList(c));
    //     collectionMystery4(la);
    //     collectionMystery4(lb);
    //     collectionMystery4(lc);
    // }


    // // Coursework 4 - Problem 2
    // public static void collectionMystery9(Queue<Integer> queue, int p) {
    //     Stack<Integer> stack = new Stack<Integer>();
    //     int count = 0;
    //     int size = queue.size();
    //     for (int i = 0; i < size; i++) {
    //         int element = queue.remove();
    //         if (element < p) {
    //             queue.add(element);
    //         } else {
    //             count++;
    //             stack.push(count);
    //             stack.push(element);
    //         }
    //     }
    //     while (!stack.isEmpty()) {
    //         queue.add(stack.pop());
    //     }
    //     System.out.println(queue);
    // }

    // public static void main(String[] args) {
    //     Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    //     collectionMystery9(queue1, 4);

    //     Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(67, 29, 115, 84, 33, 71, 90));
    //     collectionMystery9(queue2, 50);
    // }
    
}
