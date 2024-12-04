SetKeyDelay, 100

^d:: ; Al pulsar Ctrl+D, comienza el script

; Datos originales
Send, 1{enter}
Send, Rayo{enter}
Send, 1{enter}
Send, Sevilla{enter}
Send, 3.5{enter}
Send, {enter}

Send, 1{enter}
Send, Galerna{enter}
Send, 6{enter}
Send, Bilbao{enter}
Send, 6.2{enter}
Send, {enter}

Send, 1{enter}
Send, Tormenta{enter}
Send, 2{enter}
Send, Madrid{enter}
Send, 5.1{enter}
Send, {enter}

Send, 1{enter}
Send, Brisa{enter}
Send, 1{enter}
; No se envía ciudad porque ya se registró la carrera 1
Send, 3.9{enter}
Send, {enter}

Send, 1{enter}
Send, Amanecer{enter}
Send, 2{enter}
; No se envía ciudad porque ya se registró la carrera 2
Send, 4.6{enter}
Send, {enter}

Send, 1{enter}
Send, Trueno{enter}
Send, 9{enter}
Send, Valencia{enter}
Send, 5.0{enter}
Send, {enter}

; Trueno corre en una segunda carrera
Send, 1{enter}
Send, Trueno{enter}
Send, 2{enter}
; No se envía ciudad porque ya se registró para la carrera 2
Send, 5.3{enter}
Send, {enter}

; Nuevas carreras en la misma ciudad (Barcelona)
Send, 1{enter}
Send, Relampago{enter}
Send, 4{enter}
Send, Barcelona{enter}
Send, 4.8{enter}
Send, {enter}

Send, 1{enter}
Send, Huracan{enter}
Send, 7{enter}
Send, Bilbao{enter}
Send, 6.1{enter}
Send, {enter}

Send, 1{enter}
Send, Torbellino{enter}
Send, 8{enter}
Send, Bilbao{enter}
Send, 6.0{enter}
Send, {enter}

Send, 1{enter}
Send, Centella{enter}
Send, 5{enter}
Send, Barcelona{enter}
Send, 4.9{enter}
Send, {enter}

Send, 1{enter}
Send, Viento{enter}
Send, 1{enter}
; No se envía ciudad porque ya se registró para la carrera 1
Send, 4.2{enter}
Send, {enter}

return