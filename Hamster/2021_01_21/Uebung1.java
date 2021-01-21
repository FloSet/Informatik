import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Uebung1 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main(){
    int a, b, c;
    a=5;
    b=10;
    c = a+b;

    schreib(a + ", " + b + ", " + c);
    b = a;
    a++;
    c = b;
    schreib(a + ", " + b + ", " + c);
    int[] i, k;
    i = new int[2];
    i[0] = 8; i[1] = 9;
    k = i;
    k[1] = 3;
    schreib(i[0] + ", " + i[1]);
    k[0] = 4;
    schreib(" " + i[0]);
    schreib(" " + k[1]);
}}