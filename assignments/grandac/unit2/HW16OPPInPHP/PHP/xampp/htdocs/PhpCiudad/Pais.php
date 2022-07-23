<?php

class Pais {
    public $nombrePais;
    public $presidente;

    public function __constructor($nombrePais, $presidente){
        $this->nombrePais = $nombrePais;
        $this->presidente = $presidente;
    }
}
