package game.domain;


import game.domain.Game;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class GameRepository {

    private ArrayList<Game> games = new ArrayList<>();

    public List<Game> getAllGames(){
        return games;
    }

    public void addGame(Game game){
        games.add(game);
    }

    public List<Game> getGameByName(String name){
        return games.stream()
                .filter(game -> game.getName().matches(getRegex(name)))
                .collect(toList());
    }

    private String getRegex(String unformattedRegex){
        return ".*" + unformattedRegex.replace("*", ".*") + ".*";
    }
}
