import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
class es4 {
public static void main(String[] args) throws FileNotFoundException{
    File f = new File("employee.data");
    Scanner scan = new Scanner(f);
    ArrayList<Employee>employees = new ArrayList<Employee>();
    while(scan.hasNext()){
        employees.add(parseLine(scan.nextLine()));
        }
    scan.close();
    System.out.println(employees.toString());
    }
    
static Employee parseLine(String line) {
    Scanner lineScanner = new Scanner(line);
    lineScanner.useDelimiter("\\s*,\\s*");

    String name = lineScanner.next();
    int age = lineScanner.nextInt();
    boolean isCertified = lineScanner.nextBoolean();

    lineScanner.close();
    return new Employee(name, age, isCertified);
   }
}