public class Task2 {
public static void main(String[] args) {
    int[] numbers = { 12, 5, 28, 19, 3, 7, 15, 9};
    int l = numbers[0];
    int s = numbers[0];
    int lIndex = 0;
    int sIndex = 0;
    for (int i = 0; i < numbers.length; i++){
        if (numbers[i] > l) {
            l = numbers[i];
            lIndex=i;
        } else if (numbers[i] < s){
            s = numbers[i];
            sIndex=i;
        }
    }
    System.out.print("Array: ");
    for (int num:numbers){
        System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Largest: " + l + " at index " + lIndex);
    System.out.println("Smallest: " + s + " at index " + sIndex);
    }
}
