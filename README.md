# TiendaTecnologica

Análisis de la problematica:

Existen 8 clases que en el UML estan dentro del package "modelo", las cuales son:

TiendaTecnologica: Es la clase que tiene la mayoría de metodos, en esta clase se pueden agregar Clientes, agregar Dispositivos como también se pueden buscar Dispositivos ya sea por marca, modelo u tipo.
Esta clase tiene relación de composición con Dispositivos ya que si no existen dispositivos para vender la tienda no existiría, y tiene relación de agregación con los clientes.

Clientes:Esta clase tiene atributos: nombre, apellido, correo, nContacto, estado civil y ciudad. 

Compra: Tiene relación de composición con la clase cliente, ya que si no existe un Cliente no se podría comprar un dispositivo. También tiene composición con Dispositivo, porque de la misma manera, si no existe un dispositivo no se puede efectuar la compra.


Dispositivos: Tiene relación de composición con Tienda Tecnologica, puesto que los dispositivos se venden y esa clase.
Tiene relación de composición con Compra debido a que si no hay dispositivo no existe una compra.
Tiene relación de herencia con PC, notebooks y tablets.
Dispositivo es una clase abstracta.

PC: hereda de dispositivos y tiene atributos propios como tarjeta de video, fuente poder, chasis y además asocia una clase pantalla.

Notebooks:hereda de dispositivos y tiene atributos propios como resolución de pantalla, tipo de teclado y bateria medida en mAh.

Tablets:hereda de dispositivos y tiene atributos propios como resolución de pantalla y una lista de accesorios incorporados.

Todos los metodos heredados tienen el metodo getTipo que es un metodo abstracto.

Pantalla: clase que aparece para asociarle una pantalla a la clase PC.


