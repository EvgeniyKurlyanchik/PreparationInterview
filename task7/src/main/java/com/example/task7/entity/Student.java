package com.example.task7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="students")
@NamedQueries({
        @NamedQuery(name = "allStudents", query = "SELECT Student  FROM Student s"),
        @NamedQuery(name = "deleteStudent", query = "delete  from Student s where s.id = :id")
})
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void setLastNName(String lastNName) {
        this.lastName = lastNName;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false)
    private Long id;
    @Column(nullable = false)
        private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(name = "age")
    private Long age ;


    public Student( String firstName, String lastNName, Long age) {
        this.firstName = firstName;
        this.lastName = lastNName;
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

