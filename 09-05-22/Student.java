class Student{
    String name;
    int id;
    Student(String name, int id){
	this.name=name;
	this.id=id;}
    @Override
    public String toString(){
    return name;}
}