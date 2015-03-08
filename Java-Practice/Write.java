import java.io.*;

public class Write {

	public static void main(String[] args) {
		try {
			File file = new File("/home/kelvin/Desktop/fout.txt");
			String toFile = "hello i am just chacking the outStream working method? ";
			writeFile(file, toFile);
			readFile(file);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static void writeFile(File FilePath, String StringTowrite) {

		try {

			FileOutputStream foutStream = new FileOutputStream(FilePath);
			// String toFile =
			// "hello i am just chacking the outStream working ? ";
			/*
			 * BufferedOutputStream bout=new BufferedOutputStream(fout); String
			 * s="Sachin is my favourite player"; byte b[]=s.getBytes();
			 * bout.write(b);
			 * 
			 * bout.flush();
			 */
			byte ofString[] = StringTowrite.getBytes();
			// System.out.println(ofString.length);
			for (int i = 0; i < ofString.length; i++) {
				System.out.print((char) ofString[i]);

			}
			// System.out.println((String)ofString.toString());
			foutStream.write(ofString);
			foutStream.close();
			// System.out.println("success");

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

l	}

	public static void readFile(File file) throws IOException {

		FileInputStream read = new FileInputStream(file);
		/*
		 * 
		 * FileInputStream fin=new FileInputStream("f1.txt");
		 * BufferedInputStream bin=new BufferedInputStream(fin); int i;
		 * while((i=bin.read())!=-1){ System.out.println((char)i); }
		 * bin.close();
		 */
		int i = 0;
		while ((i = read.read()) != -1) {
			System.out.print((char) i);

		}
		read.close();
		System.out.println("ReadFile");
	}

}
