package calculadoraSalario;

public class Funcionario {
	
	String nome, email;
	double salarioBase, salarioLiquido;
	Cargo cargo;
	
	double desconto10 = 0.9;
	double desconto15 = 0.85;
	double desconto20 = 0.8;
	double desconto25 = 0.75;
	double desconto30 = 0.7;
	
	public Funcionario(String nome, String email, double salarioBase, Cargo cargo) {
		
		this.nome = nome;
		this.email = email;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		
		calculaDesconto();
	}
	
	public void calculaDesconto() {
		
		switch (cargo) {
	
			case DESENVOLVEDOR:
				if(salarioBase >= 3000) {
					salarioLiquido = salarioBase * desconto20;
				}else{
					if(salarioBase != 0) {
						salarioLiquido = salarioBase * desconto10;
					}else {
						salarioLiquido = salarioBase;
					}
				}
				
				break;
			case DBA:
				if(salarioBase >= 2000) {
					salarioLiquido = salarioBase * desconto25;
				}else {
					if(salarioBase != 0) {
						salarioLiquido = salarioBase * desconto15;
					}else {
						salarioLiquido = salarioBase;
					}
				}
				
				break;
				
			case TESTADOR:
				if(salarioBase >= 2000) {
					salarioLiquido = salarioBase * desconto25;
				}else {
					if(salarioBase != 0) {
						salarioLiquido = salarioBase * desconto15;
					}else {
						salarioLiquido = salarioBase;
					}
				}
				
				break;
				
			case GERENTE:
				if(salarioBase >= 5000) {
					salarioLiquido = salarioBase * desconto30;
				}else {
					if(salarioBase != 0) {
						salarioLiquido = salarioBase * desconto20;
					}else {
						salarioLiquido = salarioBase;
					}
				}
				
				break;
				
			default:
				salarioLiquido = salarioBase;
		}

	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
		calculaDesconto();
	}
	

}
