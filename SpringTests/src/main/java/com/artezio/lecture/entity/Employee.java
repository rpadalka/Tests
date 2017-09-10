package com.artezio.lecture.entity;

import com.artezio.lecture.enumeration.EmployeeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = -4347098145842363881L;

    @Id
    private Integer id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @ManyToOne
    @JoinColumn
    private Office office;
    @ManyToMany(mappedBy = "office")
    private List<Project> projects;
    @Column
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

}
