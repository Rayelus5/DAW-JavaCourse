; Inicia el script
#SingleInstance force

; Asigna la combinación de teclas Ctrl+D para ejecutar el script
^e::
; Datos a teclear
datos := "
(
2,Y7Z8A,13.45,C2D
2,Q9R0S,14.78,G4H
2,H3I4J,18.23,E3F
2,D3E4F,18.45,A1B
2,P1Q2R,17.54,C2D
2,G5H6I,16.56,G4H
2,M9N0O,20.00,I5J
2,E1F2G,15.67,E3F
2,G5H6I,12.67,C2D
2,A1B2C,17.12,G4H
2,A1B2C,15.23,A1B
2,J7K8L,19.89,C2D
2,K5L6M,12.89,E3F
2,D3E4F,11.34,G4H
2,S3T4U,11.76,C2D
2,J7K8L,13.89,I5J
2,B9C0D,21.00,E3F
2,N7O8P,19.45,G4H
2,V5W6X,16.98,C2D
2,D3E4F,11.34,C2D
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
        Send %dato%
		Sleep, 200
        Send {Enter}
		Sleep, 100
		
		
    }
	
	Send, {Enter}
	Sleep, 100
}

; Finaliza el script
; ExitApp
return
