package fr.gatay.cedric.epudi.di4.tp3;
import java.io.Serializable;

public interface IFactorielle extends Serializable{
	
static final String EXC_MSG = 
	 	 	 "L'argument de la fonction" +
	 	 	 " factorielle ne peut �tre n�gatif";

int factorielle(int nb);
}