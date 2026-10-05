package grades;

import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Double>grades;
    
    public GradeManager(){
        grades = new ArrayList<>();
    }

    public void addGrade(Double grade){
        grades.add(grade);
    }

    public Double calculateAverage(){
        Double sum = 0.0;
        for(Double grade : grades){
            sum += grade;
        }

        return grades.isEmpty()?0.0 : sum / grades.size();
    }

    public Integer countPassingGrades(){
        Integer count = 0;
        for(Double grade : grades){
            if(grade >= 50.0){
                count++;
            }
        }

        return count;
    }


    public void removeGradeByValue(Double grade) {
    if (grades.remove(grade)) {
        System.out.println("Grade removed successfully.");
    } else {
        System.out.println("Grade not found.");
        }
    }

    public void removeGradeByPosition(Integer position) {
    if (position >= 0 && position < grades.size()) {
        grades.remove((int) position);
        System.out.println("Grade removed successfully.");
    } else {
        System.out.println("Invalid position.");
        }
    
    }

}
