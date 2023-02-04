public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private  String[] coursess;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCoursess(String[] coursess) {
        this.coursess = coursess;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String[] getCoursess() {
        return coursess;
    }
    //        int[] variant1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};// #1
//        int[] variant2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//#2
//        int[] variant3 = new int[9]; //#3  Пустой вариант тузушубуз керек болгондо колдонобуз*/
}
