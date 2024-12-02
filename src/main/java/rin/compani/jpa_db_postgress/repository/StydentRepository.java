package rin.compani.jpa_db_postgress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rin.compani.jpa_db_postgress.models.Student;

public interface StydentRepository extends JpaRepository<Student,Long> {
}
