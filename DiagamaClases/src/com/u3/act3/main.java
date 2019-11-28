package com.u3.act3;

import java.util.*;

public class main {
    public static void main(String[] args) {


        Collection<Car> listaDeCarros = new HashSet<>();
        listaDeCarros.add(new Car("Toyota", "Camri", "SJC2456X", 100, 60));
        listaDeCarros.add(new Car("Toyota", "RAV4", "SJG9523B", 100, 50));
        listaDeCarros.add(new Car("Nissan", "March", "SJB7412B", 100, 50));
        listaDeCarros.add(new Car("Susuki", "Vitara", "SJJB312C", 300, 150));
        listaDeCarros.add(new Car("Honda", "HR-V", "SJB4875N", 100, 60));
        listaDeCarros.add(new Car("Honda", "Civic", "SJD73269C", 120, 70));
        listaDeCarros.add(new Car("Honda", "CR-V", "SJL5169J", 120, 70));
        listaDeCarros.add(new Car("Honda", "Odyssey", "SJB3468E", 200, 150));
        listaDeCarros.add(new Car("Subaru", "WRX", "SJB8234L", 300, 200));
        listaDeCarros.add(new Car("Subaru", "Imprezza", "SJE8234K", 150, 80));
        Scanner input = new Scanner(System.in);
        System.out.print("Digita el modelo de coche que deseas rentar: ");
        String model = input.nextLine();

        for (Car s : listaDeCarros) {
            if (model.equals(s.getModelo())) {
                System.out.println("El modelo " + model + " esta disponible");
                System.out.print("Cuantos dìas planea rentar?: ");
                int dias = input.nextInt();
                System.out.println("*************** Detalles *****************");
                int costo = (dias * s.getTarifa()) + s.getDeposito();
                System.out.println("Deposito  TarifaDiaria  Duracion  CostoTotal");
                System.out.println(s.getDeposito() + "       " + s.getTarifa() + "            " + dias + "        " + costo);
                System.out.print("Proceder a la renta?( s/n ): ");
                String dec = input.next();
                if (dec.equals("s")) {
                    System.out.println("Nombre del cliente: ");
                    String name = input.next();
                    System.out.println("Numero de IC: ");
                    int num = input.nextInt();
                    System.out.println("************ Recibo *************");
                    System.out.println("Nombre   ICNo   Carro  RegNo Duracion   Costo");
                    System.out.println(name + "   " + num + "   " + model
                            + "   " + s.getPlacas() + "   " + dias + "   " + costo);
                    System.out.println("Sirviendo Cliente Siguiente ");
                } else if (dec.equals("n")) {
                    System.out.println("Sirviendo Cliente Siguiente ");
                }
            }
        }

        Collection<Cliente> cliente = new HashSet<>();

        for (Cliente c  : cliente) {


        }
    }
}
