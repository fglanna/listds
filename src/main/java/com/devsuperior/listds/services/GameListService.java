package com.devsuperior.listds.services;

import com.devsuperior.listds.dto.GameDTO;
import com.devsuperior.listds.dto.GameListDTO;
import com.devsuperior.listds.dto.GameMinDTO;
import com.devsuperior.listds.entities.Game;
import com.devsuperior.listds.entities.GameList;
import com.devsuperior.listds.repositories.GameListRepository;
import com.devsuperior.listds.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
