import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {
    //The class will have three fields:
    private Path p1;
    private Path p2;
    private Path p3;

    public ProcessFiles(Path p) {
        p1 = Paths.get("C:\\LineTests");
        p2 = Paths.get("\\TestResults.txt");
        p3 = p.resolve(p2);
        createDirectory();
    }

    //The following new methods have to be defined:
    private void createDirectory() {
        try {
            Files.createDirectories(Paths.get(p1.toString()));
        } catch (Exception ex) {
            System.out.println("unable to create directory");
            ex.printStackTrace();
        }
    }

    public void WriteFile(EmployeeInfo emp) throws IOException {
        FileWriter writer = new FileWriter(p3.toString());
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.print("employee test");
        printWriter.close();
    }

    public void WriteFile(ArrayList<Product> products) throws IOException{
        FileWriter writer = new FileWriter(p2.toString());
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.print("product test");
        printWriter.close();
    }
}
