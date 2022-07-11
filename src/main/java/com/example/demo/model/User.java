package com.example.demo.model;

import com.example.demo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;


@Data
@NoArgsConstructor
@Entity(name = "`user`")
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 15)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 15)
    private String lastName;

    @Email
    @NotBlank
    @Size(min = 9, max = 30)
    private String email;

    private Boolean isActivated;

    private String confirmationToken;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> role;

//    @ToString.Exclude отключает Data annotation for method toString

}
