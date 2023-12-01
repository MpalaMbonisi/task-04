public class Main {
    public static void main(String[] args) {
        System.out.println("Result = " + maxNumInFamily(980));
    }

    private static int maxNumInFamily(int num){
        int index = 0, result=0;
        if (num < 100) index = 2;
        else if(num<1000) index = 3;
        else if (num< 10_000) index = 4;

        int array[] = new int[index];
        for (int i=0; i < array.length; i++){
            int x = num % 10;
            array[i] = x;
            num /= 10;
        }
        array = bubbleSort(array);

        for (int i=0; i < array.length; i++){
            result += array[i] * (Math.pow(10,index-1));
            index--;
        }

        String arrayStr = "Array : [ ";
        for (int x: array
             ) {
            arrayStr += x + " ";
        }
        System.out.println(arrayStr + "].");
        return result;
    }
    private static int[] bubbleSort (int[] array){
        for(int i=0; i < array.length; i++){
            for (int k = 0 ; k < array.length;k++){
                if ((k+1) != array.length && array[k] < array[k + 1]){
                    int x = array[k];
                    array[k] = array[k+1];
                    array[k+1] = x;
                }
            }

        }

        return array;
    }
}