package za.ac.iie.p1historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declarations
        var button= findViewById<Button>(R.id.generateFactButton)
        var button2 = findViewById<Button>(R.id.clearButton)
        var factTextView = findViewById<TextView>(R.id.message)
        var enterAge =  findViewById<EditText>(R.id.enterAge)

        val textView: TextView = findViewById(R.id.textView)

        //Clear text button
        button2.setOnClickListener {
            factTextView.text = "" // Clear text
        }

        //Generate text button
        button.setOnClickListener {
            val generatedText = generateText()
            factTextView.text = generatedText

            if (enterAge != null) {
                val generatedText = generateText()
                factTextView.text = generatedText
            } else {
                factTextView.text = "Invalid input!"
            }
        }
    }

    private fun generateText(): String {
        //Text generation logic

        var message : string = ""
        var age : Int

        message = age().text.toString().toInt()

        if(age > 0 && age <= 10)
        {
            message = "King Tutankhamun became a pharaoh at the age of 9 and Died at the age of 19."

        }
        else if(age > 11 && age <= 20)
        {
            message = "Annelies Marie Frank (Anne Frank) died at 16."

        }
        else if(age > 21 && age <= 30)
        {
            message = "Famous for his 'I have a dream' speech, Martin Luther king died at 30."

        }
        else if(age > 31 && age <= 40)
        {
            message = "Malcom X,who died at 39, was an islamic spokesperson in the 50s and 60s."

        }
        else if(age > 41 && age <= 50)
        {
            message = "John F. Kennedy, the 35th president of the United States, was assassinated at the age of 46."

        }
        else if(age > 51 && age <= 60)
        {
            message = "Ludwig van Beethoven passed away at the age of 56."

        }
        else if(age > 61 && age <= 70)
        {
            message = "George Washington, the first president of the USA, died at the age of 67."

        }
        else if(age > 71 && age <= 80)
        {
            message = "Muhammad Ali died at 74."

        }
        else if(age > 81 && age <= 90)
        {
            message = "Pele died at the age of 82."

        }
        else if(age > 91 && age <= 100)
        {
            message = "The first black president of South Africa died at 95."

        }
    }
}



