package ro.sda.iulian.inputoutput.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File absoluteFile = new File("F://JAVA/myFile.txt");

        StringBuffer fileContent = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                fileContent.append(fileLine);
                fileContent.append("\n");
            }

        }
        String newFileContent = fileContent.toString().replace("Tra","Caca");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absoluteFile)))
        {

            bufferedWriter.write(newFileContent);
        }
    }
}