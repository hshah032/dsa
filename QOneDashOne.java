public class QOneDashOne {
    public static void main(String[] args) {
        String str = "hellohi";
        System.out.println(isStringUnique(str));
    }

    public static boolean isStringUnique(String str) {

        boolean[] charSet = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int asciChar = str.charAt(i);

            if (charSet[asciChar])
                return false;
            charSet[asciChar] = true;
        }
        return true;
    }
}