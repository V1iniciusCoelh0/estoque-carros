package com.vinicius.estoque;

import java.util.ArrayList;

public class Main{
      void main(){
        ArrayList<Carro> carros = new ArrayList<Carro>(3);
        Carro c1 = new Carro("ford","C3PO-501", 2018);
        carros.add(c1);

        System.out.println(carros);
    }
}