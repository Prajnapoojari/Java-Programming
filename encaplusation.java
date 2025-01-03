//class person
//{
//    private String name= "Rajib";
//    private int age = 22;
//
//    public void setName(String name1) {
//        name = name1;
//    }
//    public void setAge(int age1){
//        age = age1;
//    }
//}
//public class encaplusation {
//    public static void main(String []args){
//        person obj = new person();
////        System.out.println(obj.getName());
////        System.out.println(obj.getAge());
//        obj.setName("Virat");
//        obj.setAge(35);
//       System.out.println("Name of the person is : "+obj.getName());
//       System.out.println("Age of the person is: " +obj.getAge());
//
//    }
//}

class student{
    private String name = "Rajib";
    private String branch = "JAVA";
    private int rollno = 70;
    private String address = "Odisha";
    private int age = 22;

    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public int getRollno(){
        return rollno;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name1){
        name = name1;
  }
   public void setAge(int age1){
        age = age1;
   }
    public void setBranch(String newbranch){
        branch=newbranch;
    }
    public void setRollno(int roll){
        rollno = roll;

    }
    public void setAddress(String newaddress){
        address = newaddress;
    }

}

public class encaplusation {
   public static void main(String []args){
       student obj = new student();
       System.out.println(obj.getAddress());
       System.out.println(obj.getName());
       System.out.println(obj.getAge());
       System.out.println(obj.getBranch());
       System.out.println(obj.getRollno());
       obj.setName("Rohit");
       obj.setAddress("Mumbai");
       obj.setAge(30);
       obj.setBranch("Btech");
       obj.setRollno(45);
       System.out.println("new name is: "+obj.getAddress());
       System.out.println("new name is: "+obj.getName());
       System.out.println("new name is: "+obj.getBranch());
       System.out.println("new name is: "+obj.getRollno());
       System.out.println("new name is: "+obj.getAge());
   }
}

