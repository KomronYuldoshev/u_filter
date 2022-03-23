package uz.radium.universal_filter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mark")
public class Mark extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;
}
