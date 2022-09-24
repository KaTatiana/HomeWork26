import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 3, 4, 4, 5, 5, 6, 7));
        String text="И моё сердце остановилось " +
                    "моё сердце замерло " +
                    "моё сердце остановилось " +
                    "моё сердце замерло";
        OddNumbers oddNumbers = new OddNumbers();
        EvenNumbers evenNumbers = new EvenNumbers();
        TextEditor textEditor = new TextEditor();
        oddNumbers.printOddNumbers(nums);
        evenNumbers.printEvenNumbers(nums);
        textEditor.deleteDoubleText(text);
        textEditor.reckoningDoubleText(text);
    }
}