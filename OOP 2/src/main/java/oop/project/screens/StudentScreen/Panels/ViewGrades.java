package oop.project.screens.StudentScreen.Panels;

import oop.project.colors.ThemeColors;
import oop.project.components.buttons.*;
import oop.project.components.core.RoundedJTextField;
import oop.project.components.panels.TransparentPanel;
import oop.project.hooks.AddToBox;

import java.awt.*;
import javax.swing.*;
import com.k33ptoo.components.*;

public class ViewGrades extends TransparentPanel
{
    public ViewGrades(int Width, int Height)
    {
        Box studentProfile;
        Box studentquizGrade;
        Box studentmidtermGrade;
        Box studentfinalGrade;
        Box studentProjectGrade;
        Box totalGrade;


        JLabel ViewGradesLabel = new JLabel("View Grades");
        ViewGradesLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));

        JLabel id = new JLabel("ID");
        id.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        id.setAlignmentX(JLabel.LEFT);
        id.setHorizontalTextPosition(JLabel.LEFT);
        id.setAlignmentX(RIGHT_ALIGNMENT);
        id.setForeground(ThemeColors.BLACK);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        name.setAlignmentX(JLabel.LEFT);
        name.setHorizontalTextPosition(JLabel.LEFT);
        name.setAlignmentX(RIGHT_ALIGNMENT);
        name.setForeground(ThemeColors.BLACK);

        JComponent [] profileComponents = {id, name};
        studentProfile = AddToBox.addToHorizontalBox(profileComponents, 1);


        JLabel quizGrade = new JLabel("Quiz Grade");
        quizGrade.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        quizGrade.setAlignmentX(LEFT_ALIGNMENT);
        quizGrade.setForeground(ThemeColors.BLACK);
        

        RoundedJTextField quizGradeField = new RoundedJTextField(10);
        quizGradeField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        quizGradeField.setAlignmentX(RIGHT_ALIGNMENT);
        quizGradeField.setMinimumSize( new Dimension(100, 50));
        quizGradeField.setMaximumSize( new Dimension(100, 50));
        quizGradeField.setEditable(false);

        JLabel quizGradeLabel = new JLabel("/10");
        quizGradeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        quizGradeLabel.setAlignmentX(RIGHT_ALIGNMENT);
        quizGradeLabel.setForeground(ThemeColors.BLACK);


        JComponent [] quizGradeComponents = {quizGrade, quizGradeField, quizGradeLabel};
        studentquizGrade = AddToBox.addToHorizontalBox(quizGradeComponents, 1);


        JLabel midtermGrade = new JLabel("Midterm Grade");
        midtermGrade.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        midtermGrade.setAlignmentX(LEFT_ALIGNMENT);
        midtermGrade.setForeground(ThemeColors.BLACK);

        RoundedJTextField midtermGradeField = new RoundedJTextField(10);
        midtermGradeField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        midtermGradeField.setAlignmentX(RIGHT_ALIGNMENT);
        midtermGradeField.setMinimumSize(new Dimension(100, 50));
        midtermGradeField.setMaximumSize(new Dimension(100, 50));
        midtermGradeField.setEditable(false);

        JLabel midtermGradeLabel = new JLabel("/20");
        midtermGradeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        midtermGradeLabel.setAlignmentX(RIGHT_ALIGNMENT);
        midtermGradeLabel.setForeground(ThemeColors.BLACK);

        JComponent [] midtermGradeComponents = {midtermGrade, midtermGradeField, midtermGradeLabel};
        studentmidtermGrade = AddToBox.addToHorizontalBox(midtermGradeComponents, 1);


        JLabel finalGrade = new JLabel("Final Grade");
        finalGrade.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        finalGrade.setAlignmentX(LEFT_ALIGNMENT);
        finalGrade.setForeground(ThemeColors.BLACK);

        RoundedJTextField finalGradeField = new RoundedJTextField(10);
        finalGradeField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        finalGradeField.setAlignmentX(RIGHT_ALIGNMENT);
        finalGradeField.setMinimumSize(new Dimension(100, 50));
        finalGradeField.setMaximumSize(new Dimension(100, 50));
        finalGradeField.setEditable(false);

        JLabel finalGradeLabel = new JLabel("/40");
        finalGradeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        finalGradeLabel.setAlignmentX(RIGHT_ALIGNMENT);
        finalGradeLabel.setForeground(ThemeColors.BLACK);

        JComponent [] finalGradeComponents = {finalGrade, finalGradeField, finalGradeLabel};
        studentfinalGrade = AddToBox.addToHorizontalBox(finalGradeComponents, 1);


        JLabel projectGrade = new JLabel("Project Grade");
        projectGrade.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        projectGrade.setAlignmentX(LEFT_ALIGNMENT);
        projectGrade.setForeground(ThemeColors.BLACK);

        RoundedJTextField projectGradeField = new RoundedJTextField(10);
        projectGradeField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        projectGradeField.setAlignmentX(RIGHT_ALIGNMENT);
        projectGradeField.setMinimumSize(new Dimension(100, 50));
        projectGradeField.setMaximumSize(new Dimension(100, 50));
        projectGradeField.setEditable(false);

        JLabel projectGradeLabel = new JLabel("/30");
        projectGradeLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        projectGradeLabel.setAlignmentX(RIGHT_ALIGNMENT);
        projectGradeLabel.setForeground(ThemeColors.BLACK);

        JComponent [] projectGradeComponents = {projectGrade, projectGradeField, projectGradeLabel};
        studentProjectGrade = AddToBox.addToHorizontalBox(projectGradeComponents, 1);


        JLabel total = new JLabel("Total:");
        total.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        total.setAlignmentX(LEFT_ALIGNMENT);
        total.setForeground(ThemeColors.BLACK);

        RoundedJTextField totalField = new RoundedJTextField(10);
        totalField.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        totalField.setAlignmentX(RIGHT_ALIGNMENT);
        totalField.setMinimumSize(new Dimension(100, 50));
        totalField.setMaximumSize(new Dimension(100, 50));
        totalField.setEditable(false);

        JLabel totalLabel = new JLabel("/100");
        totalLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        totalLabel.setAlignmentX(RIGHT_ALIGNMENT);
        totalLabel.setForeground(ThemeColors.BLACK);

        JComponent [] totalComponents = {total, totalField, totalLabel};
        totalGrade = AddToBox.addToHorizontalBox(totalComponents, 1);



        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        this.add(studentProfile, c);
        c.gridy = 1;
        this.add(studentquizGrade, c);
        c.gridy = 2;
        this.add(studentmidtermGrade, c);
        c.gridy = 3;
        this.add(studentfinalGrade, c);
        c.gridy = 4;
        this.add(totalGrade, c);
  
    }
}
