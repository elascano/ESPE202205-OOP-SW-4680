package ec.edu.espe.SoccerPlayers.controller;

import ec.edu.espe.SoccerPlayers.model.SoccerPlayers;
import utils.DataBaseManager;
import utils.DataSoccerPlayers;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class SoccerPlayersController {
    DataSoccerPlayers dataSoccerPlayers;

    public boolean register(SoccerPlayers customer) {
        dataSoccerPlayers = new DataBaseManager();


        return true;
    }

    public boolean update(String criterion, SoccerPlayers soccerPlayers) {

        return false;
    }
    
    public boolean read(String source){
        //dataCustomer.read(source);
        return false;
    }
    
    public boolean delete(String criterion){
        dataSoccerPlayers.delete("SoccerPlayers", criterion);
        return false;
    }
}
