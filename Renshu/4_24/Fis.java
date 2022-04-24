import java.io.*;
public class Fis{
	public static void main(String[] args)throws Exception{
		FileInputStream fis=
			new FileInputStream("sample.txt");
		InputStreamReader isr=
			new InputStreamReader(fis,"utf-8");
		BufferedReader br=
			new BufferedReader(isr);

		FileOutputStream fos=
			new FileOutputStream("newsample.txt",true);
		OutputStreamWriter osw=
			new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw=
			new BufferedWriter(osw);

		String line;
		while((line=br.readLine()) !=null){
			System.out.println(line);
			bw.write("*"+line+"*");
			bw.newLine();
		}
		br.close();
		bw.close();

	}
}
