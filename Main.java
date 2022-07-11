import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] task1 = new int[15];
        for (int i = 0; i < task1.length ; i++) {
            task1[i] =  -5 + (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(task1));
        task1(task1);

        int [] res = task2(task1);
        System.out.println(Arrays.toString(res));

        task3(res);
        System.out.println(Arrays.toString(res));



    }

    public static void task1(int[] a){

        int min = a[0];
        int index = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i]< min){
                min = a[i];
                index = i;

            }
        }
        int res = 1;
        int k = 0 ;
        for (int i = index+1; i < a.length; i++) {
            if (a[i]>0){
                k++;
                res *= a[i];
            }
        }
        if (k==0){
            return;
        }
        System.out.println(res);

    }

    public static int[] task2(int[] a){

        ArrayList<Integer> resList = new ArrayList<>();

        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] %2 == 0){
                resList.add(a[i]);
            }
        }
        int resArr[] = new int[resList.size()];
        for (int i = 0; i < resArr.length ; i++) {
            resArr[i] = resList.get(i);
        }
        Arrays.sort(resArr);
        return resArr;
    }

    public static void task3(int[] a){

        for (int i = 0; i < a.length ; i++) {
            if(a[i]<0){
                a[i] = 0;
            }
        }
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }

    }
}
