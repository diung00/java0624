package d6.ex0701;

public class Qb {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = reverse(arr);
        System.out.println(result);




      //  System.out.println(Arrays.toString(arr));
    }

    public static int[] reverse2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        return arr;
    }


    public static int[] reverse(int[] arr){

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++ ){
            result[i] = arr[arr.length - 1 - i];
        }
        return result;

        }
    }


