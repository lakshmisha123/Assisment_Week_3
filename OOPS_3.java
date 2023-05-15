package Java_Assisment_3ed_week;

    class Avi{
        public void methodA(){
            System.out.println("Sub Class one");
        }
    }
    class Anu extends Avi{
        public void methodB(){
            System.out.println("Sub Class two");
        }
    }
    public class OOPS_3 {
        public static void main(String[]args){
            System.out.println("Main Class");
            Anu obj = new Anu();
            obj.methodA();
            obj.methodB();
        }
}
