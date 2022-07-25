<?php


require_once './Pais.php';
class ciudad
{
    public $nombre;
    public $abreviatura;
    public $numeroHabitantes;
    public $pais;

    function __constructor($nombre, $abreviatura, $numeroHabitantes, $pais)
    {
        $this->nombre = $nombre;
        $this->abreviatura = $abreviatura;
        $this->numeroHabitantes = $numeroHabitantes;
        $this->pais = $pais;
    }
}

$pais = new Pais("Ecuador", "Guillermo Lasso");

$ciudad = new ciudad("Guayaquil", 'GYE', 2.698, $pais);
echo "Nombre de la ciudad es:" . $ciudad->nombre;
echo "Pais al que pertenece la ciudad: ".$ciudad->pais;
echo "Pais al que pertenece la ciudad: ".$ciudad->pais;
