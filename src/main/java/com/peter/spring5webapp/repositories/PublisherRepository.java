package com.peter.spring5webapp.repositories;

import com.peter.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Peter
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
