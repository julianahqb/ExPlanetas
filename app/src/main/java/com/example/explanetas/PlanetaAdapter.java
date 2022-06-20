package com.example.explanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas) {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int i) {
        return planetas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(context)
                .inflate(R.layout.adapter_planeta, viewGroup,false);
        TextView texto = (TextView) v.findViewById(R.id.txtPlaneta);
        ImageView img = (ImageView) v.findViewById(R.id.imgPlaneta);

        Planeta planeta = planetas.get(i);
        texto.setText(planeta.nome);
        img.setImageResource(planeta.img);

        return v;
    }
}
