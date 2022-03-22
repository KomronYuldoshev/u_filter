package uz.radium.universal_filter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "model")
public class Model extends BaseEntity {
    @Column(name = "name", nullable = false, unique = true)
    private String name;


}
