class ParentChildDriver{
    public static void main(String[]args){
	Parent p=new Parent();
	p.ma();
	//p.mb();
	System.out.println(p.name);
	Child c=new Child();
	c.ma();
	c.mb();
	System.out.println(c.name);}
}