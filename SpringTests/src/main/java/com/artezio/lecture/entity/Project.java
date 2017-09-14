package com.artezio.lecture.entity;

import com.artezio.lecture.enumeration.ProjectStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Project implements Serializable {
    private static final long serialVersionUID = -3689791461601721266L;

    @Id
    private Integer id;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.STRING)
    private ProjectStatus status;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private Project parent;
    @ManyToOne
    @JoinColumn
    private Employee manager;
    @ManyToOne
    @JoinColumn
    private List<ProjectEmployee> employees;

}
