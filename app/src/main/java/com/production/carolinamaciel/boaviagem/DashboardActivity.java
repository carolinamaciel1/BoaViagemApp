package com.production.carolinamaciel.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;



public class DashboardActivity extends Activity {

    protected ImageView botao_novo_gasto;
    protected ImageView botao_nova_viagem;
    /*protected ImageView botao_minhas_viagens;
    protected ImageView botao_configuracao;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        botao_novo_gasto = (ImageView) findViewById(R.id.id_novogasto);
        botao_nova_viagem = (ImageView) findViewById(R.id.id_novaviagem);

        botao_novo_gasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,GastoActivity.class));
            }
        });

        botao_nova_viagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this,NovaViagemActivity.class));
            }
        });

    }
}
