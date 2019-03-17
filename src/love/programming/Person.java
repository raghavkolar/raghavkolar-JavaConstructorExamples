package love.programming;

public class Person {


    String firtsName;
    String lastName;
    int  age;


    public Person(){

    }

    public Person( String myFirstName,String myLastname, int myage){

        firtsName=myFirstName;
        lastName=myLastname;
        age=myage;

    }

    public Person( String myFirstName,String myLastname){

        firtsName=myFirstName;
        lastName=myLastname;

    }

    public Person( String myFirstName){

        firtsName=myFirstName;

    }

    public String getFirtsName(){

        return firtsName;
    }

    public String getLastName(){

        return lastName;
    }



    public int getage(){

        return age;
    }
}
