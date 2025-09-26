
package customers;

public class Person {
    
    private String name;
    private int age;
    
    public Person(){
        this.name = "";
        this.age = 0;
    }
    
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    
    // SETTERS
    
    protected final void setName(String name){
        this.name = name;
    }
    
    protected final void setAge(int age){
        this.age = age;
    }
    
    // GETTERS
    
    protected String getName(){
        return this.name;
    }
    
    protected int getAge(){
        return this.age;
    }
    
    @Override
    
    public String toString(){
        return "Name: " + this.getName() + "\n Age: " + this.getAge();
    }
}
