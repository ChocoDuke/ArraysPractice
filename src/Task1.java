public class Task1 {
public static void main(String [] args) {
    int[] numbers = { 5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
    int p = 0;
    int n = 0;
    int z = 0;
    for (int num : numbers) {
        if (num > 0){
            p++;
        } else if (num < 0) {
            n++;
        } else {
            z++;
        }
    }
    System.out.print("Array: ");
    for (int num:numbers){
        System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Positive: " + p);
    System.out.println("Negative: " + n);
    System.out.println("Zero: " + z);
}
}
