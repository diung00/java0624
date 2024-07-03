package d5.probs;
/*
int[]와 정수 두개를 인자로 받아,

첫번째 정수 index 원소 포함
두번째 정수 index 원소 제외

범위의 배열을 반환하는 메소드를 작성하시오.
*/

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 1;
        int end = 3;
        int[] result = subArray(arr, start, end);
        for (int num : result){
            System.out.println(String.format("%d", num));
        }
    }
    public static int[] subArray(int[] arr, int start, int end){
        int[] result = new int[end - start];

        for (int i = 0; i < result.length; i++){

            result[i] = arr[start + i];

        }
        return result;
    }
}
