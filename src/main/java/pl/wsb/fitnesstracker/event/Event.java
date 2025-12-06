package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;

import java.util.Date;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "Event")
public class Event{

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "StartTime")
    private Date startTime;

    @Column(name = "EndTime")
    private Date endTime;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

}
