package com.feri.prj1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtProdi, edtJeniskelamin, edtNotelp;
    Button btnSubmit, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.tampil);
        edtNpm = (EditText) findViewById(R.id.etdNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtJeniskelamin = (EditText) findViewById(R.id.edtJeniskelamin);
        edtNotelp = (EditText) findViewById(R.id.edtNotelp);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strJenisKelamin = edtJeniskelamin.getText().toString();
                String strNoTelp = edtNotelp.getText().toString();
                txtTampil.setText(strNpm + "\n" + strNama + "\n"+ strProdi + "\n" + strJenisKelamin + "\n" + strNoTelp);
            }
        });

        btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNpm.setText("");
                edtNama.setText("");
                edtProdi.setText("");
                edtJeniskelamin.setText("");
                edtNotelp.setText("");
                txtTampil.setText("");
            }
        });

    }
}