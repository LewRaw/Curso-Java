package application;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Product;

public class program {

	public static void main(String[] args) {
		System.out.println("Digite o caminho do arquivo");
		
		try (Scanner sc = new Scanner(System.in)) {
			String caminho = sc.nextLine();
			
			File caminhoArquivo = new File(caminho);
			String caminhoPasta = caminhoArquivo.getParent();
			boolean sucesso = new File(caminhoPasta+"\\out").mkdir();
			String destinoArquivo =  (caminhoPasta + "/out/summary.csv");
			
			List<Product> produtos = new ArrayList<>();

			try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
				String linha = br.readLine();
				 		
				while (linha != null) {
					String[] colunas = linha.split(",");				
					double produtoValorTotal = Double.valueOf(colunas[1]) * Double.valueOf(colunas[2]);
					Product pr = new Product(colunas[0], produtoValorTotal);
					produtos.add(pr);
					
					linha = br.readLine();
				}
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(destinoArquivo))){ 
					for (Product item : produtos) {
						bw.write(item.getNome() + ","+ String.format("%.2f", item.getPreco()));
						bw.newLine();
					}
				
				}
				catch (IOException e) {
					System.out.println(e.getMessage());
				}		
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
