/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.megadodawanie;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    /**
     * Patryk Żywica
     */
    
    @Test
    public void testAdd() {
        assertEquals("0", Dodawanie.add("0", "0"));
    }
    @Test
    public void testAdd1() {
        assertEquals("5", Dodawanie.add("2", "3"));
    }
    @Test
    public void testAdd2() {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        for(int i=0;i<1000; i++){
            assertEquals(Integer.toString(a+b), Dodawanie.add(Integer.toString(a), Integer.toString(b)));
        }
    }
    


    /// Rafał Piotrowski
    
    public void testAdd11() {
        assertEquals("-1", Dodawanie.add("-1", "0"));
    }
    public void testAdd12() {
        assertEquals("0", Dodawanie.add("-10", "10"));
        } 
    public void testAdd13() {
       assertEquals("-1000", Dodawanie.add("-999", "-1"));   
        }
    /// Rafał Piotrowski
    
    
            /**
         * Szymon Bladoszewski
         */
    @Test
    public void testAdd3() {
        assertEquals("5.01", Dodawanie.add("2.01", "3"));
    }
    

    @Test
    public void testAdd4() {
        assertEquals("1", Dodawanie.add("0,5", "0,5")); 
    }

    
    @Test
    public void testAdd5() {
        assertEquals("2,147,483,650", Dodawanie.add("2,147,483,647", "3")); ///int size
    }
    /////////
            /**
         * Dawid Majsnerowski
         */
    @Test
    public void testAdd7() {
        assertEquals("111", Dodawanie.add("b100", "b11")); //binarna
    }
    /// Rafał Piotrowski
    
    
            /**
         * Szymon Bladoszewski
         */

    

    @Test
    public void testAdd8() {
        assertEquals("1010", Dodawanie.add("b11", "b111")); //binarna
    }
    
    @Test
    public void testAdd9() {
        assertEquals("1011111111", Dodawanie.add("100000000", "b10000000")); //b oznacza l. binarna
    }
    /////////
    // zmieniłem identyfikatory testów bo kolidowały ze sobą. każdy z trzech testów nazywał się testAdd7()


    /////////
            /**
         * Dawid Majsnerowski
         */

    /////////
    // zmieniłem identyfikatory testów bo kolidowały ze sobą. każdy z trzech testów nazywał się testAdd7()

    /////////
    // Jakub Piechowiak
    @Test
    public void testAdd100() {
        assertEquals("3E4", Dodawanie.add("hB5", "h32F")); //heksadecymalna
    }
    
    @Test
    public void testAdd101() {
        assertEquals("879", Dodawanie.add("h84D", "h2C")); //heksadecymalna
    }
    
    @Test
    public void testAdd102() {
        assertEquals("169", Dodawanie.add("h6A", "hFF")); //heksadecymalna
    }
    
    ////////
    // Stanislaw Golebiewski
    @Test
    public void testAdd103() {
        Random rand = new Random();
        for(int i=0;i<50; i++){
            int a = rand.nextInt(2048)+1;
            int b = rand.nextInt(2048)+1;
            String c = Integer.toBinaryString(a+b);
            assertEquals(c, Dodawanie.add("b"+Integer.toBinaryString(a), "b"+Integer.toBinaryString(b))); //dodaj dwie pseudolosowe liczby binarne
        }
    }
    @Test
    public void testAdd104() {
        assertEquals("BA6", Dodawanie.add("hBA0", "b110")); //heksadecymalna + binarna 
    }
    
    @Test
    public void testAdd105() {
        assertEquals("4BA", Dodawanie.add("b1000", "h4B2")); //binarna + heksadecymalna
    }
    //
    

    //Szymon Nedzi 
    @Test
    public void testAdd106() {
        assertEquals("romXVII", Dodawanie.add("romIX","rVIII")); // Małe rzymskie
    }
    @Test
    public void testAdd107() {
        assertEquals("romXCVII", Dodawanie.add("romCXVI", "b111111")); // Duża rzymska 66 i binarna 31 daja rzymskie 97
    }
    @Test
    public void testAdd108() { 
        assertEquals("h6B", Dodawanie.add("h42","romXXXI")); // Hexowa 76 i rzymska 31 daja hexowe 107

    }
    //

    //Jakub Wawrzynaik
    //Dodawanie czasu do danej godziny
    @Test
    public void testAdd109(){
        assertEquals("17:35", Dodawanie.add("16:30", "01:05")); //16:30 + 1 godzina i 5 minut
    }
    @Test
    public void testAdd110(){
        assertEquals("17:05", Dodawanie.add("16:55", "00:10"));
    }
    @Test
    public void testAdd111(){
        assertEquals("00:30", Dodawanie.add("23:45", "00:45"));
    }
    
    //


    //Czepułkowski Kryspin
    //Dodawanie dat 
    @Test
    public void testAdd10534549(){
        assertEquals("15-04-2010", Dodawanie.add("14-02-2010", "01-02-0000"));
    }
    @Test
    public void testAdd1534534510(){
        assertEquals("01-01-2000", Dodawanie.add("31-12-1999", "01-00-0000"));
    }
    @Test
    public void testAdd134534511(){
        assertEquals("29-02-2016", Dodawanie.add("26-01-0000", "03-01-0000"));
    }
           //Aleksander Kruk
     //Dodawanie kilogramów
     @Test
     public void testAdd11109(){
         assertEquals("10kg", Dodawanie.add("3kg", "7kg")); 
    }
     @Test
     public void testAdd11110(){
         assertEquals("20kg", Dodawanie.add("30kg", "-10kg"));
     }
     @Test
     public void testAdd11111(){
         assertEquals("2kg", Dodawanie.add("1kg", "1kg"));
}
    //Jakub Kowalewski
    @Test
    public void testAdd1001(){
        assertEquals("2007.01.23", Dodawanie.add("2006.12.23", "1")); //data + ilosc miesiecy
    }
    
    @Test
    public void testAdd1002(){
        assertEquals("2008.05.23", Dodawanie.add("2006.12.23", "12"));
    }
    
    @Test
    public void testAdd1003(){
        assertEquals("2006.06.23", Dodawanie.add("2006.12.23", "-6"));
    }
    //
    
    
    
    //Paweł Kowalski
    //Dodawanie dm^3, a podanie wyniku w litrach
    @Test
    public void testAdd14001(){
        assertEquals("15l", Dodawanie.add("10dm^3", "5dm^3")); 
    }
    
    @Test
    public void testAdd14002(){
        assertEquals("5l", Dodawanie.add("2dm^3", "3dm^3"));
    }
    
    @Test
    public void testAdd14003(){
        assertEquals("20l", Dodawanie.add("21dm^3", "-1dm^3"));
    }
    
    //Agnieszka Goldmann ->
    @Test
    public void testAdd4043(){
        assertEquals("1m", Dodawanie.add("50cm", "50cm"));
    }
    
    @Test
    public void testAdd4044(){
        assertEquals("0.7m", Dodawanie.add("20cm", "50cm"));
    }
   
    @Test
    public void testAdd4045(){
        assertEquals("100m", Dodawanie.add("2000cm", "-1000cm"));
    }
    //<-
	@Test
    public void testAdd5011(){
        assertEquals("1km", Dodawanie.add("500m", "500m"));
    }
    
    @Test
    public void testAdd5012(){
        assertEquals("3.5km", Dodawanie.add("2.4km", "1.1km"));
    }
   
    @Test
    public void testAdd5013(){
        assertEquals("10km", Dodawanie.add("20km", "-30km"));
    }
}
