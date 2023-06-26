package com.edventurekids.school.repository;

import com.edventurekids.school.model.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HolidaysRepository extends CrudRepository<Holiday, String> {

}
