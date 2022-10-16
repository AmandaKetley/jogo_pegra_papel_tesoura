package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    private TextView tv_resultado, tv_vitoria, tv_derrota, tv_empate;
    private ImageView iv_principal, iv_pedra, iv_papel, iv_tesoura;
    Random gerador = new Random();
    int derrota, empate, vitoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_resultado = findViewById(R.id.tv_resultado);
        tv_vitoria = findViewById(R.id.tv_vitorias);
        tv_empate = findViewById(R.id.tv_empates);
        tv_derrota = findViewById(R.id.tv_derrotas);
        iv_papel = findViewById(R.id.iv_papel);
        iv_pedra = findViewById(R.id.iv_pedra);
        iv_tesoura = findViewById(R.id.iv_tesoura);
        iv_principal = findViewById(R.id.iv_selecao_android);
    }

    public void clikPedra(View v){

        iv_pedra.setColorFilter(ContextCompat.getColor(this,R.color.creme_rosa), PorterDuff.Mode.MULTIPLY);
        iv_papel.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);
        iv_tesoura.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);

        int opcao = gerador.nextInt(3);

        if(opcao == 0){
            iv_principal.setImageResource(R.drawable.pedra);
            tv_resultado.setText("EMPATE");
            empate = empate +1;
            tv_empate.setText(empate+"");

        } else if(opcao == 1){
            iv_principal.setImageResource(R.drawable.papel);
            tv_resultado.setText("Você PERDEU :(");
            derrota = derrota+1;
            tv_derrota.setText(derrota+"");

        }else if(opcao == 2){
            iv_principal.setImageResource(R.drawable.tesoura);
            tv_resultado.setText("Você GANHOU :)");
            vitoria = vitoria +1;
            tv_vitoria.setText(vitoria +"");
        }
    }
    public void clickPapel(View v){
        iv_papel.setColorFilter(ContextCompat.getColor(this,R.color.creme_rosa), PorterDuff.Mode.MULTIPLY);
        iv_tesoura.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);
        iv_pedra.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);

        int opcao = gerador.nextInt(3);

        if(opcao == 0){
            iv_principal.setImageResource(R.drawable.pedra);
            tv_resultado.setText("Você GANHOU :)");
            vitoria = vitoria +1;
            tv_vitoria.setText(vitoria +"");

        } else if(opcao == 1){
            iv_principal.setImageResource(R.drawable.papel);
            tv_resultado.setText("EMPATE");
            empate = empate +1;
            tv_empate.setText(empate+"");

        }else if(opcao == 2){
            iv_principal.setImageResource(R.drawable.tesoura);
            tv_resultado.setText("Você PERDEU :(");
            derrota = derrota+1;
            tv_derrota.setText(derrota+"");
        }
    }
    public void clickTesoura(View v){
        iv_tesoura.setColorFilter(ContextCompat.getColor(this,R.color.creme_rosa), PorterDuff.Mode.MULTIPLY);
        iv_pedra.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);
        iv_papel.setColorFilter(ContextCompat.getColor(this,R.color.white), PorterDuff.Mode.MULTIPLY);

        int opcao = gerador.nextInt(3);

        if(opcao == 0){
            iv_principal.setImageResource(R.drawable.pedra);
            tv_resultado.setText("Você PERDEU :(");
            derrota = derrota+1;
            tv_derrota.setText(derrota+"");

        } else if(opcao == 1){
            iv_principal.setImageResource(R.drawable.papel);
            tv_resultado.setText("Você GANHOU :)");
            vitoria = vitoria +1;
            tv_vitoria.setText(vitoria +"");

        }else if(opcao == 2){
            iv_principal.setImageResource(R.drawable.tesoura);
            tv_resultado.setText("EMPATE");
            empate = empate +1;
            tv_empate.setText(empate+"");
        }
    }

}