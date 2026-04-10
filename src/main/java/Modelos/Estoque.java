package Modelos;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private List<Carro> carros = new ArrayList<Carro>();

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    public void listarCarros(){
        for (Carro c : carros){
            System.out.println(c);
        }
    }

    public void removerCarroPorPlaca(String placa){
        carros.removeIf(c -> c.getPlaca().equals(placa));
    }
}
