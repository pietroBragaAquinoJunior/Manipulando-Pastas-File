package main;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		/* Programa em java para manipulação de arquivos e pastas com File */
		
		String path = "D:\\TEMP";
		File file = new File(path);
		
		File[] pastas = file.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File pasta: pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = file.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File arquivo: arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(path + "\\subpasta" ).mkdir();
		System.out.println("Diretório criado com sucesso! "+ sucesso);
	}

}
