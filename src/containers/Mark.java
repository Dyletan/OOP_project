package containers;

import java.util.Objects;
import java.util.Vector;

public class Mark {
    private Vector<Point> firstAttestation;
    private Vector<Point> secondAttestation;
    private Point finalExam;
    {
        firstAttestation = new Vector<Point>();
        secondAttestation = new Vector<Point>();
        finalExam = new Point();
    }

    public Mark() {}

    /**
     * @param point A point with amount of points, date when it was put and what attestation (or final) it corresponds to
     */
    public void putMark(Point point){
        switch (point.getType()) {
            case FIRST_ATTESTATION:
                firstAttestation.add(point);
                break;
            case SECOND_ATTESTATION:
                secondAttestation.add(point);
                break;
            case FINAL:
                finalExam = point;
        }
    }

    /**
     * @return Returns all points combined to one Vector
     */
    public Vector<Point> getPoints(){
        Vector<Point> result = new Vector<Point>();
        result.addAll(firstAttestation);
        result.addAll(secondAttestation);
        result.add(finalExam);
        return result;
    }

    public double getGPA() {
        // Calculate GPA based on your grading scale
        // Modify this according to your grading system
        double totalPoints = 0;
        double totalCredits = 0;

        for (Point point : getPoints()) {
            totalPoints += point.getPoint() * point.getCredits();
            totalCredits += point.getCredits();
        }

        return totalCredits != 0 ? totalPoints / totalCredits : 0;
    }


    /**
     * @return Returns an alphabetical representation of Student's grade
     */
    public char getGrade(){ // TO DO
        return 'A';
    }

    @Override
    public String toString() {
        String firstAtt = "";
        for(Point p : firstAttestation){
            firstAtt += p + " ";
        }
        String secondAtt = "";
        for(Point p : secondAttestation){
            secondAtt += p + " ";
        }
        return "Marks for first attestation:\n" +
                "firstAttestation=" + firstAtt +
                "\nsecondAttestation=" + secondAtt +
                "\nfinalExam=" + finalExam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return Objects.equals(firstAttestation, mark.firstAttestation) && Objects.equals(secondAttestation, mark.secondAttestation) && Objects.equals(finalExam, mark.finalExam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstAttestation, secondAttestation, finalExam);
    }

    public Vector<Point> getFirstAttestation() {
        return firstAttestation;
    }

    public void setFirstAttestation(Vector<Point> firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    public Vector<Point> getSecondAttestation() {
        return secondAttestation;
    }

    public void setSecondAttestation(Vector<Point> secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public Point getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Point finalExam) {
        this.finalExam = finalExam;
    }

}
