package activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] num = {34, 12, 44, 76, 52};
        int temp = 0;
        System.out.println("Elements of array before sorting in ascending order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("\nElements of array sorted in ascending order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
