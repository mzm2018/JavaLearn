package person.Excercise30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {

            return this.firstName;

    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        if (this.age < 0 || this.age > 100) {
            return 0;
        } else {
            return this.age;
        }
    }
    public boolean isTeen() {
        return this.age < 20 && this.age > 12;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else return this.firstName + " " + this.lastName;
    }





}
