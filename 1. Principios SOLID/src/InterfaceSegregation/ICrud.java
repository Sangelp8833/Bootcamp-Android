package InterfaceSegregation;

public interface ICrud<T> {

     void save(T t);
     void delete(T t);
     void FindByID(Integer id);
     void Update(T t);

}
