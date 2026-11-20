public class Task3 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        float average = 0f;
        int aboveAverage = 0;
        for (int num : numbers) {
            sum += num;
        }
        average = (float)sum / numbers.length;
        for (int num : numbers){
            if (num > average) {
                aboveAverage++;
            }
        }
        System.out.print("Array: ");
        for (int num:numbers){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + aboveAverage);
    }
}
