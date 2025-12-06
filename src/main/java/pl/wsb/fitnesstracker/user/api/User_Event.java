package pl.wsb.fitnesstracker.user.api;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.event.Event;

import java.util.List;

public class User_Event {

    @Id
    @GeneratedValue
    private int id;


    @Column(name = "user_id")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<User> user_id;

    @Column(name = "event_id")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private List<Event> eventId;

    @Column(name = "status")
    private String status;

}
