package ru.basanov.appserverdron.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appDron")
@Getter
@Setter
@NoArgsConstructor
public class Dron extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "dron", fetch = FetchType.LAZY)
    private  List<Track> tracks;

    @Override
    public <T> T getEntity(TypedQuery<T> query) {
        return super.getEntity(query);
    }

    public Dron(String name) {
        this.name = name;
    }
}
