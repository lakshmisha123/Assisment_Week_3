package Java_Assisment_3ed_week;

interface Student_Data{
    public void  data();
}
class Lakshmisha_HR implements Student_Data{
    public void data()
    {
        String name = "Lakshmisha_HR";
        int Reg_No = 05;
        System.out.println("Student name:\t"+name+"\nStudent Reg_NO:\t"+Reg_No);
    }
}
public class OOPS_4 {
    public static void main(String[]args){
        Lakshmisha_HR S = new Lakshmisha_HR();
        S.data();
    }
}
