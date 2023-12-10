package com.ra.recep.persistence.repository;

import com.ra.recep.persistence.entity.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitorRepository extends JpaRepository<VisitorEntity, String> {
    List<VisitorEntity> findByNameLike(String name);
}
