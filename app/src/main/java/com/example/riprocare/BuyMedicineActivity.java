package com.example.riprocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class BuyMedicineActivity extends AppCompatActivity {


    private  String[][] packages ={

            { "Uprise -03 10IU Capsule","","","","50"  },
            { "Paracetamol (Acetaminophen)","","","","500"  },
            { "Ibuprofen  100 tablets (200mg each)","","","","550"  },
            { "Amoxicillin  20 capsules (500mg each)","","","","200"  },
            { "Metformin (500mg tablets)","","","","50"  },
            { "Cetirizine (Zyrtec) (10mg tablets)","","","","500"  },
            { "Aspirin 100 tablets (81mg for low-dose)","","","","300"  },
            { "Lisinopril (10mg tablets)","","","","100"  },
            { "Uprise -02 100IU Capsule","","","","500"  },


    };

    private String[] package_details = {

            "Building and keeping bones and teeth strong\n"+
                    "Reducing fatigue and muscular pain\n"+
                    "Boosting immunity and increasing protection for infection",
            "ain relief (headaches, muscle pain, arthritis)\n" +
                    "Reducing fever",
            "Pain relief (e.g., from headaches, toothaches, menstrual cramps)\n" +
                    "Anti-inflammatory (used for arthritis or injury)\n" +
                    "Reduces fever",
            "Antibiotic used to treat bacterial infections (e.g., ear infections, strep throat, pneumonia)",
            "Used to manage type 2 diabetes.\n" +
                    "Helps control blood sugar levels.",
            "Antihistamine for allergies (e.g., hay fever, allergic rhinitis)\n" +
                    "Reduces symptoms like runny nose, sneezing, and itchy eyes",
            "Pain relief (headaches, muscle pain)\n" +
                    "Reduces inflammation\n" +
                    "Used for cardiovascular protection (to reduce heart attack or stroke risk)",
            "Used to treat high blood pressure (hypertension) and heart failure.\n" +
                    "Helps prevent stroke and kidney problems in those with diabetes.",
            "Should be taken regularly, even if you feel fine, to maintain stable blood pressure."
    };

    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnBack,btnGoToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine);

        lst=findViewById(R.id.listViewBM);
        btnBack=findViewById(R.id.buttonBMCartBack);
        btnGoToCart=findViewById(R.id.buttonBMCheckOut);


        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(BuyMedicineActivity.this,CartBuyMedicineActivity.class));
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(BuyMedicineActivity.this,HomeMainActivity.class));

            }
        });

        list = new ArrayList<>();
        for(int i=0;i<packages.length;i++)
        {
            item = new HashMap<String,String>();
            item.put("line1",packages[i][0]);
            item.put("line2",packages[i][1]);
            item.put("line3",packages[i][2]);
            item.put("line4",packages[i][3]);
            item.put("line5","Total Cost: "+packages[i][4]+"/-");
            list.add(item);

        }

        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});


      lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(BuyMedicineActivity.this,BuyMedicineDetailsActivity.class);

                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][4]);
                startActivity(it);
            }
        });



    }
}