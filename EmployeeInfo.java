import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {
    //The class will have 2 fields
    StringBuilder name;
    String nameToBeBuilt;
    String code;
    String deptId;
    Pattern p;
    Scanner in;

    public EmployeeInfo () {
        setName();
        createEmployeeCode(name);
        System.out.print("Please enter the department ID:");
        in = new Scanner(System.in);
        deptId = in.next();
        in.close();
        setDeptId();
    }

    //The class will have the following methods defined:
    public StringBuilder getName() {

        return name;
    }

    public String getCode() {

        return code;
    }

    private void setName() {
        String nameString = inputName();
        name = new StringBuilder(nameString);
    }

    private void createEmployeeCode(StringBuilder name) {
        if (checkName(name)) {
            code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
        } else {
            code = "guest";

        }
    }

     private String inputName() {
         in = new Scanner(System.in);
         System.out.print("Please enter your first and last name: ");
         String nameString = in.nextLine();

         return nameString;
     }

     private boolean checkName (StringBuilder name) {

        return (name.indexOf(" ") > 0);
     }

     public String getDeptId () {
        return deptId;
     }

     private void setDeptId () {
        String deptIDset = getDeptId();
        validId(deptId);

     }

     private String getId() {
        String getString = deptId;
        return getString;
     }

     private boolean validId(String id) {
         String pattern = "[A-Z]{1}[a-z]{3}\\d{2}";
        boolean tempbool = false;
        if (id.matches(pattern)) {
            tempbool = true;
            deptId = id;
        } else {
            tempbool = false;
            deptId = "None01";
        }
        return tempbool;
     }

     public String reverseString(String id) {
        String stringToReverse = deptId;
        String reverseString = new StringBuffer(stringToReverse).reverse().toString();
        return reverseString;
     }

    @Override
    public String toString() {
        return "Employee Code : " + code + "\n" +
                "Department Number : " + deptId;
    }
}

