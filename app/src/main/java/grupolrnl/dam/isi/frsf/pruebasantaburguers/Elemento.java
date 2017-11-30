package grupolrnl.dam.isi.frsf.pruebasantaburguers;

import android.widget.ImageView;


public class Elemento {


   // private Elemento ListaLomitos[];

    private double precio;
    private String nombre;
    private Tipo_Hamburguesa tipoHamburguesa;
    private int id_hamburguesa;
    private ImageView imagen;
    private boolean desplegado;

    private Elemento(int i, String s, Tipo_Hamburguesa t, int id, boolean desp) {

        this.precio = i;
        this.nombre = s;
        this.tipoHamburguesa = t;
        this.id_hamburguesa = id;
        this.desplegado = desp;


    }

    boolean getDesplegado(){

        return  this.desplegado;
    }
    void setDesplegado(boolean b){

        this.desplegado = b;
    }

    public static final Elemento[] ELEMENTOS = new Elemento[]{

        new Elemento(100,"Santa Monica", Tipo_Hamburguesa.SIMPLE,0,false),
        new Elemento(130,"Santa Monica", Tipo_Hamburguesa.DOBLE,1,false),
        new Elemento(100,"Santa Catalina", Tipo_Hamburguesa.SIMPLE,2,false),
        new Elemento(130,"Santa Catalina", Tipo_Hamburguesa.DOBLE,3,false),
        new Elemento(100,"SB", Tipo_Hamburguesa.SIMPLE,4,false),
        new Elemento(130,"SB", Tipo_Hamburguesa.DOBLE,5,false),
        new Elemento(100,"Clasica", Tipo_Hamburguesa.SIMPLE,6,false),
        new Elemento(130,"Clasica", Tipo_Hamburguesa.DOBLE,7,false)

    };

}
