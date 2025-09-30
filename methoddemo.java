//with return type and without parameter list
----------------------------------------------------
class A
{
int l=10,b=20;
int area()
{
return l*b;
}
}
class methoddemo2
{
public static void main(String args[])
{
A a1=new A();
int r=a1.area();
System.out.println("The area is:"+r);
}
}