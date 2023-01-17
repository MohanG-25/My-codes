import java.lang.*;
import java.util.Date;
import java.text.SimpleDateFormat;
// class Person{
//     String name;
//     Date dob;
//     int rollno;
//     void readData(String n,Date d,int r){
//         name=n;
//         dob=d;
//         rollno=r;
//     }
//     void printData(){
//          System.out.println(name);
//          System.out.println(dob);
//          System.out.println(rollno);
//     }
// }
// class Student extends Person{
//     String insitution;
//     int qualif[]=new int[100];
//     int rollno;
//     int marks[]=new int[5];
//     void printData(){
//         printData();
//         System.out.println("insitution:"+insitution);
//         System.out.println("roll:"+rollno);
//         for(int q=0;q<qualif.length;q++){
//             System.out.println("marks:"+q+":"+qualif[q]);
//         }
//         for(int m=0;m<marks.length;m++){
//             System.out.println("result:"+m+":"+marks[m]);
//        }
//     }
// }
// class Employee extends Person{
//     int empno;
//     int salaryHistory[]=new int[12];
//     String oragnization;
//     String designation;
//     Date dob;
//     void printSalary(){
//         for(int s=0;s<salaryHistory.length;s++){
//             System.out.println("salary:"+s+":"+salaryHistory[s]);
//         }
//     }
// }
// public class multipleInherit{
//     public static void main(String args[]){
//         Person p=new Person();
//         Student s=new Student();
//         Employee e=new Employee();
//         p.printData("mohan",12,2018128);
//         // e.printSalary();
//     }
// }

public class multipleInherit{
    public static void main(String arge[]){
        String s="12/03/2003";
        Date d=new SimpleDateFormat("dd/MM/yyyy").parseDate(s);
        System.out.println(d);

    }
}