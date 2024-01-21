package Controller;

import Model.Student;
import View.Menu;
import View.StudentView;

import java.util.ArrayList;

public class StudentController extends Menu {
    private ArrayList<Student> sList = new ArrayList<>();
    private StudentView sv= new StudentView();
    public StudentController() {
        super("WELCOME TO STUDENT MANAGEMENT", new String[] {
                "Create", "Find and Sort", "Update/delete", "Report", "Exit"
        });
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                sv.loadData(sList);
                break;
            case 2:
                sv.menuForFndS(sList);
                break;
            case 3:
                sv.doUpdateDelete(sList);
                break;
            case 4:
                sv.reportData(sList);
                break;
            default:
                System.out.println("Thank you <3");
        }
    }

}
