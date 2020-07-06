package pracquestion1;
import java.awt.event.*;
import javax.swing.*;


public class PracQuestion1 extends JFrame {
    JMenuBar menuBar;      //JMenuBar is the whole bar that is at the top
    JMenu MainMenu;        // Each of the menu buttons for eg on netbeans, at the top File, View, Navigate etc is all JMenu
    JMenu NewProject;  
    JMenu OpenProject;
    JMenuItem Project1;    //List of all the buttons under the JMenu, for eg if you click on File (in netbeans) new project, new file, open recent etc will pop up. These are all JMenuItems
    JMenuItem Project2;
    JMenuItem Project3;
    JFrame frame;
    
    public PracQuestion1(){
        frame = new JFrame("PracQuestion1");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        
        MainMenu = new JMenu("Main Project");
        menuBar.add(MainMenu); //Added the Main Project to the menuBar
        
        NewProject = new JMenu("New Project");
        MainMenu.add(NewProject); //Added the New Project to the Main Menu
        
        OpenProject = new JMenu("Open Project");
        MainMenu.add(OpenProject); //Added the Open Project to the Main Menu
        
        Project1 = new JMenuItem("Project 1");
        OpenProject.add(Project1); //Added the Project1 to the Open Project
        
        Project2 = new JMenuItem("Project 2");
        OpenProject.add(Project2); //Added the Project2 to the Open Project
        
        Project3 = new JMenuItem("Project 3");
        OpenProject.add(Project3); //Added the Project1 to the Open Project
                
       frame.setJMenuBar(menuBar); //Adding the menuBar to the frame
    }
    
    
    
    
    
    public static void main(String[] args) {
        PracQuestion1 app = new PracQuestion1();
        app.frame.setSize(600,400);
        app.frame.setVisible(true);
    }
    
}
