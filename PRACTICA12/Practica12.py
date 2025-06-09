# ----------------------------
# 1. PATRÓN CREACIONAL: Singleton
# ----------------------------
class Configuracion:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia.modo = "Producción"
        return cls._instancia

    def setModo(self, modo):
        self.modo = modo

    def getModo(self):
        return self.modo


# ----------------------------
# 2. PATRÓN ESTRUCTURAL: Adapter
# ----------------------------
class MedicamentoAntiguo:
    def obtener_precio(self):
        return 20.0  # Ejemplo de precio fijo

class AdaptadorMedicamento:
    def __init__(self, antiguo):
        self.antiguo = antiguo

    def get_precio(self):
        return self.antiguo.obtener_precio()


# ----------------------------
# 3. PATRÓN DE COMPORTAMIENTO: Strategy
# ----------------------------
class DescuentoNormal:
    def aplicar(self, precio):
        return precio

class DescuentoVIP:
    def aplicar(self, precio):
        return precio * 0.8

class Cliente:
    def __init__(self, nombre, estrategia):
        self.nombre = nombre
        self.estrategia = estrategia

    def pagar(self, precio):
        return self.estrategia.aplicar(precio)



if __name__ == "__main__":
    # Singleton
    conf = Configuracion()
    conf.setModo("Desarrollo")
    print("Modo del sistema:", conf.getModo())

    # Adapter
    med_antiguo = MedicamentoAntiguo()
    medicamento = AdaptadorMedicamento(med_antiguo)
    print("Precio del medicamento:", medicamento.get_precio())

    # Strategy
    cliente1 = Cliente("Juan", DescuentoNormal())
    cliente2 = Cliente("Ana", DescuentoVIP())

    print(f"{cliente1.nombre} paga: {cliente1.pagar(medicamento.get_precio())}")
    print(f"{cliente2.nombre} paga: {cliente2.pagar(medicamento.get_precio())}")

