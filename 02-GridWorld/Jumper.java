import info.gridworld.actor.Bug;

public class Jumper extends Bug
{
    public Jumper(){
	super();
    }

    public void move(){
	Grid<Actor> gr = getGrid(); 
	if (gr == null) 
	    return; 
	Location loc = getLocation(); 
	Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	if (gr.isValid(next)) 
	    moveTo(next); 
	else 
	    removeSelfFromGrid(); 
	Flower flower = new Flower(getColor()); 
	flower.putSelfInGrid(gr, loc);  
	    }

    public boolean canMove(){
Grid<Actor> gr = getGrid(); 
 if (gr == null) 
 return false; 
 Location loc = getLocation(); 
Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection()); 
 if (!gr.isValid(next)) 
 return false; 
 Actor neighbor = gr.get(next); 
 return (neighbor == null) || (neighbor instanceof Flower);  
    }
}
