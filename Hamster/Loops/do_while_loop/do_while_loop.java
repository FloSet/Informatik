import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class do_while_loop extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  do{
    vor();
  }while(vornFrei());
  linksUm();
  linksUm();
  do{
    vor();
  }while(vornFrei());
  linksUm();
  linksUm();
}
}