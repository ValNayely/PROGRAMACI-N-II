class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo[Centro: {self.centro}, Radio: {self.radio}]"

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")