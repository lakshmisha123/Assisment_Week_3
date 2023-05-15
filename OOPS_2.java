package Java_Assisment_3ed_week;

    class Cone{
        Cone(){
            System.out.println("OOPS_Problem_2");
        }
        public int add(int a, int b){
            return a+b;
        }
        public int sub(int a, int b){
            return a-b;
        }
    }
    public class OOPS_2 {
        public static void main(String[]args){
            Cone obj = new Cone();
            System.out.println("Addition:\n"+obj.add(135,150));
            System.out.println("Subtraction:\n"+obj.sub(135,155));
        }
    }

