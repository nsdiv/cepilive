package com.cepi.repository;

import com.cepi.repo.IndividualTEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * Created by ndivadkar on 5/23/15.
 */
public interface IndividualTRepository extends JpaRepository<IndividualTEntity, Long> {

    List<IndividualTEntity> findByEmailAddress(String emailAddress);
}
