//Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
import java.util.List;
import java.util.Objects;

import static java.util.Collections.*;

public class EvenNumbers {
    public void printEvenNumbers(List<Integer> nums){
        System.out.println();
        for(int i = 0; i<nums.size(); i++){
            sort (nums);
            if ((nums.get(i) % 2) == 0 && !Objects.equals(nums.get(i), nums.get(i - 1))) {
                System.out.print(nums.get(i) + " ");
            }
        }
    }
}
