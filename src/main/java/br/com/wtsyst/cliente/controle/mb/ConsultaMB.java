package br.com.wtsyst.cliente.controle.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.wtsyst.cliente.bean.Aluno;
import br.com.wtsyst.cliente.controle.ConsultaWS;

@ManagedBean(name = "ConsultaMB")
public class ConsultaMB {

	private Aluno bean;
	private List<Aluno> alunos;
	
	public ConsultaMB() {
		this.bean = new Aluno();
		this.alunos = new ArrayList<Aluno>();
	}
	
	public Aluno getBean() {
		return bean;
	}
	public void setBean(Aluno bean) {
		this.bean = bean;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}



	public void consultar() {
		ConsultaWS cws = new ConsultaWS();
		this.alunos = cws.select();
		
	}
	
	public void cadastrar() {
		ConsultaWS cws = new ConsultaWS();
		cws.cadastrarAluno(this.bean);
		
	}
}
