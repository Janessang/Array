package sg.edu.rp.c346.id20025312.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    TextView tvList;
    ArrayList<String> ALfruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tv = findViewById(R.id.tvFruits);
        tvList = findViewById(R.id.tvList);

//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";

//        String strText = "Fruits\n";
//        strText += "===============\n";

//       for (int i = 0; i < fruits.length; i++) {
//           strText += fruits[i] + "\n";

//        }

//        tv.setText(strText);

        ALfruits = new ArrayList<String>();
        ALfruits.add("apple");
        ALfruits.add("banana");
        ALfruits.add("cherry");
        ALfruits.add("durain");

        String strTextList = "Fruits\n";
        strTextList += "===============\n";

        ALfruits.remove(0);
        String theFruit = ALfruits.get(1);
        ALfruits.set(ALfruits.size()-1, "dragon fruit");

        for (int i = 0; i < ALfruits.size(); i++) {
            strTextList += ALfruits.get(i) + "\n";

        }

        tvList.setText(strTextList + "\nSecond Element: " + theFruit);
    }
}