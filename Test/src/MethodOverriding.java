class parent
{ 
	void m1()
	{ System.out.println("parent");}
	void m2()
	{ System.out.println("parent22222222 "); }
}
class child extends parent
{ 
	void m1()
	{ System.out.println("child"); }
	void m3()
	{ System.out.println("child222222222222"); }
}
class MethodOverriding
{ public static void main(String[]dsdsd){
child c=new child();
parent p=new parent();
parent p1=new child();
p1.m1();//child
p1.m2();//parent22
p1.m3();


}}
