package com.example.floatingactionbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionsMenu;;

public class ActividadPrincipal extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionsMenu morph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        morph = (FloatingActionsMenu) findViewById(R.id.menu_fab);

        View uno, dos, tres, cuatro;
        uno = findViewById(R.id.accion_favorito);
        dos = findViewById(R.id.accion_buscar);
        tres = findViewById(R.id.accion_carrito);

        morph.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.menu_fab){
            morph.setEnabled(true);
        }
    }

}
