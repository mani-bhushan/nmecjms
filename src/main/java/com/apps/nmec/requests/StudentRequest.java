package com.apps.nmec.requests;

import com.apps.nmec.entities.AcademicDetails;
import com.apps.nmec.entities.AddressEntity;
import com.apps.nmec.entities.UserEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequest implements Serializable {

    
    private String rollNo;

    
    private LocalDateTime admissionDate;

    
    private String receiptNo;

    
    private String counsellorId;

    
    private String faculty;

    
    private String session;

    
    private String majorSubjects;

    
    private String irc;

    
    private String language;

    
    private String name;

    
    private String gender;

    
    private String fatherName;

    
    private String motherName;

    
    private LocalDateTime dateOfBirth;

    
    private String aadharNo;

    
    private String mobileNo;

    
    private String religion;

    
    private String emailId;

    
    private String category;

    
    private String caste;

    
    private AddressEntity presentAddress;

    
    private AddressEntity permanentAddress;

    
    private String maritalStatus;

    
    private Set<AcademicDetails> academicDetails;

    
    private String nationality;

    @JsonIgnore
    private UserEntity user;

}
