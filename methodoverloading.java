class methodoverloading
{

void show(int a,String b) 
{
 System.out.println(11);
}
void show(String a ) 
{
 System.out.println(12);
}
public static void main(String args[])
{
methodoverloading m1=new methodoverloading();
m1.show("Sona");
}
}


