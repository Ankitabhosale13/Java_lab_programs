class vowels
{
public static void main(String args[])
{
String s="This is a vowels program";
String temp=s.toLowerCase();
for(int i=0;i<temp.length();i++)
{
if(temp.charAt(i)=='a' || temp.charAt(i)=='e' || temp.charAt(i)=='i' || temp.charAt(i)=='o' || temp.charAt(i)=='u')
{
System.out.println("vowels are:" +temp.charAt(i)+" "+i);

}
}
}
}