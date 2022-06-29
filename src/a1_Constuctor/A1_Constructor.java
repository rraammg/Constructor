package a1_Constuctor;

public class A1_Constructor {
	public static  int i;
	public static int j;
	
public  A1_Constructor()
{
	 i=5;
	 j=5;
}
public A1_Constructor(int i,int j)
{
	this.i=i;
	this.j=j;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(i);
System.out.println(j);
A1_Constructor a=new A1_Constructor();
System.out.println(i);
System.out.println(j);
A1_Constructor b=new A1_Constructor(5,5);
System.out.println(i);
System.out.println(j);
	}

}
