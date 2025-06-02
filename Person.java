
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Person
{
    private String lastName;
    private String firstName;
    Person(){
        lastName = "";
        firstName = "";
        
    }
    Person(String lname){
        firstName = "";
        lastName = lname; 
    }
    Person(String lname, String fname){
        lastName = lname;
        firstName = fname;
    }
}
