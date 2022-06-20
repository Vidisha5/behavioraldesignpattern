
public abstract class Game {

	public abstract void  begin(); 
	
	public abstract void  play();
	
	public abstract void  end();
	
	public final void sequence() {
		begin(); 
		play();
		end();
	}
	
}
