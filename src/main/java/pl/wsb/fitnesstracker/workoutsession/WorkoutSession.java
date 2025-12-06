package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

// TODO: Define the Event entity with appropriate fields and annotations
public class WorkoutSession {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainingId")
    private List<WorkoutSession> trainingSessions;

    private String timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
}
