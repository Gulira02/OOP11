public class Main {
    public static void main(String[] args) {

        Person person=new Person();
        person.name="Milana";
        person.surname= "Arkadi";
        person.age= 25;
        person.placeOfBirth=" Russia Moscow";
        person.residentialAddress="Kyrgyzstan, Bishkek";
        person.phoneNumber= 779444510;
        System.out.print("Name: "+person.name+"\n"+"Surname: "+person.surname+"\n"+"Age: "
                +person.age+"\n"+"Place of birth: "+person.placeOfBirth+
                "\n"+"Residential address: "+person.residentialAddress+"\n"
                +"Phone number: +996"+person.phoneNumber+"\n  Milana 18 жашынан бери ");
        person.canDriveACar();
        System.out.println("/////////////////////////////////");
        Person person2=new Person();
        person2.name="Lana";
        person2.surname= "Ahmadi";
        person2.age= 24;
        person2.placeOfBirth=" Kazakhstan Astana";
        person2.residentialAddress="Kyrgyzstan, Osh ";
        person2.phoneNumber= 779040500;


        System.out.print("Name: "+person2.name+"\n"+"Surname: "+person2.surname+"\n"+"Age: "
                +person2.age+"\n"+"Place of birth: "+person2.placeOfBirth+
                "\n"+"Residential address: "+person2.residentialAddress+"\n"
                +"Phone number: +996"+person2.phoneNumber+"\n  Lana 18 жашынан баштап  ");
        person2.canWriteCodeInJava();

    }


}