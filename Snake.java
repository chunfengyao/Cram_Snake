/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author ycf
 */
public class Snake {
	static Dir a = Dir.L;
	static Node head = null;
	static Node tail = null;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
	}
	
	void moveto(Dir t)
	{
		addone(t);
		delone(tail);
	}
	
	void atefood(Dir t)
	{
		addone(t);
	}
	
	void addone(Dir t)
	{
		Node p = new Node();
		p.next = head;
		head.befo = p;
		p.befo = null;
		switch(t){
			case U:
				p.x = head.x;
				p.y = head.y-1;
				break;
			case D:
				p.x = head.x;
				p.y = head.y+1;
				break;
			case L:
				p.x = head.x-1;
				p.y = head.y;
				break;
			case R:
				p.x = head.x+1;
				p.y = head.y;
				break;
		}
		head = p;
	}
	void delone(Node tail)
	{
		Node p = tail;
		tail.befo = null;
		tail = p;
		tail.next = null;
	}
	
	Boolean ifgameisover(){
		
		return head.x>Yard.W || head.y>Yard.H || hashit(head); //true means that the game is over!!!
	}
	
	Boolean hashit(Node h)
	{
		Boolean mark;
		mark = false;
		for	(Node p = head ;p != null;p = p.next){
			if (head.x == p.x || head.y == p.y){
				mark = true;//true means that this snake has hit itself!!!
			}
		}
		return mark;
	}
	
	private class Node {
		
		Node next = null;
		Node befo = null;
		int x = 0;
		int y = 0;
		
		
	}
	
}
