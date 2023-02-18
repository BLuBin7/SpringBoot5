package amigoscode;
import jakarta.persistence.*;

@Entity(name = "Student")
public class Student {
    @Id
//    Tạo trình tự cho table
    @SequenceGenerator(
            name = " student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
            )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
//          "false là không được cập nhật cột này, "true" là ngược lại
            updatable = false
    )
    private Long id;
    @Column(
            name = "fristName",
            nullable = true,
//          Định nghĩa chỉ được nhâp văn bản
            columnDefinition = "TEXT"
    )
    private String fristName;

    @Column(
            name = "lastName",
            nullable = true,
//          Định nghĩa chỉ được nhâp văn bản
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            name = "email",
            nullable = true,
//          Định nghĩa chỉ được nhâp văn bản
            columnDefinition = "TEXT",

//          set cho email này là duy nhất
            unique = true
    )
    private String email;
    @Column(name = "age")
    private Integer age;

    public Student(Long id,
                   String fristName,
                   String lastName,
                   String email,
                   Integer age) {
        this.id = id;
        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Student() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
