import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "static/data.txt";
        String encryptedFileName = "static/data.txt";
        String decryptedFileName = "static/data.txt";
        encryptFile(inputFileName, encryptedFileName);
        decryptFile(encryptedFileName, decryptedFileName);
        printDecryptedContent(decryptedFileName);
    }
    public static void encryptFile(String inputFileName, String outputFileName) {
        try (Scanner scanner = new Scanner(new File(inputFileName));
             PrintWriter writer = new PrintWriter(outputFileName)) {
            int key = 7; 
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuilder encryptedLine = new StringBuilder();
                for (char c : line.toCharArray()) {
                    char encryptedChar = (char) (c + key); 
                    char xorChar = (char) (encryptedChar ^ 123);
                    encryptedLine.append(xorChar);
                }
                System.out.println(encryptedLine.toString());
                writer.println(encryptedLine.toString());
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void decryptFile(String inputFileName, String outputFileName) {
        try (Scanner scanner = new Scanner(new File(inputFileName));
             PrintWriter writer = new PrintWriter(outputFileName)) {
            int key = 7;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringBuilder decryptedLine = new StringBuilder();
                for (char c : line.toCharArray()) {
                    char xorChar = (char) (c ^ 123);
                    char decryptedChar = (char) (xorChar - key);
                    decryptedLine.append(decryptedChar);
                    
                }
                
                writer.println(decryptedLine.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printDecryptedContent(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}    
