package grupolrnl.dam.isi.frsf.pruebasantaburguers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.List;


public class Adaptador extends BaseAdapter {


    private Context contexto;
    private List<Elemento> lista_Hamburguesas;
    private ViewHolder holder;

    public Adaptador(Context c, List<Elemento> lista) {

        this.contexto = c;
        this.lista_Hamburguesas = lista;
    }

    public void expandir(int posicion,View view){

        holder = (ViewHolder) view.getTag();

        Elemento elemento = getItem(posicion);

/*        if (elemento.getDesplegado()) {


            holder.img.setVisibility(View.GONE);
            holder.sp_cantidad.setVisibility(View.GONE);
            holder.a_carrito.setVisibility(View.GONE);
            holder.volver.setVisibility(View.GONE);
            holder.tx_cantidad.setVisibility(View.GONE);

        } else if (!elemento.getDesplegado()) {

            holder.img.setVisibility(View.VISIBLE);
            holder.sp_cantidad.setVisibility(View.VISIBLE);
            holder.a_carrito.setVisibility(View.VISIBLE);
            holder.volver.setVisibility(View.VISIBLE);
            holder.tx_cantidad.setVisibility(View.VISIBLE);

        }
        elemento.setDesplegado(!elemento.getDesplegado());*/
        //notifyDataSetChanged();
    }

    private class ViewHolder{

        private ImageView img = null;



        ViewHolder(View view) {

            this.img = view.findViewById(R.id.i_imagen_layout);
        }
    }

    @Override
    public int getCount() {
        return lista_Hamburguesas.size();
    }

    @Override
    public Elemento getItem(int i) {
        return lista_Hamburguesas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(contexto).
                    inflate(R.layout.layout_imagenes, viewGroup, false);
        }

        holder = (ViewHolder) view.getTag();

        if (holder == null) {
            holder = new ViewHolder(view);
            holder.img.setImageResource(R.drawable.doble_clasica_1);
            view.setTag(holder);
        }

        return view;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}
