; Inicia el script
#Persistent

; Asigna la combinación de teclas Ctrl+D para ejecutar el script
^d::
; Datos a teclear
datos := "
(
Florida,22975900,4000000,4500000,200000,100000
North Carolina,10975000,2700000,2800000
California,38889800,5000000,7000000,300000,200000
Ohio,11812200,3000000,3200000
Texas,30976800,6000000,5500000,250000,150000
Nevada,3210930,2200000,2300000
Georgia,11145300,2800000,2900000
New York,19469200,3000000,6000000,150000,120000
Michigan,10041200,2800000,2700000
Colorado,5914180,2000000,2100000
Arizona,7497000,2400000,2500000
Wisconsin,5931370,2300000,2400000
Minnesota,5761530,2100000,2200000
Illinois,12516900,2500000,4000000
Pennsylvania,12951300,3500000,3700000
fin
)"

; Divide los datos en líneas
lineas := StrSplit(datos, "`n")

; Teclea cada línea
Loop % lineas.MaxIndex()
{
    linea := lineas[A_Index]
    ; Divide la línea en datos individuales
    datos_individuales := StrSplit(linea, ",")
    ; Teclea cada dato seguido de "enter"
    Loop % datos_individuales.MaxIndex()
    {
        dato := datos_individuales[A_Index]
        SendInput %dato%
		
        SendInput {Enter}
		Sleep, 200
    }
}

; Finaliza el script
; ExitApp
return
