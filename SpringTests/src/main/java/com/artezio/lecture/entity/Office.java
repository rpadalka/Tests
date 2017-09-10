package com.artezio.lecture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Office implements Serializable {
    private static final long serialVersionUID = -3579563901459685639L;

    @Id
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "employee")
    private List<Employee> employees;

}
