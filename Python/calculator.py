from tkinter import *
import math

root = Tk()
root.title("Scientific Calculator")

e = Entry(root, width=61, borderwidth=5, bg="powder blue", justify="right")
e.grid(row=0, column=0, columnspan=4, padx=10, pady=10)

def button_click(number):
	current = e.get()
	e.delete(0, END)
	e.insert(0, str(current) + str(number))

def button_clear():
	e.delete(0, END)

def button_add():
	first_number = e.get()
	global num
	global op
	op = "addition"
	num = float(first_number)
	e.delete(0, END)

def button_subtract():
	first_number = e.get()
	global num
	global op
	op = "subtraction"
	num = float(first_number)
	e.delete(0, END)

def button_multiply():
	first_number = e.get()
	global num
	global op
	op = "multiplication"
	num = float(first_number)
	e.delete(0, END)

def button_divide():
	first_number = e.get()
	global num
	global op
	op = "division"
	num = float(first_number)
	e.delete(0, END)

def button_sqrt():
	first_number=e.get()
	global num
	global op
	op = "sqrt"
	num = float(first_number)
	e.delete(0, END)

def button_pow():
	first_number=e.get()
	global num
	global op
	op = "pow"
	num = float(first_number)
	e.delete(0, END)

def button_mod():
	first_number=e.get()
	global num
	global op
	op = "mod"
	num = float(first_number)
	e.delete(0, END)

def button_log():
	first_number=e.get()
	global num
	global op
	op = "log"
	num = float(first_number)
	e.delete(0, END)

def button_ln():
	first_number=e.get()
	global num
	global op
	op = "ln"
	num = float(first_number)
	e.delete(0, END)

def button_sin():
	first_number=e.get()
	global num
	global op
	op = "sin"
	num = float(first_number)
	e.delete(0, END)

def button_cos():
	first_number=e.get()
	global num
	global op
	op = "cos"
	num = float(first_number)
	e.delete(0, END)

def button_tan():
	first_number=e.get()
	global num
	global op
	op = "tan"
	num = float(first_number)
	e.delete(0, END)


def button_equal():
	if op == "addition":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0, num + float(second_number))

	if op == "subtraction":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0, num - float(second_number))

	if op == "multiplication":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0, num * float(second_number))

	if op == "division":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0, num / float(second_number))

	if op =="sqrt":
		e.delete(0, END)
		e.insert(0,math.sqrt(num))

	if op == "pow":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0,math.pow(num,float(second_number)))

	if op == "mod":
		second_number = e.get()
		e.delete(0, END)
		e.insert(0,num%float(second_number))

	if op =="log":
		e.delete(0, END)
		e.insert(0,math.log(num,10))

	if op =="ln":
		e.delete(0, END)
		e.insert(0,math.log(num))

	if op =="sin":
		e.delete(0, END)
		e.insert(0,math.sin(num))


	if op =="cos":
		e.delete(0, END)
		e.insert(0,math.cos(num))

	if op =="tan":
		e.delete(0, END)
		e.insert(0,math.tan(num))


# Define Buttons
button_1 = Button(root, text="1", padx=40, pady=20, command=lambda: button_click(1))
button_2 = Button(root, text="2", padx=40, pady=20, command=lambda: button_click(2))
button_3 = Button(root, text="3", padx=40, pady=20, command=lambda: button_click(3))
button_4 = Button(root, text="4", padx=40, pady=20, command=lambda: button_click(4))
button_5 = Button(root, text="5", padx=40, pady=20, command=lambda: button_click(5))
button_6 = Button(root, text="6", padx=40, pady=20, command=lambda: button_click(6))
button_7 = Button(root, text="7", padx=40, pady=20, command=lambda: button_click(7))
button_8 = Button(root, text="8", padx=40, pady=20, command=lambda: button_click(8))
button_9 = Button(root, text="9", padx=40, pady=20, command=lambda: button_click(9))
button_0 = Button(root, text="0", padx=90, pady=20, command=lambda: button_click(0))
button_dot = Button(root, text=".", padx=40, pady=20, command=lambda: button_click("."))

button_add = Button(root, text="+", padx=40, pady=20, command=button_add)
button_equal = Button(root, text="=", padx=40, pady=52, command=button_equal)
button_clear = Button(root, text="C", padx=40, pady=20, command=button_clear)
button_subtract = Button(root, text="-", padx=41.5, pady=20, command=button_subtract)
button_multiply = Button(root, text="x", padx=41, pady=20, command=button_multiply)
button_divide = Button(root, text="/", padx=40, pady=20, command=button_divide)

button_mod = Button(root, text="%", padx=39, pady=20, command=button_mod)
button_log = Button(root, text="log", padx=35, pady=20, command=button_log)
button_pow = Button(root, text="x^y", padx=35, pady=20, command=button_pow)
button_pm = Button(root, text="±", padx=40, pady=20, command=lambda: button_click("-"))
button_sqrt = Button(root, text="√", padx=40, pady=20, command=button_sqrt)
button_ln = Button(root, text="ln", padx=39, pady=20, command=button_ln)
button_sin = Button(root, text="sin", padx=38, pady=20, command=button_sin)
button_cos = Button(root, text="cos", padx=35, pady=20, command=button_cos)
button_tan = Button(root, text="tan", padx=35, pady=20, command=button_tan)


# Put the buttons on the screen

button_1.grid(row=6, column=0)
button_2.grid(row=6, column=1)
button_3.grid(row=6, column=2)

button_4.grid(row=5, column=0)
button_5.grid(row=5, column=1)
button_6.grid(row=5, column=2)

button_7.grid(row=4, column=0)
button_8.grid(row=4, column=1)
button_9.grid(row=4, column=2)

button_0.grid(row=7, column=0, columnspan=2)
button_clear.grid(row=1, column=3)
button_add.grid(row=5, column=3)
button_equal.grid(row=6, column=3, rowspan=2)

button_subtract.grid(row=4, column=3)
button_multiply.grid(row=3, column=3)
button_divide.grid(row=3, column=2)

button_sqrt.grid(row=2, column=1)
button_mod.grid(row=3, column=1)
button_dot.grid(row=7, column=2)

button_log.grid(row=2, column=2)
button_pow.grid(row=2, column=0)
button_pm.grid(row=3, column=0)

button_ln.grid(row=2, column=3)
button_sin.grid(row=1, column=0)
button_cos.grid(row=1, column=1)
button_tan.grid(row=1, column=2)




root.mainloop()
