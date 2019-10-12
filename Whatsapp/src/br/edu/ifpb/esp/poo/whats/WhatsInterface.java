package br.edu.ifpb.esp.poo.whats;import java.io.File;
import java.util.ArrayList;

public interface WhatsInterface {

	public void cadastro(int numero, String nomeDeUsuario, String senha);
	public void autentica(String nomeDeUsuario, String senha);
	public void enviaMensagem (String mensagem, int contato);
	public void recebeMensagem (String mensagem, int contato);
	public void criarGrupos (ArrayList contatos);
	public void enviarMidia (File file);
	
}
