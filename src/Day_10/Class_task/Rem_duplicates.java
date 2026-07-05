package Day_10.Class_task;

public class Rem_duplicates {
    public static void main(String[] args){
        String[] arr={"sam","ram","sam","vaishu"};
        int j;
        for(int i=0;i<arr.length;i++){
            for( j=0;i<arr.length;j++) {
                if (arr[i].equals(arr[j])) {
                    break;
                }
            }
                if(i==j){
                    System.out.println(arr[i]);
            }
        }
    }
}
