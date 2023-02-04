public class Student1 {
    private String firstName;
    private String  lastName;
    private int dayOfBirth;
    private String email;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setDayOfBirth(int dayOfBirth){

        if(dayOfBirth>0){
            this.dayOfBirth=dayOfBirth;
        }
        else{
            System.out.println(dayOfBirth+" Jash tuura emes ");
        }
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public String getEmail(){
        return email;
    }
}
