import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class exercise2 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	boolean Run = true;
	while(Run){
		while(vornFrei()){
    		vor();
    		while(kornDa()){
    			nimm();
    		}
    	}
    	Run = hoch();
	}
}

boolean hoch(){
	linksUm();
	if(vornFrei()){
		vor();
		rechtsUm();
			for(int i = 0; i<3; i++){
				if(vornFrei()){
					i=9999;
					return true;
				}
				else{
					linksUm();
				}
			}
			return false;
		
	}
	else{
		while(!maulLeer()){
    		gib();
    	}
    	return false;
	}
}

void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}}