import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()){
            String voice = br.readLine();
            if (frequencyMap.containsKey(voice)){
                Integer count = frequencyMap.get(voice) + 1;
                frequencyMap.put(voice,count);
            }
            else {
                frequencyMap.put(voice,1);
            }
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()){
            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue());
        }
        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".

    }
}