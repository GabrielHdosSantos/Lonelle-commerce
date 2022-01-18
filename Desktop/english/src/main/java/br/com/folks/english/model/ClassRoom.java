package br.com.folks.english.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class ClassRoom implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String book;
    private LocalDate date;
    private LocalDateTime hour;

    @ManyToOne
    private Teacher teacher;

    @OneToMany(mappedBy = "classRoom")
    private List<Student> students;

    public ClassRoom(String book, LocalDate date, LocalDateTime hour, Teacher teacher, List<Student> students) {
        this.book = book;
        this.date = date;
        this.hour = hour;
        this.teacher = teacher;
        this.students = students;
    }

    @Deprecated
    public ClassRoom(){}
}
