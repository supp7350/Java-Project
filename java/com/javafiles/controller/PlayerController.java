package com.javafiles.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.javafiles.dao.PlayerDao;
import com.javafiles.model.Playerr;

/**
 * Controller class to manage player-related operations.
 */
public class PlayerController {
    private PlayerDao c2w_pi_playerDao = new PlayerDao(); // Instance of PlayerDao to interact with the database

    /**
     * Method to retrieve all players from the database.
     * 
     * @return A list of all Player objects.
     */
    

    /**
     * Method to add a player to the database.
     * 
     * @param c2w_pi_data The Player object to be added.
     * @return true if the player is added successfully, false
     *         otherwise.
     */
    

    /**
     * Method to search for players based on a key (playerName or
     * country).
     * 
     * @param c2w_pi_key The search key.
     * @return A list of Player objects that match the search
     *         key.
     */
   /* public List<Player> getSearchPlayer(String c2w_pi_key) {
        try {
            return c2w_pi_playerDao.getSearchPlayer(c2w_pi_key);// Search for players based on the key
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
        return new ArrayList<>(); // Return an empty list if an exception occurs
    }
*/
    /**
     * Method to retrieve all unique countries and their flags
     * from the player database.
     * 
     * @return A map where the key is the country name and the
     *         value is the flag URL.
     */
    // public Map<String, String> getAllCountries() {
    //     Map<String, String> c2w_pi_countries = new HashMap<>();
    // }

        // Map to store country names and flag URLs

       /* List<Playerr> c2w_pi_playersList = getAllPlayers(); // Retrieve all players

        for (Playerr c2w_pi_player : c2w_pi_playersList) {
            if

            (!c2w_pi_countries.containsKey(c2w_pi_player.getCountry())) { // If the country is not already in the map

                c2w_pi_countries.put(c2w_pi_player.getCountry(),
                        c2w_pi_player.getFlag()); // Add country and flag to the map

            }
        }
        return c2w_pi_countries; // Return the map of countries and flags
    }
*/
    /**
     * Method to retrieve all players from a specific country.
     * 
     * @param c2w_pi_country The name of the country.
     * @return A list of Player objects from the specified
     *         country.
     */
    public List<Playerr> getAllPlayersByCountry(String c2w_pi_country) {
        //private PlayerDao c2w_pi_playerDao = new PlayerDao();
        try {
            return c2w_pi_playerDao.getDataList("player", c2w_pi_country); // Retrieve players from the specified
                                                                           // country
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace(); // Print stack trace for debugging
        }
        return new ArrayList<>(); // Return an empty list if an exception occurs
    }

    public void updateVote(String collection, String document, String user) {
        c2w_pi_playerDao.updateVote(collection, document, user);
    }
}