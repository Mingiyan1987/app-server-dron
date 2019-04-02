package ru.basanov.appserverdron.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.basanov.appserverdron.model.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "appZone")
@Getter
@Setter
@NoArgsConstructor
public class Zone extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name_zone")
    private String nameZone;

    public Zone(String nameZone) {
        this.nameZone = nameZone;
    }

    @Override
    public <T> T getEntity(TypedQuery<T> query) {
        return super.getEntity(query);
    }
}
