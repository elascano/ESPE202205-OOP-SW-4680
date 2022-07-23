<?php
class persona {
protected $lugar;
protected $nombre; 
protected $colores=array(); 

public function __construct($unNombre,$unlugar,$unoscolores) {
    $this->nombre=$unNombre; 
    $this->lugar=$unlugar; 
    $this->colores[]=$unoscolores; 

}
public function mostrar() {
    echo 'Me llamo  '. $this->nombre;
    echo ', soy  ' . $this->lugar;
    echo ' y mis colores favoritos son: ';
    echo "Azul";
}
}

$yo = new persona('Pepe','Madrid','Azul, Blanco,Verde,Rojo');
echo $yo->mostrar();
