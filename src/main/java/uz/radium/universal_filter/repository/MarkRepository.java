package uz.radium.universal_filter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.radium.universal_filter.entity.Mark;
import uz.radium.universal_filter.entity.Model;

import java.util.List;
import java.util.Optional;

public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findAllByTrashFalse();

    Optional<Mark> findByIdAndTrashFalse(Long id);

    //selet * from mark where name = :name;
    Mark findByName(String name);

    //select * from mark where id = :id and trash = false;
    List<Mark> findAllByName(String name);

}
