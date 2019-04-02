package ru.basanov.appserverdron.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "appTrack")
@Getter
@Setter
@NoArgsConstructor
public class Track extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dron_id")
    private Dron dron;

    @Override
    public <T> T getEntity(TypedQuery<T> query) {
        return super.getEntity(query);
    }

    public Track(Dron dron) {
        this.dron = dron;
    }
}
