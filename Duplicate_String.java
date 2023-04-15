public class DuplicateString {
    public static void main(String[] args) {
        String str = "Hello World";
        int count;
        char[] stringArray = str.toCharArray();

        System.out.println("Duplicate characters are:");

        for (int i = 0; i < stringArray.length; i++) {
            count = 1;
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i] == stringArray[j] && stringArray[i] != ' ') {
                    count++;
                    stringArray[j] = '0';
                }
            }
            if (count > 1 && stringArray[i] != '0') {
                System.out.println(stringArray[i]);
            }
        }
    }
}