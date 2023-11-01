from calculadora import calculadora
from papel import papel

class main: 
# Create instances of the classes
    pagina1 = papel()
    pagina2 = papel()
    calculadora = calculadora()

# Define values
    x = 5
    y = 10

# Perform calculations and add lines to pagina1 and pagina2

    pagina1.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(x,y)))
    pagina1.addLinea(str(x)+" - "+ str(y) +" = "+ str(calculadora.restar(x,y)))
    pagina1.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(calculadora.sumar(x,y),y)))
    pagina1.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(calculadora.restar(x,y),y)))
    pagina1.addLinea(str(x)+" / "+ str(y) +" = "+ str(calculadora.dividir(x,calculadora.sumar(y,y))))
    pagina1.addLinea(str(x)+" * "+ str(y) +" = "+ str(calculadora.multiplicar(x,y)))
    pagina2.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(x,calculadora.sumar(y,calculadora.sumar(y,y)))))
    pagina2.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(calculadora.sumar(x,calculadora.sumar(x,x)),y)))
    pagina2.addLinea(str(x)+" - "+ str(y) +" = "+ str(calculadora.restar(x,calculadora.restar(y,calculadora.multiplicar(y,x)))))
    pagina2.addLinea(str(x)+" + "+ str(y) +" = "+ str(calculadora.sumar(calculadora.multiplicar(x,y),y)))

# Print content of pagina1 and pagina2
    print("pagina 1")
    pagina1.showPagina()
    print("pagina 2")
    pagina2.showPagina()
