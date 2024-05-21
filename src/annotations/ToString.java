package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//les annotations pouront êtres utilisées lors de l'éxecution
@Target(ElementType.FIELD)//concerne un attribut de la classe
public @interface ToString {
	//permet de paramètrer l'affichage par l'annotation @toString()
	boolean uppercase() default false;//minuscule par defaut(upperCase()=false)
	String separator() default "->";//separateur initialisé à un espace par defaut 
	
}