import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bingo {

    public static void randomNumber(){
        Random number = new Random();
        int[] array;
        array = new int[16];

        for(int i=0; i < array.length;i++){
            if(array[i]==0){
                array[i] = number.nextInt(99-1)+1;
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        randomNumber();
    }
}

