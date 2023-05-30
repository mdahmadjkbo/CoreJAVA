import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileInputStreamProgrm{
    public static void main(String[]args) throws FileNotFoundException, IOException{
	FileInputStream fis=new FileInputStream("C:\\Ahmad\\FileInpStream.txt");
	int r=fis.read();
	while(r!=-1){
	    System.out.print(r);
	    r=fis.read();
        }
	fis.close();}
}
