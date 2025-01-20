package com.devsuperior.listds.repositories;

import com.devsuperior.listds.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
