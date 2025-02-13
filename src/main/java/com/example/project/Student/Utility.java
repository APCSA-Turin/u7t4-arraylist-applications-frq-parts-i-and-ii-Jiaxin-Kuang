package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        ArrayList<Student> sortedList = new ArrayList<Student>();
        sortedList.add(list.get(0));
        int totalStudents = list.size();
        boolean greatest = false;
        for(int i = 1; i < totalStudents; i ++){
            for(int j = 0; j < sortedList.size(); j ++){
                if(sortedList.get(j).getLastName().compareTo(list.get(i).getLastName()) > 0){
                    sortedList.add(j, list.get(i));
                    break;
                }
                else if(sortedList.get(j).getLastName().compareTo(list.get(i).getLastName()) == 0){
                    if(sortedList.get(j).getFirstName().compareTo(list.get(i).getFirstName()) > 0){
                        sortedList.add(j, list.get(i));
                    }
                    else if(sortedList.get(j).getFirstName().compareTo(list.get(i).getFirstName()) < 0){
                        sortedList.add(j + 1, list.get(i));
                    }
                    else{
                        if(sortedList.get(j).getGpa() > (list.get(i).getGpa())){
                            sortedList.add(j + 1, list.get(i));
                        }
                        else if(sortedList.get(j).getGpa() < (list.get(i).getGpa())){
                            sortedList.add(j, list.get(i));
                        } 
                    }
                    break;
                }
            }
        }
        return sortedList;
    }
}
