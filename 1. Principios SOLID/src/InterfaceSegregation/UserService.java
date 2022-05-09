package InterfaceSegregation;

public class UserService implements ICrud {

    @Override
    public void save(Object o) {
        // Guardar un nuevo usuario en la base de datos
    }

    @Override
    public void delete(Object o) {
        // Borrar un usuario de la base de datos
    }

    @Override
    public void FindByID(Integer id) {
        // Encontrar Usuario por el ID en la base de datos
    }

    @Override
    public void Update(Object o) {
        // Actualizar los datos de un usuario en la base de datos
    }
}
