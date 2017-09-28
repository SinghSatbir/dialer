package com.my.newproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity {
    private String Numver = "";
    private Button button1;
    private Button button10;
    private Button button11;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Intent call = new Intent();
    private EditText edittext1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private TextView textview1;

    class C00011 implements OnClickListener {
        C00011() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("1"));
        }
    }

    class C00022 implements OnClickListener {
        C00022() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("2"));
        }
    }

    class C00033 implements OnClickListener {
        C00033() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("3"));
        }
    }

    class C00044 implements OnClickListener {
        C00044() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("4"));
        }
    }

    class C00055 implements OnClickListener {
        C00055() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("5"));
        }
    }

    class C00066 implements OnClickListener {
        C00066() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("6"));
        }
    }

    class C00077 implements OnClickListener {
        C00077() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("7"));
        }
    }

    class C00088 implements OnClickListener {
        C00088() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("8"));
        }
    }

    class C00099 implements OnClickListener {
        C00099() {
        }

        public void onClick(View view) {
            MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("9"));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0010R.layout.main);
        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.textview1 = (TextView) findViewById(C0010R.id.textview1);
        this.edittext1 = (EditText) findViewById(C0010R.id.edittext1);
        this.linear3 = (LinearLayout) findViewById(C0010R.id.linear3);
        this.linear5 = (LinearLayout) findViewById(C0010R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(C0010R.id.linear6);
        this.linear8 = (LinearLayout) findViewById(C0010R.id.linear8);
        this.linear9 = (LinearLayout) findViewById(C0010R.id.linear9);
        this.linear2 = (LinearLayout) findViewById(C0010R.id.linear2);
        this.button1 = (Button) findViewById(C0010R.id.button1);
        this.button2 = (Button) findViewById(C0010R.id.button2);
        this.button3 = (Button) findViewById(C0010R.id.button3);
        this.linear4 = (LinearLayout) findViewById(C0010R.id.linear4);
        this.button4 = (Button) findViewById(C0010R.id.button4);
        this.button5 = (Button) findViewById(C0010R.id.button5);
        this.button6 = (Button) findViewById(C0010R.id.button6);
        this.button7 = (Button) findViewById(C0010R.id.button7);
        this.button8 = (Button) findViewById(C0010R.id.button8);
        this.button9 = (Button) findViewById(C0010R.id.button9);
        this.button10 = (Button) findViewById(C0010R.id.button10);
        this.button11 = (Button) findViewById(C0010R.id.button11);
        this.button1.setOnClickListener(new C00011());
        this.button2.setOnClickListener(new C00022());
        this.button3.setOnClickListener(new C00033());
        this.button4.setOnClickListener(new C00044());
        this.button5.setOnClickListener(new C00055());
        this.button6.setOnClickListener(new C00066());
        this.button7.setOnClickListener(new C00077());
        this.button8.setOnClickListener(new C00088());
        this.button9.setOnClickListener(new C00099());
        this.button10.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.edittext1.setText(MainActivity.this.edittext1.getText().toString().concat("0"));
            }
        });
        this.button11.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.call.setAction("android.intent.action.CALL");
                MainActivity.this.call.setData(Uri.parse("tel:".concat(MainActivity.this.edittext1.getText().toString())));
                MainActivity.this.startActivity(MainActivity.this.call);
            }
        });
    }

    private void initializeLogic() {
    }

    private void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    private int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }
}
