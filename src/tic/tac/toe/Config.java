/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author P
 */
public class Config {
    private static String RECORDS_DIR = "tic-tac-toe" + System.getProperty("file.separator") + "records";
    public static String getRecordsPath() {
        return System.getProperty("user.home") + System.getProperty("file.separator") + RECORDS_DIR;
    }
}
