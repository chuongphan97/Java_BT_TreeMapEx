import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = sc.nextLine();

        String[] sArr = s.split("");
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        int value;
        for (int i = 0; i < s.length(); i++) {
            String key = sArr[i];
            if (treeMap.containsKey(key)) {
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key,value+1);
            } else treeMap.put(key,1);


        }

        System.out.println(treeMap);
    }
}
