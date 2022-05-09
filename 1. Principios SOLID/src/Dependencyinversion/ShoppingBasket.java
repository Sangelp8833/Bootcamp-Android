package Dependencyinversion;

public class ShoppingBasket {

    public ShoppingBasket(){

    }

    public void Buy(Shopping shopping){
        SqlDataBase sqlDataBase = new SqlDataBase();
        sqlDataBase.save(shopping);
        CreditMethod creditMethod = new CreditMethod();
        creditMethod.pay(shopping);                     // Hasta este momento estamos incumpliendo con el principio
                                                        // Ya que la clase ShoppingBasket Depende de Clases de bajo nivel .
                                                        // Depende de concreciones.
                                                        // debería depender de abstracciones.
    }

    // Para solucionar este problema lo que podemos hacer es implementar abstracciones (interfaces)
    // interfaces que alberguen los contratos.
    // pasarle las dependencias por constructor, y no instanciarlas.

}

