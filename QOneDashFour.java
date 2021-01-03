import java.util.HashSet;

public class QOneDashFour {

    public static void main(String[] args) {

        String str1 = "rat";
        String str2 = "tar";
        String str3 = "catbac";
        String str4 = "baccat";

        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram(str3, str4));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!set.contains(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
