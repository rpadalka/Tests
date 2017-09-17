package com.artezio.lecture.entity.ldap;

import javax.persistence.Temporal;
import java.util.Date;
import java.util.List;

public class Project {
    /**
     * cn
     * Первичный ключ LDAP (_ART-PRJ-...)
     */
    private String cn;
    /**
     * member
     */
    private List<String> memberList;
    /**
     * name
     */
    private String projectName;
    /**
     * whenCreated
     */
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createDate;
}
