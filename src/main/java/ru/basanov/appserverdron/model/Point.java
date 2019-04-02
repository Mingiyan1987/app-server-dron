package ru.basanov.appserverdron.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.basanov.appserverdron.model.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "appPoint")
@Getter
@Setter
@NoArgsConstructor
public class Point extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "height")
    private double height;


    public Point(double latitude, double longitude, double height) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height;
    }

    @Override
    public <T> T getEntity(TypedQuery<T> query) {
        return super.getEntity(query);
    }
}
