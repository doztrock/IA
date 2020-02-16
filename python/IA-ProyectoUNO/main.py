from random import seed
from random import randint
from datetime import datetime

import tkinter
from tkinter import messagebox
from tkinter import simpledialog

''' Rango '''
MIN_VALUE = 0
MAX_VALUE = 99

''' Cantidad de intentos '''
MAX_ATTEMPS = 5

''' Asignamos la semilla '''
seed(datetime.now())


def startGame():

    #
    # Numero pensado
    #
    randomNumber = randint(a=MIN_VALUE, b=MAX_VALUE)

    #
    # Bandera de aprobacion
    #
    approved = False

    #
    # Mensaje inicial
    #
    messagebox.showinfo(
        "¡Antes de empezar!",
        "A continuacion tendras " + str(MAX_ATTEMPS) + " intentos."
    )

    #
    # Depuracion
    #
    print("Numero: " + str(randomNumber))

    for counter in range(MAX_ATTEMPS):

        #
        # Solicitamos la respuesta
        #
        answer = simpledialog.askinteger(
            "Intento #" + str(counter + 1),
            "¿Que numero he pensado?",
            minvalue=MIN_VALUE,
            maxvalue=MAX_VALUE
        )

        #
        # Validacion: Respuesta correcta
        #
        if answer == randomNumber:

            messagebox.showinfo(
                "¡Felicitaciones!",
                "Lo has logrado"
            )

        #
        # Validacion: Respuesta menor
        #
        if answer < randomNumber:

            messagebox.showerror(
                "¡Oups!",
                "He pensado un numero mayor"
            )

        #
        # Validacion: Respuesta mayor
        #
        if answer > randomNumber:

            messagebox.showerror(
                "¡Oups!",
                "He pensado un numero menor"
            )


''' Ventana '''
window = tkinter.Tk()
window.title("Proyecto 1")
window.geometry("325x130")
window.resizable(False, False)

''' Boton '''
pixel = tkinter.PhotoImage(width=0, height=0)
button = tkinter.Button(window,
                        command=startGame,
                        image=pixel, height=100, width=100,
                        compound="c", text="Iniciar")
button.pack()
button.place(x=10, y=10)

''' Mostramos la ventana '''
window.mainloop()
