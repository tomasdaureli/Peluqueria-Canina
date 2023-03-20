package persistencia;

import logica.Duenio;
import logica.Mascota;

public class ControladorPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        
        // Creamos los objetos en la BD
        duenioJpa.create(duenio);
        mascoJpa.create(mascota);

    }
    
    
}
