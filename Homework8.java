import java.util.Arrays;
import java.util.Random;

public class Homework8 {

    public static void main(String[] args){
        int[] array = createRandomArray(8);
        System.out.println(Arrays.toString(array));
        System.out.println("Min array element: " + findMinElement(array));
        System.out.println("Max array element: " + findMaxElement(array));
        System.out.println("Average value: " + findAverage(array));
        System.out.println("Overall sum: " + totalSum(array));
    }

    private static long totalSum(int[] array) {
        long result = 0;
        for(int value : array){
            result += value;
        }
        return result;
    }

    private static long findAverage(int[] array) {
        long result = 0;
        for(int value : array){
            result += value;
        }
        return result/array.length;
    }

    private static int findMinElement(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < result){
                result = array[i];
            }
        }
        return result;
    }

    private static int findMaxElement(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > result){
                result = array[i];
            }
        }
        return result;
    }

    private static int[] createRandomArray(int size) {
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = new Random().nextInt();
        }
        return result;
    }
}
