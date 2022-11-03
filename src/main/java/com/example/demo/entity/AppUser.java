package com.example.demo.entity;

import com.example.demo.security.AppUserRole;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table
public class AppUser implements UserDetails {
    //fields that users fill
    @Id
    @Column(name = "IIN", nullable = false)
    private Long IIN;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String middlename;
    private Date birthdate;
    private boolean gender;
    private String region;
    private String city;
    private String address;
    private int school;
    private int grade;
    //fields that the system needs
    @Enumerated(EnumType.STRING)
    private AppUserRole appUserRole;
    private Boolean locked = false;
    private Boolean enabled = true;

    public AppUser(Long IIN, String password, String email, String firstName,
                   String lastName, String middlename, Date birthdate,
                   boolean gender, String region, String city, String address,
                   int school, int grade, AppUserRole appUserRole) {
        this.IIN = IIN;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middlename = middlename;
        this.birthdate = birthdate;
        this.gender = gender;
        this.region = region;
        this.city = city;
        this.address = address;
        this.school = school;
        this.grade = grade;
        this.appUserRole = appUserRole;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(appUserRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    public Long getIIN() {
        return IIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastName;
    }


    public boolean getGender() {
        return gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public int getSchool() {
        return school;
    }

    public int getGrade() {
        return grade;
    }

    public AppUserRole getUserRole() {
        return appUserRole;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}
