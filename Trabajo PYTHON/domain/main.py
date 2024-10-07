from objets import (Cheff, Restaurante, Menu, Plato)

def main():
    restaurante = Restaurante("Enigma", "Mexicana", "Cll 38 #8-66 Cartagena de indias")

    cheff = Cheff("Alberto", "Arbelaez", "Comida mexicana", 42)

  
    plato1 = Plato("Tacos al pastor", "Tortilla de maíz con carne y piña")
    plato2 = Plato("Quesadillas", "Tortilla de maíz con queso por dentro")
    plato3 = Plato("Enchiladas", "Tortilla de maíz con queso, carne y chile dentro")
 

    menu_principal = Menu("Carta restaurante Enigma", [plato1, plato2, plato3], 95000)

    print("Código estudiantil: 7502410004")
    print("Nombre: Kevin Javier Ballestas Figueroa")
    print("*************************************************************")
    print(restaurante)
    print("-------------------------------------------------------------")
    print(cheff)
    print("-------------------------------------------------------------")
    print(menu_principal)
    print("-------------------------------------------------------------")

if __name__ == "__main__":
    main()
