/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsassignment5;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hallur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<String> textFileList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        /*FileReaderLogic frl = new FileReaderLogic();
        frl.readFile(textFileList);
        
        for (int i = 0; i < textFileList.size(); i++) {
            System.out.println(textFileList.get(i));
        }*/
        
        Logic l = new Logic();
        l.insertWord("hej");
        
        //plan =
        // lav reglerne for a-z, deres indexes skal være 0-26
        // hver gang en liste laves, skal de have disse keys med tomme values til at starte med.
        // når et nyt ord sættes ind, så skal for længden af ordet sættes det antal lister ind som sub lists, og hver
        // liste skal have en value (value er antal gange et ord har henten en værdi (feks 1 gang, nu er det 2) fra et sidste bogstav
        //i et ord. Roden har null værdi (et ord med ingen bogstaver).
    }
    
}
