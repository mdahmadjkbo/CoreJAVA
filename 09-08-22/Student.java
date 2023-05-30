class Student{
    String name;
    private int id;
    public Student(String name, int id){
	this.name=name;
	this.id=id;//readable & modifiable access(R&M)
    }
    public int getId(){
	return id;
    }
    public static setId(int id){
	this.id=id;
    }
}
//javac Student.java
//java Student