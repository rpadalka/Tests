package com.artezio.lecture.repository;

import com.artezio.lecture.entity.Office;
import org.springframework.data.repository.CrudRepository;

public interface OfficeRepository extends CrudRepository<Office, Integer> {
}
