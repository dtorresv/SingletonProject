package main;

public class Singleton {
    private static Singleton singleton = null;
    private String s;

    // Constructor declarado privado para solo poder ser accedido por el metodo getInstance()
    private Singleton()
    {
        s = "Atributo de la clase singlenton";
    }

    //Metodo mediante el cual se contruye la clase
    //Se declara estatico para que pueda ser accedido desde cualquier parte del codigo
    public static Singleton getInstance()
    {
       if (singleton == null)//Condicion clave que valida que solo se cree una instancia de la clase
            singleton = new Singleton();
        return singleton;
    }
}

