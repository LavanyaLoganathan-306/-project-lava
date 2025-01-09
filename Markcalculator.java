import java.util.Scanner;

public class Markcalculator {
public static void main(String[] args) {
    System.out.println(" -----STUDENT GRADE CLACULATOR ------ ");
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter number of subjects : ");
    int numberofsubjects = scan.nextInt();
    scan.nextLine();
    String[]subjects=new String[numberofsubjects];
    int[]marks = new int[numberofsubjects];
    int totalMarks = 0;
    for(int i=0;i<numberofsubjects; i++)
    {
        System.out.println("subject name "+(i+1)+ ":");
        subjects[i]= scan.nextLine();
        System.out.println("marks " + (i+1)+":");
       marks[i] = scan.nextInt();
       scan.nextLine();
       totalMarks+=marks[i];
    }double averagePercentage=(double)totalMarks/numberofsubjects;
    char grade;
    if(averagePercentage >=90){
        grade='A';
    }else if(averagePercentage>=80){
        grade='B';
    }else if(averagePercentage>=70){
        grade='c';
    }else if(averagePercentage>=60){
        grade='D';
    }else {
        grade='F';
    }
    System.out.println(" -------STUDENT MARK LIST-------");
    for(int i=0;i<numberofsubjects;i++){
        System.out.println(subjects[i]+"-"+marks[i]);
    }
    System.out.println("Total Marks:"+totalMarks);
    System.out.println("Average percentage:"+averagePercentage+"%");
    System.out.println("Grade:"+grade);
    scan.close();

}
}


