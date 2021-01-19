import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Uebung1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    int laengeGang = 1;
    while(vornFrei()){
        vor();
        laengeGang++;
    }

    linksUm();
    linksUm();
    
    while(vornFrei()){
        vor();
    }

    linksUm();
    linksUm();

    int[] korn = new int[laengeGang];

    for(int i=0; i<laengeGang-1; i++){
        korn[i]=zaehleKoerner();
        vor();
    }

    korn[korn.length - 1] = zaehleKoerner();

    for (int i = 0; i < laengeGang; i++){
        schreib("Feld:" + (i+1) + ":" + korn[i] + "Körner.");
    }
}

int zaehleKoerner(){
    int anzK = 0;

    while (kornDa()){
        nimm();
        anzK++;
    }

    for (int i = 1; i <= anzK; i++)
        gib();

    return anzK;
}}