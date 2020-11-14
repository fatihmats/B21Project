public class FindMaxNumbers {
    public static void main(String[] args) {
        int [][] arr = {{1,3,5}, {7,-5,18},{-2,3,7}};
        int max = arr[0][0];
        for (int[] each:arr) {
            for (int each1:each) {
                if (each1>max){
                    max=each1;
                }

            }
      //find max
        }
        System.out.println("Max number is : "+max);
    }
}
