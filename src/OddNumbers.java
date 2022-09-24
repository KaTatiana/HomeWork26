//Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
//Код должен работать с любой последовательностью и объемом списка чисел.

import java.util.List;

public class OddNumbers {

    public void printOddNumbers(List<Integer> nums){
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
