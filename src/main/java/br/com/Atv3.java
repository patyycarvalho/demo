package br.com;

import java.io.*;

public class Atv3 {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }

            bufferedReader.close();

            FileWriter fileWriter = new FileWriter("meuarquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.newLine();
            bufferedWriter.write("Adicionando texto ao arquivo 'meuarquivo.txt'");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}