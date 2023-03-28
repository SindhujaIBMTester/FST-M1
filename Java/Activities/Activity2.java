package activities;

public class Activity2 {

    public static void main(String[] args) {
        int addArrayof10s = 0;
        int[] numberArray = {10,77,10,54,-11,10};
        System.out.println("Print result:"+addResult(numberArray,addArrayof10s));
    }

    public static boolean addResult(int[] num,int arrof10s){

        System.out.println("Print length:"+num.length);
        for(int i=0;i < num.length;i++){
            if(num[i] %10 == 0){
                arrof10s = arrof10s+num[i];
            }
        }
        System.out.println("Print 10's array:"+arrof10s);
        return arrof10s == 30;
    }
}
