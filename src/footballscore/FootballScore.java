/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

import java.util.Scanner;

/**
 *
 * @author theki
 */
public class FootballScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u1 =new User();
        User u2 =new User();
        Manager m1 =new Manager();
	ScoreSource ss = new ScoreSource();              
	ss.addSocreSourceListener(u1);              
	ss.addSocreSourceListener(u2);      
        ss.addSocreSourceListener(m1);
        boolean isExit=false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Score : ");
            String input =sc.nextLine();
            if (input.equals("")){
                isExit=true;
            }else{
                ss.setScoreLine(input);
            }
        }while(!isExit);
    }
    
}
