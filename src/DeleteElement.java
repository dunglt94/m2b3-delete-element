import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[];
        int size;

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        System.out.println("Array before:");
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * size);
        }
        for (int x : arr) {
            System.out.printf("%2d%s", x, "\t");
        }
        System.out.print("\nEnter number to be deleted: ");
        int number = scanner.nextInt();
        int index = 0;
        boolean found = false;

        while (!found) {
            for (int i = 0; i < arr.length; i++) {
                if (number == arr[i]) {
                    index = i;
                    System.out.println("Number " + number + " position is " + (index + 1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(number + " is not found in the array");
                System.out.print("Enter number to be deleted: ");
                number = scanner.nextInt();
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Number " + number + " deleted");
        arr[arr.length - 1] = 0;
        System.out.println("Array after: ");
        for (int x : arr) {
            System.out.printf("%2d%s", x, "\t");
        }
    }
}
