/**
 * 
 */
package com.neon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neon.model.Grade;

/**
 * @author user364
 *
 */
@Repository
public interface GradeRepository extends CrudRepository<Grade, Integer>{

}
