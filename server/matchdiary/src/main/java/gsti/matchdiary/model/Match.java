package gsti.matchdiary.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "match")
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "score_team_one")
    private Integer scoreTeamOne;

    @Column(name = "score_team_two")
    private Integer scoreTeamTwo;

    @ManyToOne
    @JoinColumn(name = "team_one_id")
    private Team teamOne;
    @ManyToOne
    @JoinColumn(name = "team_two_id")
    private Team teamTwo;
    @ManyToOne
    @JoinColumn(name = "team_supported_id")
    private Team supportedTeam;

}
