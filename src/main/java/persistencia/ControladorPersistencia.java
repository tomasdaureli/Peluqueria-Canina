package persistencia;

import java.util.List;

import logica.Duenio;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        
        // Creamos los objetos en la BD
        duenioJpa.create(duenio);
        mascoJpa.create(mascota);

    }

    public List<Mascota> traerMascotas() {
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) throws NonexistentEntityException {
        mascoJpa.destroy(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
