package br.com.M7Entrega;

/** 
 * Descrição da academia de bairro
 * Autor: Gustavo Dias
 * 	 * @param args
 */
public class AcademiaDeBairro {
	
	
	//propriedades do carro
	private String endereco;
	private String aparelhoPeito;
	private String aparelhoCosta;
	private String aparelhoPerna;
	private int quanditadeDeAparelhos;
	
	
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAparelhoPeito() {
		return aparelhoPeito;
	}

	public void setAparelhoPeito(String aparelhoPeito) {
		this.aparelhoPeito = aparelhoPeito;
	}

	public String getAparelhoCosta() {
		return aparelhoCosta;
	}

	public void setAparelhoCosta(String aparelhoCosta) {
		this.aparelhoCosta = aparelhoCosta;
	}

	public String getAparelhoPerna() {
		return aparelhoPerna;
	}

	public void setAparelhoPerna(String aparelhoPerna) {
		this.aparelhoPerna = aparelhoPerna;
	}

	public int getQuanditadeDeAparelhos() {
		return quanditadeDeAparelhos;
	}

	public void setQuanditadeDeAparelhos(int quanditadeDeAparelhos) {
		this.quanditadeDeAparelhos = quanditadeDeAparelhos;
	}


	
	

	 public static void main(String[] args) {
		 //criando nova academia
		 AcademiaDeBairro novaAcademia = new AcademiaDeBairro();
		 
		 novaAcademia.setEndereco("Rua ABC");
		 novaAcademia.setAparelhoPeito("Supino");
		 novaAcademia.setAparelhoCosta("Remada");
		 novaAcademia.setAparelhoPerna("Agachamento");
		 novaAcademia.setQuanditadeDeAparelhos(3);
		 
		 System.out.println("O Endereço da academia é: "  + novaAcademia.getEndereco() );
		 System.out.println("O aparelho de Peito é: "  + novaAcademia.getAparelhoPeito() );
		 System.out.println("O aparelho de Costa é: "  + novaAcademia.getAparelhoCosta() );
		 System.out.println("O aparelho de Perna é: "  + novaAcademia.getAparelhoPerna() );
		 System.out.println("A quantidade de aparelhos é "  + novaAcademia.getQuanditadeDeAparelhos() );
		 
		 
	 }


}
