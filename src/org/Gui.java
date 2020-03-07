package org;
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.awt.event.*;
class StudentApp {
    public static final String EMAIL_STUB="@my.email";
    private String name;
    private String id;
    public StudentApp()
    {
        name="";
        id="";
    }
    public StudentApp(String name, String id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String toString()
    {
        return id+"\t"+name+"\t"+id+EMAIL_STUB;
    }
}
public class Gui extends JFrame {
    JTextArea studentTextArea=new JTextArea();
    JLabel idLabel=new JLabel("ID: ");
    JTextField idTextField=new JTextField(10);
    JLabel nameLabel=new JLabel("Name ");
    JTextField nameTextField=new JTextField(10);
    JButton addButton=new JButton("Add");
    JButton deleteButton=new JButton("Delete");
    JButton displayAllButton=new JButton("Display");
    JButton exitButton=new JButton("Exit");
    private LinkedList<StudentApp> studentLinkedList=new LinkedList<StudentApp>();
    public Gui()
    {
        JPanel flow1Panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel flow2Panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel gridPanel=new JPanel(new GridLayout(2,1));
        studentTextArea.setEditable(false);
        flow1Panel.add(idLabel);
        flow1Panel.add(idTextField);
        flow1Panel.add(nameLabel);
        flow1Panel.add(nameTextField);
        flow2Panel.add(addButton);
        flow2Panel.add(deleteButton);
        flow2Panel.add(displayAllButton);
        flow2Panel.add(exitButton);
        gridPanel.add(flow1Panel);
        gridPanel.add(flow2Panel);
        add(studentTextArea, BorderLayout.CENTER);
        add(gridPanel,BorderLayout.SOUTH);
        addButton.addActionListener(event ->addStudent());
        displayAllButton.addActionListener (event -> displayAll());
        exitButton.addActionListener (event -> exitApplication());
        deleteButton.addActionListener (event -> deleteStudent());

    }


    private boolean isStudentIdLinkedList(String idStr)
    {
        boolean inList=false;
        for(StudentApp stud:studentLinkedList)
        {
            if(stud.getId().compareToIgnoreCase(idStr)==0)
            {
                inList=true;
            }
        }
        return inList;
    }
    private void addStudent()
    {

        if(isStudentIdLinkedList(idTextField.getText())==true)
        {
            JOptionPane.showMessageDialog(null,"Error, student id is not unique");
        }
        else{
            studentLinkedList.add(new StudentApp (idTextField.getText(),nameTextField.getText()));
            displayAll();
            nameTextField.setText("");
            idTextField.setText("");
        }
    }
    private void displayAll()
    {
        studentTextArea.setText("");
        for(StudentApp stud:studentLinkedList)
        {
            studentTextArea.append(stud+"\n");
        }
    }
    private void exitApplication()
    {
        System.exit(0);
    }
    private void deleteStudent()
    {
        if(studentLinkedList.size()==0)
        {
            JOptionPane.showMessageDialog(null,"Error, database is empty");
        }
        else if(isStudentIdLinkedList(idTextField.getText())==false)
        {
            JOptionPane.showMessageDialog(null,"Error, student id is not unique");
        }
        else{
            for(int s=0; s<studentLinkedList.size();s++)
            {
                String currId=studentLinkedList.get(s).getId();
                if(currId.compareToIgnoreCase(idTextField.getText())==0)
                {
                    studentLinkedList.remove(s);
                }
            }
            displayAll();
            nameTextField.setText("");
            idTextField.setText("");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gui app=new Gui();
        app.setVisible(true);
        app.setSize(500,500);
        app.setLocation(200,100);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }

}