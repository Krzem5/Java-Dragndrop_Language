package com.krzem.dragndrop_language;



import java.awt.Graphics2D;
import java.lang.Math;



public class Block extends Constants{
	public Main cls;
	public EditorView ev;
	public Vector pos;
	public Vector size;



	public Block(Main cls,EditorView ev){
		this.cls=cls;
		this.ev=ev;
		this.pos=new Vector(0,0);
		this.size=new Vector(BLOCK_MIN_WIDTH,BLOCK_MIN_HEIGHT);
	}



	public void update(){
		this.size.x=Math.max(this.size.x,BLOCK_MIN_WIDTH);
		this.size.y=Math.max(this.size.y,BLOCK_MIN_HEIGHT);
	}



	public void draw(Graphics2D g){
		g.setColor(BLOCK_COLOR);
		g.fillRect(this.pos.x,this.pos.y,this.size.x,this.size.y);
		g.setColor(BLOCK_BORDER_COLOR);
		g.fillRect(this.pos.x,this.pos.y,this.size.x,this.size.y);
	}
}