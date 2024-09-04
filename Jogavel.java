package br.com.fiap.jogatina.model;

public interface Jogavel<E> {
	//seleciona a classe, refactor e extract interface

	public E comprar();

	public E[] distribuir(int qtd);

	void embaralhar();

}