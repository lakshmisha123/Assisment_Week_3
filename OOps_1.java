package Java_Assisment_3ed_week;

abstract class Employ_detail{
    abstract void display();
}
class Details extends Employ_detail {
    void display() {
        String name = "Lakshmisha h r";
        int Emp_ID = 13;
        System.out.println("Employ name:\t"+name+"\nEmploy ID:\t"+Emp_ID);
    }
}

    public class OOps_1 {
        public static void main(String[]args){
            Employ_detail s = new Details();
            s.display();
        }

    }
