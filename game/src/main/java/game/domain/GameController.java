package game.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Game> getGames(){
        return gameService.getAllGames();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public
    @ResponseBody
    void addGame(@RequestParam(value = "name", required = true) String name){
        gameService.addGame(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public
    @ResponseBody
    List<Game> getGameByName(@RequestParam("name") String name){
        return gameService.getGameByName(name);
    }
}
