package com.sysetm27.AngularSpring.Model;

import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int salary;

    @Column
    private int age;

}
