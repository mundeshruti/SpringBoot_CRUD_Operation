package SPRINGBOOT.CRUD.crud.operation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SPRINGBOOT.CRUD.crud.operation.entity.Student;


@Repository
public interface Studentrepository extends JpaRepository<Student, Long> {

}
