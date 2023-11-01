
class calculadora:
    """
    A simple calculator class for basic arithmetic operations.

    Methods:
    - sumar(x, y): Add two numbers.
    - restar(x, y): Subtract two numbers.
    - multiplicar(x, y): Multiply two numbers.
    - dividir(x, y): Divide two numbers.
    """

    def sumar(self, x, y):
        """
        Add two numbers.

        :param x: The first number to be added. It can be a float or an integer.
        :type x: float or int

        :param y: The second number to be added. It can be a float or an integer.
        :type y: float or int

        :return: The result of the addition. The return type matches the type of the operands.
        :rtype: float or int
        """
        return x + y

    def restar(self, x, y):
        """
        Subtract two numbers.

        :param x: The minuend. It can be a float or an integer.
        :type x: float or int

        :param y: The subtrahend. It can be a float or an integer.
        :type y: float or int

        :return: The result of the subtraction. The return type matches the type of the operands.
        :rtype: float or int
        """
        return x - y

    def multiplicar(self, x, y):
        """
        Multiply two numbers.

        :param x: The first factor. It can be a float or an integer.
        :type x: float or int

        :param y: The second factor. It can be a float or an integer.
        :type y: float or int

        :return: The result of the multiplication. The return type matches the type of the operands.
        :rtype: float or int
        """
        return x * y

    def dividir(self, x, y):
        """
    Divide two numbers and return the result.

    This method performs division between two numbers and returns the result. It also handles division by zero, raising a ValueError if y is 0.

    :param x: The dividend. It can be a float or an integer.
    :type x: float or int

    :param y: The divisor. It can be a float or an integer.
    :type y: float or int

    :return: The result of the division. The return type matches the type of the operands.
    :rtype: float or int

    :raises ValueError: If the divisor (y) is 0, a ValueError is raised to prevent division by zero.
        """
        if y == 0:
            raise ValueError("Division by zero is not allowed.")
        return x / y