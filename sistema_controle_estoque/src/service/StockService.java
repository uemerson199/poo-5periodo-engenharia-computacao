package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class StockService {

    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(int id){
        id--;
        productList.remove(id);
    }

    public void updatedPrice(double valor, int id){
        double novoValor = 0.0;
        for (int i = 0; i < productList.size(); i++){
            if(productList.get(i).getId() == id){
                novoValor =  valor;
                productList.get(i).setPrice(novoValor);
            }
        }
    }

    public void lisProducts(){
        Product product;
        for(int i = 0; i < productList.size(); i++){
            product = productList.get(i);
            System.out.println("Id do Produto: " + product.getId()+ ", " + "Nome do Produto: " + product.getName() + ", Valor do Produto: " + product.getPrice());
        }
    }

}
