import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Three {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray); // This line will not resize the array
        System.out.println(Arrays.toString(intArray));
    }
}