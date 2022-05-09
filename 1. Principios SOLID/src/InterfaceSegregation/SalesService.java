package InterfaceSegregation;

public class SalesService implements ICrud{

    // Resulta que para la entidad Service no se pueden eliminar ni editar facturas que ya han sido emitidas.
    // En este caso los métodos delete y Update, no van a ser necesarios por lo cual podrían retornar un error.
    // Para solucionar este problema, podemos segregar nuestra interface ICrud, en dos interfaces, una que contenga los metodos SAVE Y FIND
    // y otra interface que contenga los métodos DELETE y UPDATE.
    // Al final lo que nos importa es que si se implementa una interface todos sus métodos se deben de usar. (Similar al principio Liskov)

    @Override
    public void save(Object o) {
        // Guardar Factura
    }

    @Override
    public void delete(Object o) {
        // Error
    }

    @Override
    public void FindByID(Integer id) {
        // Encontrar Factura por el ID
    }

    @Override
    public void Update(Object o) {
        // Error
    }
}
