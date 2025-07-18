class Student
{  
    int id;  
    int age;
    String name; 
	 
    //creating a parameterized constructor  
    Student(int i,int a,String n)
{  
    id = i; 
    age=a; 
    name = n; 
 }  
    //method to display the values  
    void display()
{
        System.out.println("student id is:" +id);
        System.out.println("student age is:" +age);
        System.out.println("student name is:" +name);

}  
   
    public static void main(String args[])
{  
    //creating objects and passing values  
    Student s1 = new Student(101,24,"Sakshi");  
    Student s2 = new Student(102,25,"Neha");  
    Student s3 = new Student(103,24,"Sanika");  
    Student s4 = new Student(104,21,"Disha");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
    s3.display();
    s4.display();
   }  
}  
