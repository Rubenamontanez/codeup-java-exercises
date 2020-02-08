import java.util.TreeMap;

public class Test005 {

    public static void main(String[] args) {
        int count = 6;
        int min = 1;
        int max = 49;

        // random number mapped to the count of its occurrences
        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for (int i=0; i<count; i++){
            int d = ( min + (int) (Math.random() * (max-count+1)) );
            if (!mp.containsKey(d)){
                mp.put(d, 0);
            }
            mp.put(d, mp.get(d) + 1);
        }

        // now ensure the output numbers are different
        int j = 0;
        for (int num : mp.keySet()){
            int cnt = mp.get(num);
            for (int i=0; i<cnt; i++){
                System.out.println(num + j);
                j++;
            }
        }
    }

}