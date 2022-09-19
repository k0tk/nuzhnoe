package org.example.model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "class_car")
    private String classCar;
    @Column(name = "model")
    private String model;
    @Column(name = "count_doors")
    private int NumOfDoors;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;







}
