^d::
    ; Define el retraso en milisegundos (ajusta según tu necesidad)
    delay := 400

    ; Función para enviar texto con Enter y aplicar el delay
    SendWithDelay(text) {
        global delay
        SendInput, %text%{Enter}
        Sleep, delay
    }

    ; Iniciar el proceso de entrada de datos
    SendWithDelay("4") ; Número de robots

    ; Primer robot
    SendWithDelay("N-Curiosity") ; Nombre del robot
    SendWithDelay("Marte") ; Nombre del planeta
    SendWithDelay("3") ; Número de días para misión 1
    SendWithDelay("-20") ; Día 1, Temperatura
    SendWithDelay("0.7") ; Día 1, Presión
    SendWithDelay("0.05") ; Día 1, Radiación
    SendWithDelay("-22") ; Día 2, Temperatura
    SendWithDelay("0.68") ; Día 2, Presión
    SendWithDelay("0.06") ; Día 2, Radiación
    SendWithDelay("-18") ; Día 3, Temperatura
    SendWithDelay("0.72") ; Día 3, Presión
    SendWithDelay("0.07") ; Día 3, Radiación
    SendWithDelay("2") ; Misión 2, Número de días
    SendWithDelay("-15") ; Día 1, Temperatura
    SendWithDelay("0.74") ; Día 1, Presión
    SendWithDelay("0.06") ; Día 1, Radiación
    SendWithDelay("-13") ; Día 2, Temperatura
    SendWithDelay("0.71") ; Día 2, Presión
    SendWithDelay("0.08") ; Día 2, Radiación
    SendWithDelay("-1") ; Fin de misiones

    ; Segundo robot
    SendWithDelay("N-Opportunity")
    SendWithDelay("Venus")
    SendWithDelay("4")
    SendWithDelay("460")
    SendWithDelay("92")
    SendWithDelay("1.0")
    SendWithDelay("455")
    SendWithDelay("93")
    SendWithDelay("1.2")
    SendWithDelay("462")
    SendWithDelay("91")
    SendWithDelay("1.1")
    SendWithDelay("458")
    SendWithDelay("92.5")
    SendWithDelay("1.3")
    SendWithDelay("-1")

    ; Tercer robot
    SendWithDelay("J-Hayabusa")
    SendWithDelay("Mercurio")
    SendWithDelay("5")
    SendWithDelay("350")
    SendWithDelay("0.1")
    SendWithDelay("0.03")
    SendWithDelay("355")
    SendWithDelay("0.15")
    SendWithDelay("0.04")
    SendWithDelay("345")
    SendWithDelay("0.12")
    SendWithDelay("0.05")
    SendWithDelay("360")
    SendWithDelay("0.14")
    SendWithDelay("0.06")
    SendWithDelay("348")
    SendWithDelay("0.11")
    SendWithDelay("0.07")
    SendWithDelay("-1")

    ; Cuarto robot
    SendWithDelay("E-Rosetta")
    SendWithDelay("67P/Churyumov-Gerasimenko")
    SendWithDelay("6")
    SendWithDelay("-40")
    SendWithDelay("0.2")
    SendWithDelay("0.03")
    SendWithDelay("-35")
    SendWithDelay("0.25")
    SendWithDelay("0.04")
    SendWithDelay("-37")
    SendWithDelay("0.22")
    SendWithDelay("0.05")
    SendWithDelay("-38")
    SendWithDelay("0.23")
    SendWithDelay("0.06")
    SendWithDelay("-36")
    SendWithDelay("0.24")
    SendWithDelay("0.07")
    SendWithDelay("-39")
    SendWithDelay("0.21")
    SendWithDelay("0.08")
    SendWithDelay("-1")

Return
