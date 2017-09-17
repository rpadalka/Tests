package com.artezio.lecture.entity;

import com.artezio.lecture.enumeration.EmployeeStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = -4347098145842363881L;

    @Id
    private Integer id;
    @Column
    private String login;
    @Column
    private String cn;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    @Column
    private LocalDate startDate;
    @ManyToOne
    @JoinColumn
    private Office office;
    @OneToMany(mappedBy = "employee")
    private List<ProjectEmployee> projects;

}
