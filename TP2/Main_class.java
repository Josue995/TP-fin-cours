
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Shalukoma.txt"));
            Voiture v1 = new Voiture("Ferrari", 4, 4, 750, 4);
            writer.write(v1.toFileFormat()); 
            writer.newLine();
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("Shalukoma.txt"));
            String line;
            System.out.println("Bonjour, vous allez bien ?\nPermettez-moi de vous présenter mes voitures ");
            System.out.println("*****************");
            while ((line = reader.readLine()) != null) {
                Voiture voitureLue = Voiture.fromFileFormat(line);
                System.out.println(voitureLue.description());
                System.out.println("*****************");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}