package model;

public abstract class Person {

    protected int id;
    protected String name;
    protected int age;


    Person(int id , String name , int age){
        this.id = id ;
        this.name = name;
        this.age = age;
    }

    public abstract void display();

    // Getters
    public int getId() {return this.id;}
    public String getName() {return  this.name;}
    public int getAge() {return this.age;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

}
