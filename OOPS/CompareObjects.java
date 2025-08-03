import java.util.ArrayList;
import java.util.Collections;

public class CompareObjects {

    // sort on the basis of the unit digit number 
    // and if unit digit is same then print the smaller number first
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(11);
        arr.add(10);
        arr.add(17);
        arr.add(15);

        CompareObjects c1 = new CompareObjects();
        Collections.sort(arr);
        c1.display(arr);
    }

    public <T> void display(ArrayList<T> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
            if (i!=list.size()-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
