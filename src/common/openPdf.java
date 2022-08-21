/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author jayak
 */
public class openPdf {

    public static void openNyID(String id) {
        try {
            if((new File("C:\\Users\\jayak\\Documents\\bill genearated"+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\jayak\\Documents\\bill genearated"+id+".pdf");
            }else{
                JOptionPane.showMessageDialog(null, "File does not Exists");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
