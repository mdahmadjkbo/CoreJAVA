class Application
{
    String name;
    int cno;
    long alcno;
    public Application(String name)
    {
	this.name=name;
    }
    public Application(String name,int cno)
    {
	this.name=name;
	this.cno=cno;
    }
    public Application(String name,int cno,long alcno)
    {
	this.name=name;
	this.cno=cno;
	this.alcno=alcno;
    }
    public static void main(String[]args)
    {
	Application sheela=new Application("Sheela");
	Application laila=new Application("Laila",7483);
	Application mala=new Application("Mala",5933,84394);
	System.out.println(sheela.cno);
	System.out.println(sheela.alcno);
	System.out.println(laila.cno);
	System.out.println(mala.alcno);
    }
}
//javac Application.java
//java Application