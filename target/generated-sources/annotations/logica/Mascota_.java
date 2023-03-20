package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Duenio;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-03-20T20:37:39")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Duenio> unDuenio;
    public static volatile SingularAttribute<Mascota, String> atencion_especial;
    public static volatile SingularAttribute<Mascota, Integer> id;
    public static volatile SingularAttribute<Mascota, String> nombre;

}