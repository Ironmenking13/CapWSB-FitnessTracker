package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "HealthMetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "user_id", nullable = true, unique = true)
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> user_id;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "weight", nullable = true)
    private LocalDate weight;

    @Column(name = "height", nullable = true)
    private LocalDate height;

    @Column(name = "hearthRate", nullable = true)
    private LocalDate hearthRate;


}
