package udemy.Section57.Lesson457;

/**
 * Created by Binh
 * Date : 2/18/2023 - 6:33 PM
 * Description :
 */
public class Student {
    private int clazz ;
    private String firstName;
    private String lastName;
    private boolean active;

//    public Student(int id, String firstName, String lastName, boolean active) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.active = active;
//    }


    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
