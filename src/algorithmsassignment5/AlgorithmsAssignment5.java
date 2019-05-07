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
public class AlgorithmsAssignment5 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<String> textFileList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        FileReaderLogic frl = new FileReaderLogic();
        frl.readFile(textFileList);
        
        for (int i = 0; i < textFileList.size(); i++) {
            System.out.println(textFileList.get(i));
        }
    }
    
}
