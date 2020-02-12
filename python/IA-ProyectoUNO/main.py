from random import seed
from random import randint
from datetime import datetime

import tkinter

''' Asignamos la semilla '''
seed(datetime.now())

'''
    Funcion:    generateRandomNumber()
    Objetivo:   Generar un numero aleatorio.
'''
def generateRandomNumber(min, max):
    return randint(min, max)

'''
    Funcion:    startGame()
    Objetivo:   Comenzar el juego.
'''
def startGame():
    randomNumber = generateRandomNumber(min = 0, max = 99)
    print(randomNumber)


''' Ventana '''
window = tkinter.Tk()
window.title("Proyecto 1")
window.geometry("325x130")
window.resizable(False, False)

''' Boton '''
pixel = tkinter.PhotoImage(width = 0, height = 0)
button = tkinter.Button(window, command = startGame, image = pixel, height = 100, width = 100, compound = "c", text = "Iniciar")
button.pack()
button.place(x = 10, y = 10)

''' Mostramos la ventana '''
window.mainloop()