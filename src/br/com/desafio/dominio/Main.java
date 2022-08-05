package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso em java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso em js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria= new Mentoria()
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria em java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}


