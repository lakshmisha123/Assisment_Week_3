package Java_Assisment_3ed_week;
class Abstract_Class{
    void show(){
        System.out.println("Method");
    }
}
class Concrete_Class extends  Abstract_Class{
    void show(){
        System.out.println("Method Overriding");
    }
}
public class OOPS_5 {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[]args){

        System.out.println("Method Overloading:-");
        System.out.println("Addition Of Two Numbers:\n"+add(150,214));
        System.out.println("Addition Of Three Numbers:\n"+add(200,201,202));

        Concrete_Class obj = new Concrete_Class();
        obj.show();
    }
}

