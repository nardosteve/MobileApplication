package LabAssigment;

public class Submission {

    //Submission Properties
    String submissionName;
    String studentName;
    String submissionDate;
    String submissionTime;
    boolean fileSubmitted;

    //Getters and Setters (Methods)
    //Set and get Submission Name
    public void setSubmissionName(String submissionName){
        this.submissionName = submissionName;
    }
    public String getSubmissionName(){
        return submissionName;
    }

    //Set and get Student Name
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return studentName;
    }

    //Set and get Submission date
    public void setSubmissionDate(String submissionDate){
        this.submissionDate = submissionDate;
    }
    public String getSubmissionDate(){
        return submissionDate;
    }

    //Set and get submission time
    public void setSubmissionTime(String submissionTime){
        this.submissionTime = submissionTime;
    }
    public String getSubmissionTime(){
        return submissionTime;
    }

    //Set and get isFile submitted
    public void setFileSubmitted(boolean fileSubmitted){
        this.fileSubmitted = fileSubmitted;
    }
    public boolean getFileSubmitted(){
        return fileSubmitted;
    }


    //Main Method
    public static void main(String[] args){

        //Object of Submission class
        Submission StevesSubmission = new Submission();

        //Set Properties
        StevesSubmission.setSubmissionName("Mobile Application Development");
        StevesSubmission.setStudentName("Stephen Mungai Muroki");
        StevesSubmission.setSubmissionDate("10-10-2020");
        StevesSubmission.setSubmissionTime("7:30am");
        StevesSubmission.setFileSubmitted(true);

        //Get Properties
        System.out.println("Submission Name: " +StevesSubmission.getSubmissionName());
        System.out.println("Student Name: " +StevesSubmission.getStudentName());
        System.out.println("Submission Date: " +StevesSubmission.getSubmissionDate());
        System.out.println("Submission Time: " +StevesSubmission.getSubmissionTime());
        System.out.println("Submission? : " +StevesSubmission.getFileSubmitted());




    }
}


