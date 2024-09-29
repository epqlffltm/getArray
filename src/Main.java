import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Mod mod = new Mod();

        int num = rand.nextInt(5) + 5;

        int[] ary = new int[num];

        for (int i = 0; i < num; i++) {
            ary[i] = rand.nextInt(100);
        }

        System.out.println("Array: ");
        for (int i : ary) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Sum: " + mod.getSum(num, ary));
        System.out.println("Max: " + mod.getMax(num, ary));
        System.out.println("Count greater than 50: " + mod.getCount(num, ary, 50));

        int[] swappedArray = mod.swapArray(num, ary);
        System.out.println("Swapped Array: ");
        for (int i : swappedArray) {
            System.out.print(i + " ");
        }
    }
}
