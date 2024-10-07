#################################### CLASE CHEFF ####################################
class Cheff:

    def __init__(self, nombre="Kevin", apellido="Ballestas", especialidad="Ninguna", experiencia=2):
        self.nombre = nombre
        self.apellido = apellido
        self.especialidad = especialidad
        self.experiencia = experiencia

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_apellido(self):
        return self.apellido

    def set_apellido(self, apellido):
        self.apellido = apellido

    def get_especialidad(self):
        return self.especialidad

    def set_especialidad(self, especialidad):
        self.especialidad = especialidad

    def get_experiencia(self):
        return self.experiencia

    def set_experiencia(self, experiencia):
        self.experiencia = experiencia

    def __str__(self):
        return f"Cheff: {self.nombre} {self.apellido}, especialidad: {self.especialidad}, experiencia: {self.experiencia}"

####################################  CLASE MENU  ####################################

class Menu:

    def __init__(self, nombre="Inicial", platos=["Arroz", "Carne"], precio=5000):

        self.nombre = nombre
        self.platos = platos if platos is not ["Arroz", "Carne"] else []
        self.precio = precio

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_platos(self):
        return self.platos

    def set_platos(self, platos):
        self.platos = platos

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio

    def __str__(self):
        platos_str = ", ".join(str(plato) for plato in self.platos)
        return f"Nombre del menú: {self.nombre}, platos: {platos_str}, precio: {self.precio} Pesos"

#################################### CLASE PLATO ####################################

class Plato:

    
    def __init__(self, nombre_del_plato="Pasta bolognesa", descripcion_del_plato="Pasta con carne"):
        self.nombre_del_plato = nombre_del_plato
        self.descripcion_del_plato = descripcion_del_plato

    def get_nombre_del_plato(self):
        return self.nombre_del_plato

    def set_nombre_del_plato(self, nombre_del_plato):
        self.nombre_del_plato = nombre_del_plato

    def get_descripcion_del_plato(self):
        return self.descripcion_del_plato

    def set_descripcion_del_plato(self, descripcion_del_plato):
        self.descripcion_del_plato = descripcion_del_plato

    def __str__(self):
        return f"- {self.nombre_del_plato}, descripción: {self.descripcion_del_plato}"

#################################### CLASE RESTAURANTE ####################################

class Restaurante:
    def __init__(self, nombre="Dicarpio", tipo_comida="Italiana", ubicacion="Crra 15 #8-13"):
        self.nombre = nombre
        self.tipo_comida = tipo_comida
        self.ubicacion = ubicacion

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_tipo_comida(self):
        return self.tipo_comida

    def set_tipo_comida(self, tipo_comida):
        self.tipo_comida = tipo_comida

    def get_ubicacion(self):
        return self.ubicacion

    def set_ubicacion(self, ubicacion):
        self.ubicacion = ubicacion

    def __str__(self):
        return f"Restaurante: {self.nombre}, ubicado en: {self.ubicacion}, con un estilo de comida: {self.tipo_comida}"
      