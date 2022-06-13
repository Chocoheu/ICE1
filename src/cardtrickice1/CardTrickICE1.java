/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan
 * Minh Ha Pham 991647919
 */

import java.util.Scanner;
public class CardTrickICE1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
//	Card luckyCard = new Card(7, "Hearts");
        Card[] magicHand = new Card[7]; //Array of object
        System.out.println("THE HAND IS: ");
        
        for( int i = 0; i<magicHand.length; i++)
        {
            Card c1 = new Card();
            c1.setValue((int)(Math.random()*13));//use a method to generate random *13
            c1.setSuits(Card.SUITS[(int)(Math.random()*4)]);//random method suit 
            magicHand[i] = c1;
            System.out.println(magicHand[i].getValue()+" of "+ magicHand[i].getSuits());
        }
        //step 2:take input 
        Scanner kb = new Scanner(System.in);
        System.out.println("Please choose the value (1 to 13)");
        int number = kb.nextInt();
        kb.nextLine();
        
        System.out.println("Please choose the suit: \n 1: Hearts \n 2: Diamonds \n 3: Spades \n 4: Clubs");
        String s = kb.nextLine();
        
        //step 3: match with array 
//        int value = c1.getValue();
//        String suits = c1.getSuits();
        
        for(Card magicHand1: magicHand)
        {
            if(magicHand1.getValue() == number && magicHand1.getSuits().equalsIgnoreCase(s))
            {
                System.out.println("Match");
                return;
            }
        }
        System.out.println("Sorry, no match.");
    }
}
