package jsfolamundo.entidades.dao;

import java.util.List;

public interface CrudDao<G> {
	public void salvar(G objeto);
	public void atualizar(G objeto);
	public void excluir(Long id);
	public G consultar(Long id);
	public List<G> listar();

}
