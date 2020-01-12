package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editV1 = findViewById<EditText>(R.id.editV1)
        var editV2 = findViewById<EditText>(R.id.editV2)

        var check1 = findViewById<CheckBox>(R.id.check1)
        var btnC = findViewById<Button>(R.id.btnC)

        var textP = findViewById<TextView>(R.id.textP)

        btnC.setOnClickListener {

            var num1:Double = editV1.text.toString().toDouble()
            var num2:Double = editV2.text.toString().toDouble()
            var sum = 0.0
            var result = 0.0

            if (check1.isChecked){

                sum = num1-((num1*num2)/100)

                result = sum+(sum*7/100)


            }else{
                result = num1-((num1*num2)/100)

            }

            textP.setText(result.toString())
        }



    }
}


