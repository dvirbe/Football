package org.example;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static final int SECOND = 1000;
    private static int playerID=1;
    public static final List<String> FIRST_NAMES = List.of("gil","or", "david", "ben", "dov", "dan", "ron", "pelg", "ram", "rom", "don" , "ori" , "omer", "yuda", "dvir,","daniel","yogev","lior","ari","yosef","amir","oleg","eden","alex","matan","avi","ravid","ofek","sun","dror");
    public static final List<String> LAST_NAMES = List.of("hatar","hamar","hadad","swisa","benzakai","edri","levi","buzaglo","dadon","hatav","goren","bashtaker","bechor","biran","alon","mizrahi","arel","gilboha","avidan","nezer","kadosh","malihac","ovad","cohen","bentov","haim","zion","dagan","golan","vaizman");

    public static void sleep(int sec){
            try {
                Thread.sleep(sec * SECOND);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
//    private static final String PATH_TO_DATA_FILE = "src/main/java/org/example/Assets/Teams.csv";
//
//    public static List<String> readFile() {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH_TO_DATA_FILE));
//            List<String> teamData = new ArrayList<>();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                teamData.add(line);
//            }
//            teamData.remove(0);
//            bufferedReader.close();
//            return teamData;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }


    public static int getNewPlayerId(){
        return playerID++;
    }
}