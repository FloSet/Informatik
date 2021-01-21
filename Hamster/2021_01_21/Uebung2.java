import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Uebung2 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main(){
    int[] a = {1, 7, 4, 9, 6};
    schreib("vorher ...");
    ausgabeListe(a);
    a = rotiereRechts(a);
    schreib ("nachher ...");
    ausgabeListe(a);
}

void listeNullen(int[] a){
    for(int i = 0; i<a.length; i++){
        a[i] = 0;
    }
}

void listeVerdoppeln(int[] a){
    for(int i = 0; i<a.length; i++){
        a[i] = a[i] * 2;
    }
}

void ListeMultiplizierenMit(int[] a, int multiplier){
    for(int i = 0; i<a.length; i++){
        a[i] = a[i] * multiplier;
    }
}

int listeSumme(int[] a){
    int sum = 0;
    for(int i = 0; i<a.length; i++){
        sum += a[i];
    }
    return sum;
}

boolean existiertInListe(int[] a, int searched){
    boolean exists = false;
    for(int i = 0; i<a.length; i++){
        if(a[i] == searched){
            exists = true;
            i = a.length;
        }
    }
    return exists;
}

int[] rotiereRechts(int[] a){
    int[] b = new int[a.length];
   	for(int i = 0; i <= a.length-1;i++){
   		b[(i+1) % a.length] = a[i];
	} 
	return b;
}

void ausgabeListe (int[] a){
    for(int i = 0; i<a.length; i++){
        schreib(a[i] + "");
    }
}}