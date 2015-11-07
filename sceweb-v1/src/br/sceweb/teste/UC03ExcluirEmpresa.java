package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.dominio.Empresa;
import br.fatec.persistencia.EmpresaDAO;


public class UC03ExcluirEmpresa {
	public static EmpresaDAO empresaDAO;
	public static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		//89.424.232/0001-80
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("12121212");
		empresa.setResponsavel("jose silva");
		empresa.setTelefoneResponsavel("121212");
		empresa.setSetor("contabilidade");
		empresa.setEmail("jsilva@gmail.com");
		empresaDAO.adicionar(empresa);
	}
	@Test
	public void test() {
		assertEquals (1,empresaDAO.excluir("89424232000180"));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
