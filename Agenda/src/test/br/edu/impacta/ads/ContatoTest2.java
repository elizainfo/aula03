package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest2 {

	ContatoDaoArquivo cdao;
	Contato contato;

	@Before
	public void setData(){
		cdao = new ContatoDaoArquivo("contatos.txt");
		contato = new Contato("Renato", "123");
	}

	@Test
	public void testTest() {
		cdao.inserir(contato);
		assertTrue("O contato n√£o foi adicionado.", cdao.existe(contato));
	}
	
	@Test
	public void testTestAltera() {
		List<Contato> listaContatos = cdao.buscar("");
		Assert.assertFalse("Nome n„o localizado", listaContatos.size()>0);
	}
}
