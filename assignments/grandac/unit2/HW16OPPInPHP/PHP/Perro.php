<?php
    class Dog
    {
        private $_name;
        private $_hambre;
        private $_breed;

        function _construct($breed)
        {
            $this->_breed = $breed;
        }
        
        private function digest($food)
        {
            $this->_hunger = FALSE;
        }

        public function eat($food)
        {
            digest($food);
        }

        public function setName($name)
        {
            $this->_name = $name;
        }

        public function getName()
        {
            return $this->_name;
        }

        public function setBreed($breed)
        {
            $this->_breed = $breed;
        }

        public function getBreed()
        {
            return $this->_breed;
        }
    }

    $dog = new Dog("Dalmata");
    $dog-> setName("Rocky");
    echo "the dog has been included " . $dog->getBreed() . "with name " . $dog->getName();
?>