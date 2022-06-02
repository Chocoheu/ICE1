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

import java.util.Random;
import java.util.Scanner;
public class CardTrickICE1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
	Card luckyCard = new Card(7, "Hearts");
        Card[] magicHand = new Card[7]; //Array of object
        
        Random random = new Random();	
	int x;
        
        Card c1 = new Card();
        
        for( int i=0;i<magicHand.length;i++)
        {
            x = random.nextInt(13)+1;
            c1.setValue(x);//use a method to generate random *13
            c1.setSuits(Card.SUITS[new Random().nextInt(Card.SUITS.length)]);//random method suit 
            System.out.print(x + " of ");
            System.out.println( Card.SUITS[new Random().nextInt(Card.SUITS.length)]);
        }
        //step 2:take input 
        System.out.println("Please choose the suit: \n 1: Hearts \n 2: Diamonds \n 3: Spades \n 4: Clubs");
        Scanner kb = new Scanner(System.in);
        int cardSuit = kb.nextInt();
        System.out.println("Please choose the value (1 to 13)");
        int cardNumber = kb.nextInt();
        
        //step 3: match with array 
//        int value = c1.getValue();
//        String suits = c1.getSuits();
        
        if(c1.getValue() == cardNumber)
        {
            System.out.println("Match.");
        }else
        {
            System.out.println("Sorry, no match.");
        }
    }
}
