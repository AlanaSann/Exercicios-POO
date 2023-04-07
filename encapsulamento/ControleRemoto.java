package encapsulamento;

public class ControleRemoto implements Controlador{
private int volume;
private boolean ligado;
private boolean tocando;


public ControleRemoto() {
	this.volume = 50;
	this.ligado = false;
	this.tocando = false;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public boolean isLigado() {
	return ligado;
}
public void setLigado(boolean ligado) {
	this.ligado = ligado;
}
public boolean isTocando() {
	return tocando;
}
public void setTocando(boolean tocando) {
	this.tocando = tocando;
}
public boolean getTocando() {
	return tocando;
}

@Override
public void ligar() {
	this.setLigado(true);
	
}
@Override
public void desligar() {
	this.setLigado(false);
	
}
@Override
public void abrirMenu() {
		System.out.println("---- Menu ----");
		System.out.println("Esta ligado? " + this.isLigado());
		System.out.println("Esta tocando? "+this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i < this.getVolume(); i+=10) {
			System.out.print("|");
		}
	
	
}
@Override
public void fecharMenu() {
	System.out.println("Fechando menu");
	
}
@Override
public void maisVolume() {
	if(this.isLigado() == true) {
		this.setVolume(this.getVolume()+5);
	}else {
		System.out.println("Impossivel aumentar volume");
	}
	
}
@Override
public void menosVolume() {
	if(this.isLigado() == true) {
		this.setVolume(this.getVolume()+ 5);
		}
	
}
@Override
public void ligarMudo() {
	if((this.isLigado() == true)  && (this.getVolume() > 0)) {
		this.setVolume(0);
			}else {
				System.out.println("Impossivel ligar mudo");
			}
}
@Override
public void desligarMudo() {
	if((this.isLigado() == true)  && (this.getVolume() == 0)) {
		this.setVolume(50);
	} 
	
}
@Override
public void play() {
	if(this.isLigado() == true && this.getTocando() == false) {
		this.setTocando(true);
			}
	
}
@Override
public void pause() {
	if(this.isLigado() == true && this.getTocando() == true){
		this.setTocando(false);
			}
}


}
