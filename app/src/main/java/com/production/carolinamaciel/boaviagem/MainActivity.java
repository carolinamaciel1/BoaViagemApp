package com.production.carolinamaciel.boaviagem;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    protected Button botao;
    protected EditText login;
    protected EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botao_logar);
        login = (EditText) findViewById(R.id.id_login);
        senha = (EditText) findViewById(R.id.id_senha);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login_informado = login.getText().toString();
                String senha_informada = senha.getText().toString();
                if ("leitor".equals(login_informado) && "123".equals(senha_informada)) {
                    startActivity(new Intent(MainActivity.this,DashboardActivity.class));
                }else{
                    String	mensagemErro	=	getString(R.string.erro_autenticacao_login);
                    Toast.makeText(getApplicationContext(),mensagemErro,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
