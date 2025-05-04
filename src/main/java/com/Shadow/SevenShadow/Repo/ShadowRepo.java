package com.Shadow.SevenShadow.Repo;

import com.Shadow.SevenShadow.Model.Shadow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShadowRepo extends JpaRepository<Shadow, Integer>{


}
