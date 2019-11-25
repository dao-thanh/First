package com.example.firstrun1;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtA, edtB;
    private ListView lvResult;
    private TextView tvResult;
    private ArrayList<String> result;
    private ArrayAdapter<String> adapter;
    private Button btnSub,btnMul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = new ArrayList<String>();
        btnSub=(Button)findViewById(R.id.btn_sub);
        btnMul=(Button)findViewById(R.id.btn_mul);
        lvResult = (ListView) findViewById(R.id.lv_result);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result);
        lvResult.setAdapter(adapter);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View argo) {
                edtA = (EditText) findViewById(R.id.edt_a);
                int a=Integer.parseInt(edtA.getText()+"");
                edtB = (EditText) findViewById(R.id.edt_b);
                int b=Integer.parseInt(edtB.getText()+"");
                result.add(a + "-" + b + "=" + (a-b));
                adapter.notifyDataSetChanged();
            }
        });
        btnMul.setOnClickListener(this);
    }
    public void onClick(View argo)
    {
        edtA = (EditText) findViewById(R.id.edt_a);
        int a=Integer.parseInt(edtA.getText()+"");
        edtB = (EditText) findViewById(R.id.edt_b);
        int b=Integer.parseInt(edtB.getText()+"");
        result.add(a + "*" + b + "=" + (a*b));
        adapter.notifyDataSetChanged();
    }
        public void btn_tong2so(View v)
        {
            edtA = (EditText) findViewById(R.id.edt_a);
            int a=Integer.parseInt(edtA.getText()+"");
            edtB = (EditText) findViewById(R.id.edt_b);
            int b=Integer.parseInt(edtB.getText()+"");
            result.add(a + "+" + b + "=" + (a+b));
            adapter.notifyDataSetChanged();
        }
    public void btn_chia2so(View v)
    {
        edtA = (EditText) findViewById(R.id.edt_a);
        int a=Integer.parseInt(edtA.getText()+"");
        edtB = (EditText) findViewById(R.id.edt_b);
        int b=Integer.parseInt(edtB.getText()+"");
        result.add(a + "/" + b + "=" + (a/b));
        adapter.notifyDataSetChanged();
    }

    }
