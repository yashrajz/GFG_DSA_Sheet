import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(5); //intial capacity is 5

        // list.add(5);    //to add elements in a arraylist
        // list.add(98); 
        // list.add(54);
        // list.add(45);
        // list.add(87);   // It can have more than 5 (initial capacity) elements as it is an dynamic array.
        // list.add(54);   

        // System.out.println(list.contains(7888)); // checks if an elements is present in array.
        
        // System.out.println(list);

        // list.set(0, 99);
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);

        //taking input from user
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // list[i] doesn't work with ArrayList
        }




    }
}
