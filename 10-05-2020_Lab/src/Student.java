public class Student {

    private String firstName;
    private String surname;
    private int age;
    private String studentID;

    //Methods/Function (Getter and setter)
    void printDetails(){
        System.out.println("The Student Details are: ");
        System.out.println("Firstname: " + getFirstName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentID());
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    //Getters and setters

    //Constructor (Initializes objects)
    Student(String firstname, String Surname, int Age, String id){

        setFirstName(firstname);
        setSurname(Surname);
        setAge(Age);
        setStudentID(id);
    }

    //Main Method
    public static void main(String[] args){
        //Creating an object of the class (Student)
        Student Stephen = new Student("Stephen", "Muroki", 20, "102480");
        Student Tatyanna = new Student("Tatyanna", "Chacha", 21, "113330");

        //Calling the method
        Stephen.printDetails();
        System.out.println();
        Tatyanna.printDetails();

        System.out.println("The firstname of the object reference by 'a' is: "+Stephen.getFirstName());
        Stephen.setFirstName("Stephen....");
    }

}
