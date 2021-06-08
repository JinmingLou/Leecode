package algorithm.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountMaxWords {
    FileReader fileReader;
    BufferedReader bufferedReader;
    HashMap<String, Integer> countWords;
    String temp;
    String[] listwords;
    int blankNum = 0;

    public void findMax(String fileName) throws IOException {
        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        countWords = new HashMap<>();
        char[] charTemp;
        while((temp = bufferedReader.readLine()) != null) {
            listwords = temp.split(" ");
            for (String str : listwords) {
                if(!countWords.containsKey(str)) {
                    countWords.put(str, 0);
                } else {
                    countWords.put(str, countWords.get(str) + 1);
                }
            }
        }

        Integer[] values = countWords.values().toArray(new Integer[0]);
        Arrays.sort(values,Collections.reverseOrder());
        ArrayList arr = new ArrayList<String>();
        for (int i = 0; i < 100 || i >= values.length; i ++) {
            Set set = countWords.entrySet();
            Iterator it = set.iterator();
            while(it.hasNext()) {
                Map.Entry entry = (Map.Entry)it.next();
                if(entry.getValue().equals(values[i])) {
                    String s = (String) entry.getKey();
                    arr.add(s);
                }
            }
        }

        System.out.println(arr);
    }
}