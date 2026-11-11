package com.dt2.mine.controllers;

import com.dt2.mine.entities.Game;
import com.dt2.mine.repositories.GameRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jogos")
public class GameController {
    private final GameRepository repository;
    public GameController(GameRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public List<Game> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public String criar(@RequestBody Game game){
        try {
            repository.save(game);
            return "Game salvo com sucesso! ";
        }
        catch (Exception e){
            return "Deu ruim pai!";
        }


    }
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "Excluido com sucesso!";
    }
}
