class Student{
    String name;
    private int id;
    //System.out.println(id);

    Student(String name, int id){
	this.name=name;
	this.id=id;}

    public int getId(){
	return id;}

    public void setId(int id){
	this.id=id;}
}