public class funcarr {
    public static void increament(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,7,8,6,5,2};
        increament(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
