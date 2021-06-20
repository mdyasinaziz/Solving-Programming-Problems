package quiz02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/*
author @ 17201019 & 17201105 Sec 5 CSE221 QUIZ 27 Jan
*/
public class Quiz02 {

    public static void main(String[] args) {
        try {
            File file = new File("R://5th Semeseter CSE221//A Lab Works//Lab Quizes//Quiz 02 (27 Jan)//src//quiz02//zzz.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            st = br.readLine();
            int no = Integer.parseInt(st);
            Student[] stu = new Student[no];
            for (int i = 0; i < stu.length; i++) {
                stu[i] = new Student();

            }

            int i = 0;
            int j = 0;

            while ((st = br.readLine()) != null) {
                if (i == 3) {
                    i = 0;
                    j++;
                }
                if (i == 0) {
                    int iddd = Integer.parseInt(st);
                    stu[j].id = iddd;
                }
                if (i == 1) {
                    int cred = Integer.parseInt(st);
                    stu[j].credit = cred;
                }
                if (i == 2) {
                    double cgpaa = Double.parseDouble(st);
                    stu[j].cgpa = cgpaa;
                }
                i++;
            }  // Making Arrays Of Students from txt Complete.
            
            msort(stu, 0, stu.length - 1); // Using Modified merge sort to sort. 
            
            for (int v = stu.length-1; v >=0; v--){
            System.out.println (stu [v].id);
            } //Since Merge Sort is accending, Printing from Last.
            
        }catch (Exception e) {
            throw new IllegalArgumentException("Come On You Can DO it!");
        }
    }

    // Main function that sorts arr[l..r] using merge combination.
    public static void msort(Student arr[], int l, int r) {
        if (l < r) {
            // Finding the middle point 
            int m = (l + r) / 2;

            // Sort first and second halfs reccurisvely 
            msort(arr, l, m);
            msort(arr, m + 1, r);

            // Merge the sorted halfs ofc. 
            Mmerge(arr, l, m, r);
        }
    }

    public static void Mmerge(Student arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Student L[] = new Student[n1];
        Student R[] = new Student[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0;

        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) {
            if (L[i].credit <= R[j].credit) {
                if (L[i].credit == R[j].credit) {
                    if (L[i].cgpa < R[j].cgpa) {
                    arr[k] = L[i];
                    i++;
                    }
                    else {
                    arr[k] = R[j];
                j++;
                    }
                }
                else {
                    arr[k] = L[i];
                    i++;
                }
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}