package com.portfolio.fdp.Repository;


import com.portfolio.fdp.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer>{
    
public Optional<Skills> findByUnaSkill(String unaSkill);
public boolean existsByUnaSkill(String unaSkill);
}
