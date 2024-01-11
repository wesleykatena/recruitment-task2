import java.util.Arrays;
import java.util.Random;

public class ArrSumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5)));
    }
    public static int[] createArray(int n) {
        Random random = new Random();
        int[] result = new int[n];
        int sum=0;

        for (int i = 0; i < result.length -1; i++) {
            int randomNumber;
            boolean isDuplicate;
            do {
                randomNumber = random.nextInt(100) + 1;

                isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (randomNumber == result[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            result[i] = randomNumber;
        }
        for (int x:result) {
            sum += x;
        }
        result[result.length - 1] = -sum;

        return result;
    }
}
