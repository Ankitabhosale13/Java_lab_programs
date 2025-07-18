class Employee
{
  int eid;
  String ename;

public Employee()
{

}
public static void main(String args[])
{
   Employee e1=new Employee();
   Employee e2=new Employee();
   System.out.println(e1.eid);
   
   System.out.println(e1.ename);

   System.out.println(e2.eid);
   
   System.out.println(e2.ename);
}
}