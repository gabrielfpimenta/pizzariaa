package com.itb.inf2am.pizzariaa.model.repository;

import com.itb.inf2am.pizzariaa.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


}