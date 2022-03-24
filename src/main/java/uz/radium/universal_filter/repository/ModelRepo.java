package uz.radium.universal_filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.radium.universal_filter.entity.Model;

import java.util.List;
import java.util.Optional;

public interface ModelRepo extends JpaRepository<Model, Long> {

    List<Model> findAllByTrashIsFalseOrderByIdDesc();

    Boolean existsByIdAndTrashIsFalse(Long id);
    Boolean existsByNameAndTrashIsFalse(String name);

    Optional<Model> findByIdAndTrashIsFalse(Long id);

    //select * from model where name = :name;
    List<Model> findAllByNameAndTrashIsFalse(String name);

    //select * from model where name = :name;
    Optional<Model> findByNameAndTrashIsFalse(String name);
}