//program create a dir and text file in that dir

package Test;

import java.io.*;
import java.util.*;

public class MClass {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of dir");
		String dirName = scanner.next();
		File dir = new File(dirName);
		scanner.close();
		
		if ( !dir.mkdir()) {
			System.out.println("Unposible to create dir");
			return;}
			
		File file = new File(dir + "\\One.txt");
		file.createNewFile();
		System.out.println(Arrays.asList(dir.list()));
		//file.delete();
		//dir.delete();
	}

}
