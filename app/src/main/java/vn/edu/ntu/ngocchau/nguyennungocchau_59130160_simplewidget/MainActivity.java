package vn.edu.ntu.ngocchau.nguyennungocchau_59130160_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTen, edtNgaySinh, edtSoThich;
    RadioGroup rgbGioiTinh;
    RadioButton rbNam, rbNu;
    CheckBox cbXemPhim, cbNgheNhac, cbCafe, cbONha, cbNauAn;
    Button btnXacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        suKien();
    }

    private void anhXa(){
        edtTen      = (EditText) findViewById(R.id.edtTen);
        edtNgaySinh = (EditText) findViewById(R.id.edtNgaySinh);
        edtSoThich  = (EditText) findViewById(R.id.edtSoThich);
        rgbGioiTinh = (RadioGroup) findViewById(R.id.rgbGioiTinh);
        rbNam       = (RadioButton) findViewById(R.id.rbNam);
        rbNu        = (RadioButton) findViewById(R.id.rbNu);
        cbXemPhim   = (CheckBox) findViewById(R.id.cbXemPhim);
        cbNgheNhac  = (CheckBox) findViewById(R.id.cbNgheNhac);
        cbCafe      = (CheckBox) findViewById(R.id.cbCafe);
        cbONha      = (CheckBox) findViewById(R.id.cbONha);
        cbNauAn     = (CheckBox) findViewById(R.id.cbNauAn);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    private void suKien(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String thongTin = "";

                thongTin += edtTen.getText() + "\n";
                thongTin += "Ngày sinh: " + edtNgaySinh.getText() + "\n";

                switch (rgbGioiTinh.getCheckedRadioButtonId()){
                    case R.id.rbNam:
                        thongTin += "Giới tính: " + rbNam.getText() + "\n";
                        break;
                    case R.id.rbNu:
                        thongTin += "Giới tính: " + rbNu.getText() + "\n";
                        break;
                }

                thongTin += "Sở thích: ";

                if(cbXemPhim.isChecked()){
                    thongTin += cbXemPhim.getText() + "; ";
                }
                if(cbNgheNhac.isChecked()){
                    thongTin += cbNgheNhac.getText() + "; ";
                }
                if(cbCafe.isChecked()){
                    thongTin += cbCafe.getText() + "; ";
                }
                if(cbONha.isChecked()){
                    thongTin += cbONha.getText() + "; ";
                }
                if(cbNauAn.isChecked()){
                    thongTin += cbNauAn.getText() + "; ";
                }

                thongTin += edtSoThich.getText();

                Toast.makeText(MainActivity.this, thongTin, Toast.LENGTH_LONG).show();
            }

        });
    }
}

