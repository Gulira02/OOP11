import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Kurs kurs=new Kurs();
        kurs.setName("CMM");
        kurs.setPhoneNumber(708860071);
        kurs.setDate(23.022023);
        System.out.println(kurs.getName());
        System.out.println(kurs.getPhoneNumber());
        System.out.println(kurs.getDate());

        Student1 student1=new Student1();
        student1.setFirstName("Dina");
        student1.setLastName("Alianova");
        student1.setDayOfBirth(-12);
        student1.setEmail("dina.01@gmail.com");
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getDayOfBirth());
        System.out.println(student1.getEmail());
        System.out.println();
        Student1 student2=new Student1();
        student2.setFirstName("Aina");
        student2.setLastName("Alanova");
        student2.setDayOfBirth(18);
        student2.setEmail("aina.02@gmail.com");
        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getDayOfBirth());
        System.out.println(student2.getEmail());*/

      /*  Square square=new Square();
        square.setA(2);
        System.out.println(square.getA());
        square.setB(3);
        System.out.println(square.getB());
        System.out.println(square.getArea());*/
        Scanner scanner=new Scanner(System.in);
       /*// Rectangle rectangle=new Rectangle();
      //  rectangle.setWidth(scanner.nextInt());
      //  rectangle.setLength(scanner.nextInt());
     //   System.out.println(rectangle.getWidth());
     //   System.out.println(rectangle.getLength());
      //  System.out.println(rectangle.getArea());*/

        Student student=new Student();
        student.setFirstName(scanner.nextLine());
        student.setLastName(scanner.nextLine());
        student.setAge(scanner.nextInt());
        String[] coursess = new String[3];
        for (int i = 0; i < coursess.length ; i++) {
            coursess[i]= scanner.nextLine();
        }
        student.setCoursess(coursess);

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        for (String courses:coursess) {
            System.out.println(courses);
        }
      //  System.out.println(Arrays.toString(student.getCoursess()));




        /*
        Person person=new Person();
        person.name="Milana";
        person.surname= "Arkadi";
        person.age= 25;
        person.placeOfBirth=" Russia Moscow";
        person.residentialAddress="Kyrgyzstan, Bishkek";
        person.phoneNumber= 779444510;
       */
        /* System.out.print("Name: "+person.name+"\n"+"Surname: "+person.surname+"\n"+"Age: "
                +person.age+"\n"+"Place of birth: "+person.placeOfBirth+
                "\n"+"Residential address: "+person.residentialAddress+"\n"
                +"Phone number: +996"+person.phoneNumber+"\n  Milana 18 жашынан бери ");
        person.canDriveACar();*//*
        System.out.println("-------------------------------------------------");
        Person person2=new Person();
        person2.name="Lana";
        person2.surname= "Ahmadi";
        person2.age= 24;
        person2.placeOfBirth=" Kazakhstan Astana";
        person2.residentialAddress="Kyrgyzstan, Osh ";
        person2.phoneNumber= 779040500;


      *//*  System.out.print("Name: "+person2.name+"\n"+"Surname: "+person2.surname+"\n"+"Age: "
                +person2.age+"\n"+"Place of birth: "+person2.placeOfBirth+
                "\n"+"Residential address: "+person2.residentialAddress+"\n"
                +"Phone number: +996"+person2.phoneNumber+"\n  Lana 18 жашынан баштап  ");
        person2.canWriteCodeInJava();*//*

       Programmer devops=new Programmer();
        Scanner scanner=new Scanner(System.in);
        devops.name= scanner.nextLine();
        devops.surname= scanner.nextLine();
        devops.age= scanner.nextInt();
        System.out.println(devops.name+"  "+devops.surname);
        System.out.println(devops.getAge());*/
        //Курс деген класс түзүңүз
        //Курстун аты, номери, курс башталган күн
        //Студент деген класс түзүңүз
        //Студенттин аты, фамилиясы, туулган күнү, эмайлы
        //Геттер сеттерлерди маани берүү жана алуу үчүн колдонуу керек
        //Студенттин жашын терс эмес сан экенин текшерүү керек
        //Бир курс, эки студентти консольго чыгарыңыз

    }


}