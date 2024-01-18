package atividade1piuc05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocadoraApp {

    public static void main(String[] args) throws ParseException {
        // Criando um novo cliente
        Cliente cliente = new Cliente(1,"João","900.100.200-30","","Rua das Flores, 123","20/10/1985","51-99995-9999","teste@gmail.com");
        

        // Criando um novo produto
        Produto produto = new Produto(1, "Cadeira", 10, "Material ferro cor branca", 5.00);
        

        // Criando um novo orçamento
        Date dataOperacao = new Date();
        Date dataEvento = new SimpleDateFormat("dd/MM/yyyy").parse("26/11/2023");
        Orcamento orcamento = new Orcamento(1, new Date(), new SimpleDateFormat("dd/MM/yyyy").parse("26/11/2023"), 100.00, 150.00, 50.00, "Material deve ser deixado embaixo do toldo", cliente.getIdCliente());
        
        // Adicionando o produto ao orçamento
        ItensOrcamento item = new ItensOrcamento(1, produto.getQuantidadeProduto(), produto, orcamento);
        

        // Calculando o subtotal e o total do orçamento
        double subtotal = calcularSubtotal(item);
        double total = calcularTotal(subtotal, orcamento);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("O valor dos produtos locados no dia: " + dateFormat.format(dataOperacao) + " para o evento que ocorrerá no dia: " + dateFormat.format(dataEvento) + " é de: R$" + subtotal);
        System.out.println("O valor total do Pedido no dia: " + dateFormat.format(dataOperacao) + " para o evento que ocorrerá no dia: " + dateFormat.format(dataEvento) + " é de: R$" + total);
    }
         public static double calcularSubtotal(ItensOrcamento item) {
        return item.getQuantidadeItensOrcamento() * item.getProduto().getValorUnitarioProduto();
    }
         public static double calcularTotal(double subtotal, Orcamento orcamento) {
        return subtotal + orcamento.getFrete() + orcamento.getTaxaDomingoFeriado() - orcamento.getDesconto();
    }
    
    
}