import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizzaCheckbox = findViewById<CheckBox>(R.id.cb1)
        val burgerCheckbox = findViewById<CheckBox>(R.id.cb2)
        val coffeeCheckbox = findViewById<CheckBox>(R.id.cb3)
        val submitButton = findViewById<Button>(R.id.B1)

        submitButton.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Selected Items\n")

            if (pizzaCheckbox.isChecked) {
                result.append("Pizza: 100Rs\n")
                totalAmount += 100
            }
            if (coffeeCheckbox.isChecked) {
                result.append("Coffee: 50Rs\n")
                totalAmount += 50
            }
            if (burgerCheckbox.isChecked) {
                result.append("Burger: 120Rs\n")
                totalAmount += 120
            }

            result.append("Total: $totalAmount Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
