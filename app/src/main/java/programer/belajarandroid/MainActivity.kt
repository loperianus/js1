package programer.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var buttonButton:  Button
    private lateinit var buttonTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        buttonButton = findViewById(R.id.buttonButton)
        buttonTextView = findViewById(R.id.buttonTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        buttonTextView.text = "Hallo"

        buttonButton.setOnClickListener{
            val name = nameEditText.text.toString()
            buttonTextView.text = "Hallo $name"
        }
    }
}