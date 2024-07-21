public class ReverseString{
    public static void reverseString(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, index - 1);
    }

    public static void main(String[] args) {
        String name = "Vo Van Thanh Binh";
        reverseString(name, name.length() - 1);
    }
}