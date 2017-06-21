/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.Random;

/**
 *
 * @author ycf
 */
public class Food {
	public int x = 0;
	public int y = 0;
	Food(){
	Random r = new Random();
	this.x = r.nextInt(Yard.W);
	this.y = r.nextInt(Yard.H);
	}
}
