import java.util.Random;

class sample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //call the method
        System.out.println(generateString(15));
        //write test cases


    }


    //write a string generation method
    public static String generateString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++)
            sb.append(str.charAt(rnd.nextInt(str.length())));
        //add a null checker
        if(sb.toString() == null) {
            return "null";
        }
        return sb.toString();
    }
    //write a calculator method
    public static int calculate(int a, int b, char operator) {
        int result = 0;
        if(operator == '+') {
            result = a + b;
        }
        else if(operator == '-') {
            result = a - b;
        }
        else if(operator == '*') {
            result = a * b;
        }
        else if(operator == '/') {
            result = a / b;
        }
        else {
            System.out.println("Invalid Operator");
        }
        return result;
    }
    //write a method to find the largest number in an array
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //write a method to find the smallest number in an array
    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    //write a method to find the average of an array
    public static double findAverage(int[] arr) {
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/arr.length;
        return avg;
    }
    //write a method to find the median of an array
    public static double findMedian(int[] arr) {
        double median = 0;
        int middle = arr.length/2;
        if(arr.length%2 == 1) {
            median = arr[middle];
        }
        else {
            median = (arr[middle-1] + arr[middle])/2;
        }
        return median;
    }
    //write a method to find the mode of an array
    public static int findMode(int[] arr) {
        int mode = 0;
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j

}