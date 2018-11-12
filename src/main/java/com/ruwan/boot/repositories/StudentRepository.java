package com.ruwan.boot.repositories;

import com.ruwan.boot.domain.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDTO, Integer> {


}
