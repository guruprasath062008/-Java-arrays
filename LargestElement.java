public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 23, 67, 34};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest: " + largest);
    }
}
