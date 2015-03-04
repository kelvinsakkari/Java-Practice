import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputs {

	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("test.txt");
		FileInputStream fin2 = new FileInputStream("test2.txt");
		FileOutputStream fout = new FileOutputStream("test3.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);

		/*
		 * //creating Vector object to all the stream Vector v=new Vector();
		 * v.add(fin); v.add(fin2); v.add(fin3); v.add(fin4);
		 * 
		 * //creating enumeration object by calling the elements method
		 * Enumeration e=v.elements();
		 * 
		 * //passing the enumeration object in the constructor
		 * SequenceInputStream bin=new SequenceInputStream(e);
		 */
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
			fout.write(i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fout.close();

	}

}
