import java.util.HashMap;

public class QOneDashThree {

    public static void main(String[] args) {

        String str = "hellohi";

        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicates2(str));
    }

    private static String removeDuplicates2(String s) {

        String str = "";
        HashMap<Integer, Character> map = new HashMap<>();

        map.put(0, s.charAt(0));
        str += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {

            if (!map.containsValue(s.charAt(i)))
                str += s.charAt(i);
            map.put(i, s.charAt(i));
        }
        return str;
    }

    private static String removeDuplicates(String s) {
        String str = "";

        boolean[] arr = new boolean[255];

        for (int i = 0; i < s.length(); i++) {
            int asci = s.charAt(i);

            if (!arr[asci])
                str += s.charAt(i);

            arr[asci] = true;
        }
        return str;
    }

}
