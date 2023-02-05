package com.example.task5;

import jakarta.persistence.*;
import lombok.*;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( nullable = false)
    private Long id;
    @Column(nullable = false)
        private String name;
    @Column(name="mark")
    @GeneratedValue(strategy = GenerationType.TABLE)
        private  int mark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student( String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
