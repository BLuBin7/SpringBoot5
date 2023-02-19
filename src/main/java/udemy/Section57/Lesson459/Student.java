package udemy.Section57.Lesson459;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Binh
 * Date : 2/18/2023 - 10:23 PM
 * Description :
 */
//dùng để bỏ qua các thuộc tính không được khai báo, chương trình vẫn chạy (ví dụ company)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languagues;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getLanguagues() {
        return languagues;
    }

    public void setLanguagues(String[] languagues) {
        this.languagues = languagues;
    }
}
