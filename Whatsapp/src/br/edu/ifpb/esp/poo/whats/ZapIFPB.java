package br.edu.ifpb.esp.poo.whats;
import java.util.ArrayList;

import Contato;

public class ZapIFPB {
	private String destinatario;
	private String mensagem;
	private ArrayList<String> contatosComMensagensNaoLidas;
	ArrayList<String> mensagensNaoLidas;
	ArrayList<String> mensagens;
	ArrayList<Contato> usuarios = new ArrayList<Contato>();

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ArrayList<String> getContatosComMensagensNaoLidas() {
		return contatosComMensagensNaoLidas;
	}

	public void setContatosComMensagensNaoLidas(ArrayList<String> contatosComMensagensNaoLidas) {
		this.contatosComMensagensNaoLidas = contatosComMensagensNaoLidas;
	}

	public ArrayList<String> getMensagensNaoLidas() {
		return mensagensNaoLidas;
	}

	public void setMensagensNaoLidas(ArrayList<String> mensagensNaoLidas) {
		this.mensagensNaoLidas = mensagensNaoLidas;
	}

	public ArrayList<String> getMensagens() {
		return mensagens;
	}

	public void setMensagens(ArrayList<String> mensagens) {
		this.mensagens = mensagens;
	}

	public boolean cadastrarUsuario(String nomeUsuario, String senha) {

		Contato c = new Contato();
		c.setUsuario(nomeUsuario);
		c.setSenha(senha);

		for (int i = 0; i < usuarios.size(); i++) {
			if (nomeUsuario.equals(usuarios.get(i).getUsuario())) {
				return false;
			}
		}
		usuarios.add(c);
		return true;
	}

	public boolean autenticar(String nomeUsuario, String senha) {
		Contato c = new Contato();
		c.setUsuario(nomeUsuario);
		c.setSenha(senha);
		for (int i = 0; i < usuarios.size(); i++) {
			if (nomeUsuario.equals(usuarios.get(i).getUsuario()) && senha.equals(usuarios.get(i).getSenha())) {
				return true;
			}
		}
		return false;
	}

	public boolean enviarMensagem(String destinatario, String mensagem) {
		

	}

	public ArrayList<String> contatosComMensagensNaoLidas() {

	}

	public ArrayList<String> mensagensNaoLidas(String contato) {

	}

	public ArrayList<String> mensagens(String contato) {

	}

}
