package com.krzem.dragndrop_language;



import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;



public class EditorView extends Constants{
	public Main cls;
	public List<Block> blocks;



	public EditorView(Main cls){
		this.cls=cls;
		this.blocks=new ArrayList<Block>();
		///////////////////////////////////////////
		this.blocks.add(new Block(this.cls,this));
		this.blocks.get(0).pos=new Vector(500,500);
		///////////////////////////////////////////
	}



	public void update(){
		for (Block b:this.blocks){
			b.update();
		}
	}



	public void draw(Graphics2D g){
		for (Block b:this.blocks){
			b.draw(g);
		}
	}x
}