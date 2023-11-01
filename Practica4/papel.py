class papel: 
    """
    A simple class to represent a paper for writing.

    :param papel: A list to store lines of text.

    :Methods:
        - __init__(): Initialize a new paper with an empty content.
        - showPagina(): Display the content of the paper.
        - addLinea(texto): Add a line of text to the paper.
    """

    def __init__(self):
        """
        Initialize a new paper with an empty content.
        
        :return: None

        """
        self.papel = [] 
    def showPagina(self):
        """
        Display the content of the paper.

        If the paper is empty, it will print "Pagina vacia."

        :return: None
        """
        i=0
        if i < len(self.papel):
            while i < len(self.papel): 
                print(self.papel[i])
                i += 1
        else:
            print(f"Pagina vacia.")

    def addLinea(self,texto):
        """
        Add a line of text to the paper.

        :param texto: The text to add to the paper.
        :type texto: str

        :return: None
        """
        self.papel.append(texto)