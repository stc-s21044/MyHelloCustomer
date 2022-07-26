package jp.suntech.s21044.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick=findViewById(R.id.btClick);
        HelloListener listener=new HelloListener(); //ボタンインスタンス
        btClick.setOnClickListener(listener); //ボタンを組み込む

        Button btNclear=findViewById(R.id.btNclear);
        btNclear.setOnClickListener(listener);

        Button btAclear=findViewById(R.id.btAclear);
        btAclear.setOnClickListener(listener);
    }

    //リスナクラス イベントの監視
    private class HelloListener implements View.OnClickListener{

        //イベントハンドラ　イベント発生時の処理
        @Override
        public void onClick(View view){
            EditText input=findViewById(R.id.etName);
            EditText input2=findViewById(R.id.etAdd);

            TextView output=findViewById(R.id.tvOutput);

            int id=view.getId();
            switch (id) {
                case R.id.btClick:
                    String inputnStr = input.getText().toString();
                    String inputaStr = input2.getText().toString();
                    output.setText(inputaStr+"にお住いの"+inputnStr + "さん、こんにちは！");
                    break;

                case R.id.btNclear:
                    input.setText("");
                    output.setText("");
                    break;

                case R.id.btAclear:
                    input2.setText("");
                    output.setText("");
                    break;
            }
        }

    }
}