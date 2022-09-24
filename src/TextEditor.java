//Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//Код должен работать с любой последовательностью и объемом списка слов.

//Напишите код, который выводит в консоль все количество дублей из списка слов.
//*Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
//В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
//В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//Код должен работать с любой последовательностью и объемом списка слов.

import java.util.*;

public class TextEditor {
    public void deleteDoubleText(String text){
        Set<Object> textSet = new HashSet<>();
        System.out.println();
        for(int i = 0; i<text.length(); i++) {
            textSet.add(text.substring(0, text.indexOf(" ")));
            text = text.substring(text.indexOf(" ")+1);
        }
        System.out.println(textSet);
    }
    public void reckoningDoubleText(String text){
        Map<String, Integer> mapText = new HashMap<>();
        for(int i = 0; i<text.length(); i++) {
            String word = text.substring(0, text.indexOf(" "));
            mapText.merge(word, 1, Integer::sum);
            text = text.substring(text.indexOf(" ")+1);
        }
        printDoubleText(mapText);
    }
    public void printDoubleText(Map<String, Integer> mapText){
        for (Integer numDoubleText: mapText.values()) {
            if(numDoubleText>1) {
                System.out.print("  " + numDoubleText);
            }
        }
    }
}
