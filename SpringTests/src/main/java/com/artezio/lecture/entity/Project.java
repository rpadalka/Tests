package com.artezio.lecture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Project implements Serializable {
    private static final long serialVersionUID = -3689791461601721266L;

    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String code;
    @ManyToMany(mappedBy = "employee")
    private List<Employee> employees;

}
