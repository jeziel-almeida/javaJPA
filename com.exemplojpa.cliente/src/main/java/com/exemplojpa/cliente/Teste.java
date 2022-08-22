package com.exemplojpa.cliente;

import com.exemplojpa.cliente.model.Cliente;

public class Teste {
	
	public static void main(String[] args) {
		
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = dao.obterCliente(2);
		System.out.println(cliente);
		
//		Cliente amazon = new Cliente("Amazon");
//		dao.inserirCliente(amazon);
		
//		Cliente amazon = new Cliente();
//		amazon.setId(6);
//		amazon.setNome("AMAZON");
//		dao.atualizarCliente(amazon);
		
		dao.removerCliente(6);
	}

}
