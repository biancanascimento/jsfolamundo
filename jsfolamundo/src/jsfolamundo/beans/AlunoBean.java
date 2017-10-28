package jsfolamundo.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import jsfolamundo.entidades.Aluno;
import jsfolamundo.entidades.dao.AlunoDao;

@ManagedBean
public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	private AlunoDao alunoDao = new AlunoDao();
	private List<Aluno> listaAlunos = alunoDao.listar();
	
	
	public String salvar(){
		
		
		try {
			alunoDao.salvar(this.aluno);
			System.out.println("Aluno salvo com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			return "pagina_erro.jsf";
		}
		return "listar_alunos.jsf";

	}

	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public AlunoDao getAlunoDao() {
		return alunoDao;
	}


	public void setAlunoDao(AlunoDao alunoDao) {
		this.alunoDao = alunoDao;
	}


	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}


	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	
	

}
