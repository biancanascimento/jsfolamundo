package jsfolamundo.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import jsfolamundo.entidades.Contato;
import jsfolamundo.entidades.dao.ContatoDao;

@ManagedBean
public class ContatoBean {
	private Contato contato = new Contato();
	private ContatoDao contatoDao = new ContatoDao();
	private List<Contato> listaDeContatos = contatoDao.listar();

	public String salvar() {
		try {
			contatoDao.salvar(this.getContato());
			System.out.println("\n\nContato Salvo: ");
			System.out.println(this.contato.getNome());
			System.out.println(this.contato.getApelido());
			System.out.println(this.contato.getWhattsApp());
		} catch (Exception e) {
			e.printStackTrace();
			return "pagina_erro.jsf";
		}
		return null;
	}

	private String atualizar() {
		try {
			Contato c = contatoDao.consultar(this.getContato().getId());
			if (c == null)
				return "pagina_erro.jsf";
			contatoDao.atualizar(this.getContato());
			System.out.println("\n\nContato alterado: ");
			System.out.println(this.contato.getNome());
			System.out.println(this.contato.getApelido());
			System.out.println(this.contato.getWhattsApp());

		} catch (Exception e) {
			e.printStackTrace();
			return "pagina_erro.jsf";
		}
		return null;

	}

	public String remover() {
		try {
			Contato c = contatoDao.consultar(this.getContato().getId());
			if (c == null)
				return "pagina_erro.jsf";
			contatoDao.excluir(this.getContato().getId());
			System.out.println("\n\nContato removido");
			System.out.println(this.contato.getNome());
			System.out.println(this.contato.getApelido());
			System.out.println(this.contato.getWhattsApp());

		} catch (Exception e) {
			e.printStackTrace();
			return "pagina_erro.jsf";
		}
		return null;

	}

	public void setContatoDao(ContatoDao contatoDao) {
		this.contatoDao = contatoDao;
	}

	public List<Contato> getListaDeContatos() {
		return listaDeContatos;
	}

	public void setListaDeContatos(List<Contato> listaDeContatos) {
		this.listaDeContatos = listaDeContatos;
	}

	private Contato getContato() {
		return contato;
	}

}
