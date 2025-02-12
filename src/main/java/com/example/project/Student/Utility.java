package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        ArrayList<Student> sortedList = new ArrayList<Student>();
        String[] lastNames = new String[list.size()];
        String[] firstNames = new String[list.size()];
        double[] gpas = new double[list.size()];
        for(int i = 0; i < list.size(); i ++){
            lastNames[i] = list.get(i).getLastName();
            firstNames[i] = list.get(i).getFirstName();
            gpas[i] = list.get(i).getGpa();
        }
        return sortedList;
    }
}
