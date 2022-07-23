<?php
class Person
{
    public $name;
    public $age;
    public $country;

    public function __construct($name, $age, $country)
    {
        $this->name = $name;
        $this->age = $age;
        $this->country = $country;
    }
}

class Student extends Person
{
    public $career;

    public function __construct($name, $age, $country, $career)
    {
        parent::__construct($name, $age, $country);
        $this->career = $career;
    }

    public function information(){
        return "The student $this->name of age $this->age study $this->career in the country $this->country";
    }
}

$student1 = new Student('Javier', 23, 'Mexico', 'Software');
echo $student1->information();
