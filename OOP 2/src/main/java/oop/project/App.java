package oop.project;

import oop.project.screens.LoginScreen.LoginScreen;

public final class App
{
    public static String Path = "src/main/resources/images/";
    // public static String Path = "./classes/images/"; // PATH FOR JAR

    public static void main(String[] args)
    {
        new LoginScreen();
        // new InstructorScreen();
        // new StudentScreen();
        // new AdminScreen();
    }
}
