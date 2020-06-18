package com.liv2train.backend.entity;

import com.liv2train.backend.dto.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class TrainingCenter {

    @Id
    private String id;

    @Size(max = 40, message = "Please enter max 40 character in centerName")
    private String centerName;

    @Pattern(regexp = "^([a-zA-Z0-9]{12})$" , message = "Please enter exactly 12 character alphanumeric in centerCode")
    private String centerCode;

    private Address address;

    private Integer studentCapacity;

    private List<String> coursesOffered;

    private Date createdOn;

    @Pattern(regexp = "^([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-.]+)\\.([a-zA-Z]{2,5})$" , message = "Please enter valid email")
    private String contactEmail;

    @Pattern(regexp = "^([6-9][0-9]{9})$", message = "please enter valid contact number")
    private String contactPhone;

}
