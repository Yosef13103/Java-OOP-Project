package oop.project.screens.StudentScreen.Panels;

import oop.project.handlers.ButtonHandlerStudent;
import oop.project.components.*;
import oop.project.hooks.AddToBox;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.k33ptoo.components.*;

public class StudentButton extends ThemedPanelStudent
{
    Dictionary<String, KButton> studentButtons = new Hashtable<String, KButton>();
    Dictionary<String, JPanel> studentPanels;

    String[] ButtonNames = {
            " Main Menu ",
            " Manage Classes ",
            " View Grades ",
            " View Alerts ",
            " Register Class ",
            " Drop Class ",
            "Logout"
    };

    JFrame frame;
    Box studentButtonBox;
    Box mainButtonBox;

    public void setPanels(Dictionary<String, JPanel> studentPanels)
    {
        this.studentPanels = studentPanels;
        for (int i = 0; i < studentButtons.size(); i++)
        {
            studentButtons.get(ButtonNames[i].trim())
                    .addActionListener(new ButtonHandlerStudent(frame, this.studentPanels, studentButtonBox, mainButtonBox));
        }
    }

    public StudentButton(JFrame frame, int Width, int Height)
    {
        this.frame = frame;
        this.setPreferredSize(new Dimension(440, 0));

        for (int i = 0; i < ButtonNames.length; i++)
        {
            studentButtons.put(ButtonNames[i].trim(), new CustomButton(ButtonNames[i]));
        }
        JLabel mainTitle = new JLabel("Student Dashboard");
        mainTitle.setFont(new Font("Arial", Font.BOLD, 40));
        mainTitle.setForeground(Color.BLACK);
        mainTitle.setHorizontalAlignment(JLabel.CENTER);
        mainTitle.setVerticalAlignment(JLabel.CENTER);
        JComponent[] mainButtonComponents = {
                mainTitle,
                studentButtons.get("View Alerts"),
                studentButtons.get("Manage Classes"),
                studentButtons.get("View Grades")
        };

        mainButtonBox = AddToBox.addToHorizontalBox(mainButtonComponents, 4);
        JLabel coursesTitle = new JLabel("Manage Courses");
        coursesTitle.setFont(new Font("Arial", Font.BOLD, 34));
        coursesTitle.setForeground(Color.BLACK);
        coursesTitle.setHorizontalAlignment(JLabel.CENTER);
        coursesTitle.setVerticalAlignment(JLabel.CENTER);
        JComponent[] studentButtonComponents = {
                coursesTitle,
                studentButtons.get("Main Menu"),
                studentButtons.get("Register Class"),
                studentButtons.get("Drop Class"),
        };

        studentButtonBox = AddToBox.addToHorizontalBox(studentButtonComponents, 4);

        this.setLayout(new BorderLayout());
        this.add(mainButtonBox, BorderLayout.NORTH);
        this.add(studentButtons.get("Logout"), BorderLayout.SOUTH);

    }
}
