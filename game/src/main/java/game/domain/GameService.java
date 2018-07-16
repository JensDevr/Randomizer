package game.domain;

import game.domain.Game;
import game.domain.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getAllGames(){
        return gameRepository.getAllGames();
    }

    public void addGame(String name){
        gameRepository.addGame(new Game(name));
    }

    public List<Game> getGameByName(String name){
        return gameRepository.getGameByName(name);
    }
}
