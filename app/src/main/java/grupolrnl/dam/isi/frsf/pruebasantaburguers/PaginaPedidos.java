package grupolrnl.dam.isi.frsf.pruebasantaburguers;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.Frame.Configuracion;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.Frame.Lista_Comida;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.Frame.Pedidos;


public class PaginaPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_pedidos);

        BottomNavigationView bottonBar = (BottomNavigationView) findViewById(R.id.bn_barra_navegacion);

        bottonBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @TargetApi(Build.VERSION_CODES.O)
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.it_configuracion:

                        Configuracion c = new Configuracion();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame,c).commit();

                        break;
                    case R.id.it_lista_pedido:

                        Lista_Comida lc = new Lista_Comida();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame,lc).commit();
                        break;
                    case R.id.it_pedido:

                        Pedidos p = new Pedidos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_frame,p).commit();
                        break;
                }
                return false;
            }
        });
    }
}
