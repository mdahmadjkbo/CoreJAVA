import java.io.ClassNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

class FileInputStream2{
    public static void main(String[]args) throws ClassNotFoundException, IOException{
	FileInputStream fis=new FileInputStream("C:\Users\hp\OneDrive\Desktop\Core-JAVA Program\Class\10-19-22 FileInputStream\FileInputStream2.txt");
	    int r=fis.read();
	while(r!=-1){
	    System.out.print(r);
	    r=fis.read();}
	fis.close();}
}