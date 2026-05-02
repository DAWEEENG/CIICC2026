public class TASK8 {

    // Method with variable arguments
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            // Using formula instead of loop
            int sum = num * (num + 1) / 2;

            System.out.println(num + " = " + sum);
            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total Sum: " + result);      
    }
}