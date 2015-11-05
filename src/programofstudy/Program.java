/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programofstudy;

import java.awt.List;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Travis
 */
public class Program implements Iterable<course>, Serializable{
    
    private List<course> list;
    
    public Program(){
        
        list = new LinkedList<course>();
    }
    
    public void addCourse(course course){
        
        if (course != null)
            list.add(course);
    }
    
    public course find (String prefix, int number){
        
        for (course course: list)
            if (prefix.equals(course.getPrefix()) &&
                    number == course.getNumber())
                return course;
        return null;
    }
    
    public void addCourseAfter(course target, course newCourse){
        if (target == null || newCourse == null)
            return;
        
        int targetIndex = list.indexOf(target);
        if (targetIndex != -1)
            list.set(targetIndex + 1, newCourse);
    }
    
    public void replace (course target, course newCourse){
        if (target == null || newCourse == null)
            return;
        
        int targetIndex = list.indexOf(target);
        if (targetIndex != -1)
            list.set(targetIndex, newCourse);
    }
    
    public String toString(){
        String result = "";
        for (course course: list)
            result += course + "/n";
        return result;
    }

    @Override
    public Iterator<course> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
