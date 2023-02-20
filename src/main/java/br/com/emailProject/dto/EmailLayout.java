package br.com.emailProject.dto;

import br.com.emailProject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_LINHA_DUBLA = "<br><br>";
	private static final String QUEBRA_UMA_LINHA = "<br>";
	
	public Email montarEmailAdm(String destinatario, String assunto) {
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("Aos cuidados do ADM")
			.append(QUEBRA_LINHA_DUBLA);
		
		texto
			.append("Solicito alteração senha do sistema!")
			.append(QUEBRA_LINHA_DUBLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
	}
	
	public Email montarSecretario(String destinatario, String assunto) {
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("Aos cuidados do Secretario")
			.append(QUEBRA_LINHA_DUBLA);
		
		texto
			.append("atualização!")
			.append(QUEBRA_LINHA_DUBLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att.:")
				.append(QUEBRA_UMA_LINHA)
				.append("Operador de caixa")
				.append(QUEBRA_LINHA_DUBLA)
				.toString();
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automatico! Por favor não respoder esse email!").toString();
	}
}
