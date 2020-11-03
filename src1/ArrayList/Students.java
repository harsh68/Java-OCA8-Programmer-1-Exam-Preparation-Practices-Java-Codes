/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
class Stu
{
    String name;
    char sex;
    int age;
    Stu(String name,int age,char sex)
    {
        this.name=name;
        this.age = age;
        this.sex = sex;
    }
    public String toString()
    {
        return name+age+sex;
    }
}
public class Students {
    public static void main(String[] args) {
        List<Stu> r = new ArrayList<>();
        r.add(new Stu("Harsh",29,'M'));
        r.add(new Stu("Harsh",28,'M'));
        r.add(new Stu("Harsh",29,'M'));
        r.add(new Stu("Harsh",27,'M'));
        r.add(new Stu("Harsh",27,'M'));
        r.add(new Stu("Harsh",25,'M'));
        
        r.remove(new Stu("Harsh",29,'M'));
        
        System.out.println(r);
        for(Stu stud : r) {
             System.out.println(stud);
         }
        
    }
}
