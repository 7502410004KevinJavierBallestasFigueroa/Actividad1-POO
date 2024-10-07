class Cheff {
    constructor(nombre = "Kevin", apellido = "Ballestas", especialidad = "Ninguna", experiencia = 2) {
        this._nombre = nombre
        this._apellido = apellido
        this._especialidad = especialidad
        this._experiencia = experiencia
    }

    get nombre() {
        return this._nombre
    }

    set nombre(value) {
        this._nombre = value
    }

    get apellido() {
        return this._apellido
    }

    set apellido(value) {
        this._apellido = value
    }

    get especialidad() {
        return this._especialidad
    }

    set especialidad(value) {
        this._especialidad = value
    }

    get experiencia() {
        return this._experiencia
    }

    set experiencia(value) {
        this._experiencia = value
    }

    toString() {
        return `Cheff: ${this._nombre} ${this._apellido}, especialidad: ${this._especialidad}, experiencia: ${this._experiencia}`
    }
}

class Menu {
    constructor(nombre = "Inicial", platos = null, precio = 5000) {
        this._nombre = nombre
        this._platos = platos || ["Arroz", "Carne"]
        this._precio = precio
    }

    get nombre() {
        return this._nombre
    }

    set nombre(value) {
        this._nombre = value
    }

    get platos() {
        return this._platos
    }

    set platos(value) {
        this._platos = value
    }

    get precio() {
        return this._precio
    }

    set precio(value) {
        this._precio = value
    }

    toString() {
        return `Nombre del menú: ${this._nombre}, platos: ${this._platos.join(", ")}, precio: ${this._precio} Pesos`
    }
}

class Plato {
    constructor(nombreDelPlato = "Pasta bolognesa", descripcionDelPlato = "Pasta con carne") {
        this._nombreDelPlato = nombreDelPlato
        this._descripcionDelPlato = descripcionDelPlato
    }

    get nombreDelPlato() {
        return this._nombreDelPlato
    }

    set nombreDelPlato(value) {
        this._nombreDelPlato = value
    }

    get descripcionDelPlato() {
        return this._descripcionDelPlato
    }

    set descripcionDelPlato(value) {
        this._descripcionDelPlato = value
    }

    toString() {
        return `- ${this._nombreDelPlato}, descripción: ${this._descripcionDelPlato}`
    }
}

class Restaurante {
    constructor(nombre = "Dicarpio", tipoComida = "Italiana", ubicacion = "Crra 15 #8-13") {
        this._nombre = nombre
        this._tipoComida = tipoComida
        this._ubicacion = ubicacion
    }

    get nombre() {
        return this._nombre
    }

    set nombre(value) {
        this._nombre = value
    }

    get tipoComida() {
        return this._tipoComida
    }

    set tipoComida(value) {
        this._tipoComida = value
    }

    get ubicacion() {
        return this._ubicacion
    }

    set ubicacion(value) {
        this._ubicacion = value
    }

    toString() {
        return `Restaurante: ${this._nombre}, ubicado en: ${this._ubicacion}, con un estilo de comida: ${this._tipoComida}`
    }
}


const restaurante = new Restaurante("Enigma", "Mexicana", "Cll 38 #8-66 Cartagena de Indias");
const cheff = new Cheff("Alberto", "Arbelaez", "Comida mexicana", 42);
    
const plato1 = new Plato("Tacos al pastor", "Tortilla de maíz con carne y piña");
const plato2 = new Plato("Quesadillas", "Tortilla de maíz con queso por dentro");
const plato3 = new Plato("Enchiladas", "Tortilla de maíz con queso, carne y chile dentro");
    
const menuPrincipal = new Menu("Carta restaurante Enigma", [plato1.toString(), plato2.toString(), plato3.toString()], 95000);
    
console.log("Código estudiantil: 7502410004")
console.log("Nombre: Kevin Javier Ballestas Figueroa")
console.log("INFORMACIÓN DEL RESTAURANTE")
console.log(restaurante.toString())
console.log("IFORMACIÓN DEL CHEFF")
console.log(cheff.toString())
console.log("MENU PRINCIPAL")
console.log(menuPrincipal.toString())



