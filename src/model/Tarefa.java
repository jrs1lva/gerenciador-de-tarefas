package model;

public class Tarefa {
	
	private int id;
	private String titulo;
	private String descricao;
	private boolean concluido;
	
	public Tarefa(int id, String titulo, String descricao, boolean concluido) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluido = concluido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ID: + ", titulo=" + titulo + ", descricao=" + descricao + ", concluido=" + concluido
				+ "]";
	}
	
	
	
}