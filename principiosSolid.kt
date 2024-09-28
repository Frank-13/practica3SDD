

class factura(){
    fun calcularTotal(): string {
        return "este es el total"
    }
}

class ReporteFactura {
    fun generr (factura: factura): string{
        return *reporte de la factura*
    }
}
//open/clous principle = principio abierto/cerrado

open class Empleado(val nombre:string, val horasaTrabajadas: int, val precioHora:Double){
    open fun calcularSalario(): Double{
        return horasTrabajadas*precioHoras
    }
}

class emleadoConBono(nombre: string, horasaTrabajadas: int, precioHora:Double): empleado(nombre,horasaTrabajadas,precioHora){
    override fun calcularSalario():Double{
        return super.calcularSalario() + bono
    }
}

//principio de sutitucion liskov 

fun main(args: Array<string>){
    fun imprimirSalario(empleado: empleado){
        println("el salario de $(empleo.nombre)es de $(empelo.calcularSalario())")
    }
    val empleado = Empleado("Frank", 40,12,0, 70.0)
    imprimirSalario(empleado)
    imprimirSalario(empleadoConBono)
}
 //principio de segrgacion de interfces

interface trabajador {
    fun trabajar()
}

interface Asistente{
    fun asistir()
}

interface reportero{
    fun generarReporte()
}

class programador:trabajador{
    override fun trabajar(){
        println("el programador eta trabajando")
    }
}

class albanil: trabajador{
    override fun trabajar(){
        println("el albanil pega bloques")
    }
}

// peincipio de inversion de dependencias 
interface notificaciones {
    fun enviarNotificaciones(mensaje: string)
}
class servivioEmail:notificaciones{
    override fun enviarNotificacion(mensaje:string){
        println("Enviando Email: $mensaje")
    }
}

class Notificacion(val servivio:notificaciones){
    fun enviarUnaNotificacion(){
        servivio.enviarNotificacion("Notiicacion Importate")
    }
}

