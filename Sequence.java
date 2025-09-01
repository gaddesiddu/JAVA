import java.util.ArrayList;

public class Sequence {
    public static void sq(int[] arr, int idx, ArrayList<Integer> stack) {
        int n = arr.length;
        if (idx >= n) {
            System.out.println(stack);
            return;
        }
        // Include the current element
        stack.add(arr[idx]);
        sq(arr, idx + 1, stack);

        // Exclude the current element (backtrack)
        stack.remove(stack.size() - 1);
        sq(arr, idx + 1, stack);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> stack = new ArrayList<>();
        sq(arr, 0, stack);
    }
}
