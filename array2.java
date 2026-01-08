public class array2 {
    public static void main(String[] args) {
        double[] mylist = {1.9,2.9,3.4,3.5};
        for(int i = 0; i<mylist.length;i++){
            System.out.println(mylist[i]+" ");
        }
        double sum = 0;
        for(int i =0;i< mylist.length;i++){
            sum += mylist[i];
        }
        System.out.println("sum is :" +sum);
        double avg = 0;
        avg = sum / mylist.length;
        System.out.println("Aversage is "+avg );

//        int [] a = {9,7,10,20,8,39};
//        int min = 0;
//        min = a[0];
//        for(int i =0;i < a.length; i++){
//            if(a[i]<min){
//                min=a[i];
//
//            }
//
//        }
//        System.out.println(min);
    }
}
