; Inicia el script
#SingleInstance force

; Asigna la combinación de teclas Ctrl+D para ejecutar el script
^d::
; Datos a teclear
datos := "
(
1,A1B2C,Manzanas
1,D3E4F,Naranjas
1,G5H6I,Peras
1,J7K8L,Uvas
1,M9N0O,Platanos
1,P1Q2R,Fresas
1,S3T4U,Melocotones
1,V5W6X,Cerezas
1,Y7Z8A,Kiwi
1,B9C0D,Mangos
1,E1F2G,Papayas
1,H3I4J,Pinas
1,K5L6M,Sandias
1,N7O8P,Melones
1,Q9R0S,Frambuesas
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
