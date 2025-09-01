package com.itb.inf2am.pizzariaa.model.repository;

import com.itb.inf2am.pizzariaa.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {


}