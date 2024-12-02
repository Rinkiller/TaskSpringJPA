package rin.compani.jpa_db_postgress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rin.compani.jpa_db_postgress.models.Course;


public interface CourseRepository extends JpaRepository<Course,Long> {
}
