package com.artezio.lecture.entity.ldap;

import javax.persistence.Temporal;
import java.util.Date;

public class Employee {
    /**
     * cn
     * Первичный ключ LDAP (Фамилия, Имя)
     */
    private String cn;
    /**
     * givenName
     */
    private String firstName;
    /**
     * sn
     */
    private String lastName;
    /**
     * mail
     */
    private String email;
    /**
     * sAMAccountName
     */
    private String login;
    /**
     * whenCreated
     */
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date recruitmentDate;
    /**
     * manager
     */
    private String manager;
    /**
     * physicalDeliveryOfficeName
     */
    private String officeName;
    /**
     * country
     */
    private String country;
    /**
     * streetAddress
     */
    private String address;
    /**
     * description
     */
    private String description;
    /**
     * extensionAttribute1
     */
    private String position;
    /**
     * extensionAttribute2
     */
    private String specialization;
    /**
     * extensionAttribute3
     */
    private String role;
}
