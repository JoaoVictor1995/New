package br.sceweb.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sceweb.teste.*;

@RunWith(Suite.class)
@SuiteClasses({ UC01CadastrarEmpresa.class, UC03ExcluirEmpresa.class })
public class TesteDeRegressao {

}
