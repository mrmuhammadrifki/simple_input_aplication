package Id.go.kominfo.rifki.simpleinputapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //mendefinisikan object etName dan tvInfo
    private EditText etName;
    private TextView tvInfo;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menguji apakah actionbar ada
        assert getSupportActionBar() !=null;
        //memberi title pada aplikasi
        getSupportActionBar().setTitle("Simple Input App");
        //mendeklarasikan object etName dan tvInfo
        etName = findViewById(R.id.et_name);
        tvInfo = findViewById(R.id.tv_info);
        Button btTampilkan = findViewById(R.id.bt_tampilkan);
        //menambah aksi ketika user mengklik tombol btTampilkan
        btTampilkan.setOnClickListener(v->{
            //periksa jika etName kosong
            if (etName.getText().toString().isEmpty()) {
                //tampilkan pesan
                Toast.makeText(this, "Name tidak boleh Kosong!", Toast.LENGTH_SHORT).show();
            }
            else{
                //tampilkan output pada tvInfo
                tvInfo.setText("Nama Anda: " + etName.getText().toString());
            }
        });
    }
}