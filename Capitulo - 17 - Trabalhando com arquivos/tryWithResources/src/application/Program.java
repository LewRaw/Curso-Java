package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String path = "C:\\Users\\yMode\\OneDrive\\Documentos\\GitHub\\Curso-Java\\Capitulo - 17 - Trabalhando com arquivos\\texto.txt";
		FileReader reader = null;
		BufferedReader bufferReader = null;
		
		try {
			reader = new FileReader(path);
			bufferReader = new BufferedReader(reader);
			
			String line = bufferReader.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (bufferReader != null){
					bufferReader.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
}
