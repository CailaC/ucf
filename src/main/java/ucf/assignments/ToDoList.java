/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Caila Coates
 */

package ucf.assignments;

/*
The class ToDoList creates and edits for everything that is included in one List.
This includes a name, description, due date and status
Each list will be able to hold 100 items
Here you'll be able to add to a list, remove an item, edit the description, edit the name
and check the status of items
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoList{
    public static void main( String[] args )
    {

       // Button();

        //create strings name, due date, description, status
    }


    public static void AddButton (){
        /*
        JFrame f=new JFrame("Button Example");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello.");
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

         */

        //Button when clicked will call BuildItemsArray
    }

    public static void newList (){
        /*
        Create array of strings of size 100
            the strings will be the object item.
                items is an object.

         */
    }

    public static void Item (){
        /*
        Create string description
            scanf for description input
        Create string dueDate
            scanf for due date input
            format due date input YYYY-MM-DD
        call object status


        Should this be a class???
            each thing is an object??

         */
    }

    public static void Status (){
        /*
            if then statements for the status of the item
            If certain button clicked then....

         */
    }

    public static void SaveList (){
        /*
            Creates external file
            Will load list to an external file and save

         */
    }

    public static void LoadList () {
        /*
            Grabs file from SaveList on the external storage
            parse through file and display the single list

         */
    }

    public static void editTitle () {
        /*
            Grabs file from SaveList on the external storage
            parse through file and display the single list

         */
    }

    public static void editDescription () {
        /*
            Grabs file from SaveList on the external storage
            parse through file and display the single list

         */
    }

    public static void editDueDate () {
        /*
            Grabs file from SaveList on the external storage
            parse through file and display the single list

         */
    }

}
