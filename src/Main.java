public class Main {

    public static void main(String[] args) {
        // This app creates an array and fills it with numbers in range (9-0)
        int[] numbers = new int[10];
        for (int i = 1; numbers.length > i; i++)
        {
            numbers[i-1] = numbers.length - i;
        }
        for (int num : numbers)
        {
            System.out.println(num);
        }
    }
}
