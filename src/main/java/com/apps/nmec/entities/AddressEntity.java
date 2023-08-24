package com.apps.nmec.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
//@Entity
//@Table(name="address")
public class AddressEntity implements Serializable {

//	@Id
//	@GeneratedValue(generator = "uuid2")
//	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//	@Column(name = "id", columnDefinition = "VARCHAR(255)")
	@JsonProperty("id")
	String id;

//	@Column(name="street")
    private String street;

//    @Column(name="city")
    private String city;

//    @Column(name="state")
    private String state;

//    @Column(name="country")
    private String country;

//    @Column(name="zip_code")
    private String zipCode;

}





