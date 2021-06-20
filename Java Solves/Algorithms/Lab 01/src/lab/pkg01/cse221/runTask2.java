package lab.pkg01.cse221;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class runTask2 {
    
    
    public runTask2 (){
    try {
        System.out.println ("came");
            File file = new File("R:\\5th Semeseter CSE221\\A Lab Works\\Lab 01\\src\\lab\\pkg01\\cse221\\input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println (st);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Hoye Naiii");
        }
    }
}
