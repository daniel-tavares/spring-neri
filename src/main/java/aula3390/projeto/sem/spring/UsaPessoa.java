package aula3390.projeto.sem.spring;

import javax.swing.JOptionPane;

public class UsaPessoa {

	public static void main(String[] args) {
		BeanPessoa beanPessoa = new BeanPessoa();
		beanPessoa.setNome("Daniel Freitas ");

		JOptionPane.showMessageDialog(null, beanPessoa.getNome());
	}
}
