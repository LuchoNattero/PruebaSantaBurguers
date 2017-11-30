package grupolrnl.dam.isi.frsf.pruebasantaburguers.Frame;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.Adaptador;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.Elemento;
import grupolrnl.dam.isi.frsf.pruebasantaburguers.R;


public class Lista_Comida extends Fragment {

    private Adaptador myAdaptador;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.lista_comida,container,false);

        ListView lv_lista_elementos;
        lv_lista_elementos = v.findViewById(R.id.lv_lista_imagen);
        List<Elemento> listaElementos = new LinkedList<>(Arrays.asList(Elemento.ELEMENTOS));
        myAdaptador = new Adaptador(v.getContext(),listaElementos);
        lv_lista_elementos.setAdapter(myAdaptador);
        registerForContextMenu(lv_lista_elementos);
        // Toast.makeText(this,"anda",Toast.LENGTH_SHORT).show();
        lv_lista_elementos.setClickable(true);

        lv_lista_elementos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Elemento item = (Elemento) adapterView.getItemAtPosition(i);
                //Toast.makeText(PaginaPedidos.this,"anda",Toast.LENGTH_SHORT).show();
              //  myAdaptador.expandir(i,view);
                myAdaptador.notifyDataSetChanged();
            }

        });


        return v;
    }




}
