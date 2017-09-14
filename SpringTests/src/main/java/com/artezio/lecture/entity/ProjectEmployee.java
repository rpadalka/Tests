package com.artezio.lecture.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

public class ProjectEmployee implements Serializable {
    private static final long serialVersionUID = 169858883917375103L;

    @Id
    private Integer id;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn
    private Project project;
    @ManyToOne
    @JoinColumn
    private Employee employee;

}
