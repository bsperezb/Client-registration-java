/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author brayan
 */
public class Auxiliarfuntion {
    public static int getIntegerValue(String s) {
    return (int) ("".equals(s) ? 0 : Long.parseLong(s));
}
    
}
