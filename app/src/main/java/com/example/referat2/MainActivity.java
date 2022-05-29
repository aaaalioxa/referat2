package com.example.referat2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    String[] food = { "Курица", "Рыба", "Хлеб белый", "Молоко", "Йогурт", "Хлеб черный", "Гречка", "Рис", "Перловка", "Сыр", "Творог"};
    String prod1, prod2, prod3;
    int a;
    TextView caloriesPage;
    TextView trainPage;
    Button button;
    AutoCompleteTextView textComplete1, textComplete2, textComplete3;
    TextInputEditText input1;
    TextView textView1;
    TextInputEditText input2;
    TextView textView2;
    TextInputEditText input3;
    TextView textView3, textResult;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textResult = (TextView)findViewById(R.id.textResult);
        textComplete1 = (AutoCompleteTextView)findViewById(R.id.autoComplete1);
        textComplete2 = (AutoCompleteTextView)findViewById(R.id.autoComplete2);
        textComplete3 = (AutoCompleteTextView)findViewById(R.id.autoComplete3);
        input1 = (TextInputEditText)findViewById(R.id.massInput3);
        input2 = (TextInputEditText)findViewById(R.id.massInput);
        input3 = (TextInputEditText)findViewById(R.id.massInput1);
        caloriesPage = (TextView) findViewById(R.id.caloriesPage);
        caloriesPage.setOnClickListener((View.OnClickListener) this);
        trainPage = (TextView) findViewById(R.id.trainPage);
        trainPage.setOnClickListener((View.OnClickListener) this);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoComplete1);
        AutoCompleteTextView autoCompleteTextView2 = findViewById(R.id.autoComplete2);
        AutoCompleteTextView autoCompleteTextView3 = findViewById(R.id.autoComplete3);
        ArrayAdapter<String> adapter = new ArrayAdapter (this, android.R.layout.simple_list_item_1, food);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter);
        autoCompleteTextView3.setAdapter(adapter);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        double a;
        switch (v.getId()) {
            case R.id.caloriesPage:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.trainPage:
                Intent intent1 = new Intent(this, MainActivity2.class);
                startActivity(intent1);
                break;
            case R.id.button:
                //Toast.makeText(this, this.input1.getText().toString(),Toast.LENGTH_LONG).show();
                switch (this.textComplete1.getText().toString()) {
                    case "Молоко":
                        a = Integer.parseInt(this.input1.getText().toString())*0.42;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Курица":
                        a = Integer.parseInt(this.input1.getText().toString())*2.39;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Рыба":
                        a = Integer.parseInt(this.input1.getText().toString())*2.06;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Хлеб белый":
                         a = Integer.parseInt(this.input1.getText().toString())*2.65;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Хлеб черный":
                        a = Integer.parseInt(this.input1.getText().toString())*2.3;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Йогурт":
                        a = Integer.parseInt(this.input1.getText().toString())*0.59;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Гречка":
                        a = Integer.parseInt(this.input1.getText().toString())*3.4;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Рис":
                        a = Integer.parseInt(this.input1.getText().toString())*3.3;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Перловка":
                        a = Integer.parseInt(this.input1.getText().toString())*3.15;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Сыр":
                        a = Integer.parseInt(this.input1.getText().toString())*4;
                        textView1.setText(String.valueOf(a));
                        break;
                    case "Творог":
                        a = Integer.parseInt(this.input1.getText().toString())*2.31;
                        textView1.setText(String.valueOf(a));
                        break;
                    default:
                        break;
                }
                switch (this.textComplete2.getText().toString()) {
                    case "Молоко":
                        a = Integer.parseInt(this.input2.getText().toString())*0.42;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Курица":
                        a = Integer.parseInt(this.input2.getText().toString())*2.39;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Рыба":
                        a = Integer.parseInt(this.input2.getText().toString())*2.06;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Хлеб белый":
                        a = Integer.parseInt(this.input2.getText().toString())*2.65;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Хлеб черный":
                        a = Integer.parseInt(this.input2.getText().toString())*2.3;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Йогурт":
                        a = Integer.parseInt(this.input2.getText().toString())*0.59;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Гречка":
                        a = Integer.parseInt(this.input2.getText().toString())*3.4;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Рис":
                        a = Integer.parseInt(this.input2.getText().toString())*3.3;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Перловка":
                        a = Integer.parseInt(this.input2.getText().toString())*3.15;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Сыр":
                        a = Integer.parseInt(this.input2.getText().toString())*4;
                        textView2.setText(String.valueOf(a));
                        break;
                    case "Творог":
                        a = Integer.parseInt(this.input2.getText().toString())*2.31;
                        textView2.setText(String.valueOf(a));
                        break;
                    default:
                        break;
                }
                switch (this.textComplete3.getText().toString()) {
                    case "Молоко":
                        a = Integer.parseInt(this.input2.getText().toString())*0.42;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Курица":
                        a = Integer.parseInt(this.input2.getText().toString())*2.39;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Рыба":
                        a = Integer.parseInt(this.input2.getText().toString())*2.06;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Хлеб белый":
                        a = Integer.parseInt(this.input2.getText().toString())*2.65;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Хлеб черный":
                        a = Integer.parseInt(this.input2.getText().toString())*2.3;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Йогурт":
                        a = Integer.parseInt(this.input2.getText().toString())*0.59;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Гречка":
                        a = Integer.parseInt(this.input2.getText().toString())*3.4;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Рис":
                        a = Integer.parseInt(this.input2.getText().toString())*3.3;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Перловка":
                        a = Integer.parseInt(this.input2.getText().toString())*3.15;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Сыр":
                        a = Integer.parseInt(this.input2.getText().toString())*4;
                        textView3.setText(String.valueOf(a));
                        break;
                    case "Творог":
                        a = Integer.parseInt(this.input2.getText().toString())*2.31;
                        textView3.setText(String.valueOf(a));
                        break;
                    default:
                        break;
                }
                a = Double.parseDouble(this.textView1.getText().toString()) + Double.parseDouble(this.textView2.getText().toString()) + Double.parseDouble(this.textView3.getText().toString());
                textResult.setText(String.valueOf(a));
                break;
            default:
                break;
        }
    }



}