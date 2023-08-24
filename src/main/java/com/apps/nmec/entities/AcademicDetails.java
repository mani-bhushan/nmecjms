package com.apps.nmec.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
//@Entity
//@Table(name="academic_details")
public class AcademicDetails implements Serializable {

//    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    @JsonProperty("id")
    private String id;

    
    private String exam;

    
    private String faculty;

    
    private String universityName;

    
    private String collegeName;

    
    private String passingYear;

    
    private String subjectNames;

    
    private Integer fullMarks;

    
    private Integer obtainedMarks;

    
    private String division;

}
