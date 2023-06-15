import java.util.Scanner;

class RepeatElement {
    public static void repeatingNumbers(int arr[], int n) {
        int i, j;
        System.out.print("Repeating Elements are { ");
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        RepeatElement repeat = new RepeatElement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        repeatingNumbers(arr, n);
    }
}
