package Day_8.Home_task;

public class X_pattern {
    public static void main(String[] args){
        int n=7;
        for(int i=0;i<n;i++){
            if(i==2 || i==3||1==5){
                System.out.println( "*"+ " " + "*" );
            }
            else if(i==4){
                System.out.println(" * ");
            }
            else{
                System.out.println( "*" + " " + "*" );
            }
        }
    }
}
