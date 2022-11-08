package com.abdullah.springbootimportcsvfile.repository;

import com.abdullah.springbootimportcsvfile.entity.CsvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsvFileRepository extends JpaRepository<CsvEntity, Integer>{
}