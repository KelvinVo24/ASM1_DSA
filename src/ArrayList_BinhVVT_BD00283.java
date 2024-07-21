import java.util.ArrayList;

public class ArrayList_BinhVVT_BD00283 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(283);
        arr.add(2004);
        arr.add(25);

        int len = arr.size();
        for (int i = 0; i < len; i++) {
            System.out.println(arr.get(i));
        }
    }
}
