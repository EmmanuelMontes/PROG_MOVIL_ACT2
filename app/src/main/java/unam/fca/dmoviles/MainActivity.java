package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.time.LocalDateTime;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 2 Introduccion a eventos con Button
        //https://developer.android.com/reference/android/widget/Button
        //Button es un componente de Android que realizar acciones al hacer click en el

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.

        final TextView tv = findViewById(R.id.tv);
        final Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(LocalDateTime.now().toString());
            }
        });

        }

 }
