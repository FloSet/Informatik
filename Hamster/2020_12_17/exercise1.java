import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class exercise1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    int steps = 0;
	while(vornFrei()){
        vor();
        steps++;
    }
    linksDrehen(steps);
}

void linksDrehen (int count){
    while(count>0){
    	linksUm();
    	count--;
    }
}}