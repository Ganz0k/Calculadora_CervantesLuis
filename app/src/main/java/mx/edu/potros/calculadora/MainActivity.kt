package mx.edu.potros.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campo1: TextView = findViewById(R.id.textView1)
        val campo2: TextView = findViewById(R.id.textView2)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnResult: Button = findViewById(R.id.btnResult)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnMas: Button = findViewById(R.id.btnMas)
        val btnMenos: Button = findViewById(R.id.btnMenos)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDividir: Button = findViewById(R.id.btnDividir)
        var conOperacion: Boolean = false
        var operacion: String = ""

        btn0.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "0"
            campo2.setText(cadena)
        }

        btn1.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "1"
            campo2.setText(cadena)
        }

        btn2.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "2"
            campo2.setText(cadena)
        }

        btn3.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "3"
            campo2.setText(cadena)
        }

        btn4.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "4"
            campo2.setText(cadena)
        }

        btn5.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "5"
            campo2.setText(cadena)
        }

        btn6.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "6"
            campo2.setText(cadena)
        }

        btn7.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "7"
            campo2.setText(cadena)
        }

        btn8.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "8"
            campo2.setText(cadena)
        }

        btn9.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena + "9"
            campo2.setText(cadena)
        }

        btnResult.setOnClickListener {
            if (conOperacion) {
                var cadena1 = campo1.text.toString()
                var num2 = campo2.text.toString().toInt()
                cadena1.dropLast(1)
                var num1 = cadena1.toInt()

                when {
                    operacion.equals("+") -> {
                        var resultado = num1 + num2
                        campo1.setText(resultado.toString())
                        campo2.setText("0")
                    }

                    operacion.equals("-") -> {
                        var resultado = num1 - num2
                        campo1.setText(resultado.toString())
                        campo2.setText("0")
                    }

                    operacion.equals("*") -> {
                        var resultado = num1 * num2
                        campo1.setText(resultado.toString())
                        campo2.setText("0")
                    }

                    operacion.equals("/") -> {
                        var resultado = num1 / num2
                        campo1.setText(resultado.toString())
                        campo2.setText("0")
                    }
                }
            }
        }

        btnBorrar.setOnClickListener {
            var cadena = campo2.text.toString()
            cadena = cadena.dropLast(1)
            campo2.setText(cadena)
        }

        btnMas.setOnClickListener {
            if (!conOperacion) {
                var cadena = campo2.text.toString()
                cadena = cadena + "+"
                campo1.setText(cadena)
                campo2.setText("0")
                conOperacion = true
                operacion = "+"
            }
        }

        btnMenos.setOnClickListener {
            if (!conOperacion) {
                var cadena = campo2.text.toString()
                cadena = cadena + "-"
                campo1.setText(cadena)
                campo2.setText("0")
                conOperacion = true
                operacion = "-"
            }
        }

        btnMultiplicar.setOnClickListener {
            if (!conOperacion) {
                var cadena = campo2.text.toString()
                cadena = cadena + "*"
                campo1.setText(cadena)
                campo2.setText("0")
                conOperacion = true
                operacion = "*"
            }
        }

        btnDividir.setOnClickListener {
            if (!conOperacion) {
                var cadena = campo2.text.toString()
                cadena = cadena + "/"
                campo1.setText(cadena)
                campo2.setText("0")
                conOperacion = true
                operacion = "/"
            }
        }
    }
}
