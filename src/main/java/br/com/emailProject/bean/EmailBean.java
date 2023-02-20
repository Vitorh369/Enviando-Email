package br.com.emailProject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailProject.dto.EmailLayout;
import br.com.emailProject.model.Email;
import br.com.emailProject.service.EmailService;

@Named
@RequestScoped
public class EmailBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String DESTINATATIO ="tadeu@gmail13.com";
	private static final String ASSUNTO ="mudança de no setor";

	@Inject
	private EmailService emailService;
	
	public String enviarEmail() {
		emailService.enviar(montaEmail());
		return null;
	}
	
	private Email montaEmail() {
		EmailLayout layout = new EmailLayout();
//		return layout.montarEmailAdm(DESTINATATIO, ASSUNTO);
		return layout.montarSecretario(DESTINATATIO, ASSUNTO);
	}
	
}
