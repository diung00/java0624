package d5;

public class Q1 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(maxWhere(numbers));

        System.out.println(minWhere(numbers));

        System.out.println(maxDiff(numbers));

    }

    public static int maxWhere (int[] numbers){
     //  첫번째 값을 기준으로
        int maxIdx = 0;
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            //현재 값
            int current = numbers[i];
            // 만약 현재 값이 더 큰다면,
            if (current > maxValue){
                // 현재 위지를 저장
                maxIdx = i;
                //현재값도 저장한다
                maxValue = current;
            }
            }
        return maxIdx;
    }

    public static int minWhere (int[] numbers) {

        int minIdx = 0;
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current < minValue) {
                minIdx = i;
                minValue = current;

            }

        }
        return minIdx;

    }
     public static int maxDiff( int[] numbers){
        int diff = 0;
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            if (current > maxValue) {
                maxValue = numbers[i];
            }
        }
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            if (current < minValue ){
                minValue = numbers[i];
            }
        }
        return maxValue - minValue;
     }


}
