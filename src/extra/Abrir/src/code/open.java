package code;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class open {

	public static void main(String[] args) throws IOException {
		int nc,nl;
		nl=nc=0;
		java.io.File dir = new java.io.File("/home/eddie/dev/java/");  
		boolean statusDir = dir.mkdir();
		System.out.println(statusDir); 
		java.io.File arquivo = new java.io.File(dir, "arq_01.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(arquivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String linha = "";

		
		List result = new ArrayList();

		while ((linha = bufferedReader.readLine()) != null) {
			for (nc=0; nc<linha.length(); nc++) {
				   char c = linha.charAt(nc);
				   System.out.print(c);
				   System.out.print("	" + nl + ":" + nc);
				   if(Character.isLetter(c)) {
					   System.out.println("		letra");
				   }
				   else
					   if(Character.isDigit(c))
						   System.out.println("		numero");
					   else
						   System.out.println("		Outro simbolo");
				   
				}
				nl++;
			
				System.out.println("		"); //EOL
				//			System.out.println(linha);
				//			if (linha != null && !linha.isEmpty()) {
				//				result.add(linha);
				//			}
		}
	}
}
