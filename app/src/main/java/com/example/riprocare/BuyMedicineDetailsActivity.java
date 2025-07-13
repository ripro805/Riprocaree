package com.example.riprocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BuyMedicineDetailsActivity extends AppCompatActivity {

    TextView tvPackageName,tvTotalCost,tvDetails;

 Button btnBack,btnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine_details);

        btnBack=findViewById(R.id.buttonBMDBack);
        btnAddToCart=findViewById(R.id.buttonBMDAddToCart);
        tvPackageName=findViewById(R.id.textViewBMDPackageName);
        tvDetails=findViewById(R.id.editTextTextBMDMultiLine);
        tvTotalCost=findViewById(R.id.textViewBMDTotalCost);

        tvDetails.setKeyListener(null);

        Intent intent =  getIntent();
        String packageName = intent.getStringExtra("text1");
        String details= intent.getStringExtra("text2");
        String coast = intent.getStringExtra("text3");


        tvPackageName.setText(packageName);
        tvDetails.setText(details);
        tvTotalCost.setText("Total coast : "+coast+"/-");


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuyMedicineDetailsActivity.this,BuyMedicineActivity.class));
            }
        });


        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
                String username = sharedPreferences.getString("username", "").toString();
                String product = tvPackageName .getText().toString();
                float price = Float.parseFloat(intent.getStringExtra("text3").toString());

                Database db = new Database(getApplicationContext(),"HealthCare",null,1);

                if(db.checkCart(username,product)==1)
                {
                    Toast.makeText(getApplicationContext(),"Product already added",Toast.LENGTH_SHORT).show();

                }
                else {
                    db.addCart(username,product,price,"medicine");
                    Toast.makeText(getApplicationContext(),"Record insert into cart",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(BuyMedicineDetailsActivity.this,BuyMedicineActivity.class));

                }


            }
        });


    }
}