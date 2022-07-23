<?php

    class Persona
    {
        public $nombre;
        public $edad;
        public $pais;

        public function __contruct($nombre, $edad, $pais)
        {
            $this->nombre = $nombre;
            $this->edad = $edad;
            $this->pais = $pais;
        }
    } 
