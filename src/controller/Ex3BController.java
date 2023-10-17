package controller;

import model.Lista;

public class Ex3BController {

	public Ex3BController() {
		super();
	}
	public void carregaLista() throws Exception {
		Lista<Integer> ListaL = new Lista<Integer>();
			ListaL.addFirst(3);
			ListaL.addLast(5);
			ListaL.addLast(8);
			ListaL.addLast(12);
			ListaL.addLast(9);
			ListaL.addLast(7);
			ListaL.addLast(6);
			ListaL.addLast(2);
			ListaL.addLast(3);
			ListaL.addLast(7);
			ListaL.addLast(16);
		int maior1 = 0;
		int Maior2 = 0;
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 11; j++) {
				if(i<1) {
					maior1 = ListaL.get(i);
					Maior2 = ListaL.get(i);
				}
				else if(j>=1 && maior1 < ListaL.get(j)) {
					maior1 = ListaL.get(j);
				}
				else if(ListaL.get(j)>Maior2 && ListaL.get(j) != maior1) {
					Maior2 = ListaL.get(i);
				}
		}
		}
	System.out.println("primeiro maior valor: "+maior1+"\nsegundo maior valor: "+Maior2);
	//return Maior2;
	
	
}
}
