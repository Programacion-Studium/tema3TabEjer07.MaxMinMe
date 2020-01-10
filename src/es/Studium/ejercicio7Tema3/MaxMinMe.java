package es.Studium.ejercicio7Tema3;

import java.util.Scanner;

public class MaxMinMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[] = new int[10];
		int i, valorMax=0,valorMin,media=0;
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<tabla.length;i++)
		{
			System.out.println("Ingrese el " +(i+1)+" Valor:");
			tabla[i] = teclado.nextInt();
		}
		valorMin=tabla[0];
		for (i=0;i<tabla.length;i++)
		{
			if(valorMax<tabla[i])
			{
				valorMax=tabla[i];
			}
			if(valorMin>tabla[i])
			{
				valorMin=tabla[i];
			}
			media=media+tabla[i];
		}
		teclado.close();
		media=media/tabla.length;
		System.out.println("El maximo es "+valorMax);
		System.out.println("El minimo es "+valorMin);
		System.out.println("La media es "+media);
	}

}
