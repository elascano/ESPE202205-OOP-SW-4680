#!C:\Strawberry\perl\bin.exe

# Creacion de clase y uso de paquete: colección de variables y de funciones que acceden a esas variables

use strict; 
use warnings;
   

package espe.edu.ec.PerlCodePlant.model;
#constructor
sub poly_example #polimosfismo
{
	#aplicamos metodo
    my $class_name = shift; 
    my $self = { 
				'PlantType' => shift,
                'PlantSpecies' => shift,
				'PlantColor' => shift
				 
               }; 
			   
	# Using bless function 
    bless $self, $class_name; 
	# retornamos el objeto al constructor
	return $self; }
sub get_plant {
	my $self = shift; 
    print "\n";
	print"\n" ."WELCOME TO PLANT SECTION"."\n";
	print "\n";
    print "Plant Type is: $self->{'PlantType'}\n"; 
    print "Plant Species is: $self->{'PlantSpecies'}\n"; 
    print "Plant Color is: $self->{'PlantColor'}\n"; 
}
	
	# Creacion de objeto y llamada
	my $plantObject = espe.edu.ec.PerlCodePlant.model->poly_example("Terrestrial", "Ferns", "Red");
	$plantObject->get_plant();

package espe.edu.ec.PerlCodeClient.model;
sub poly_example{ #polimosfismo
	my $class_name = shift; 
    my $self = { 
				'Name' => shift,
                'Age' => shift,
				'Address' => shift
	};
	bless $self, $class_name; 
	return $self; }
	
sub get_client{
	my $self = shift; 
	print "\n";
	print"\n" ."WELCOME TO CLIENT SECTION"."\n";
	print "\n";
    print "Name Client: $self->{'Name'}\n"; 
    print "Age Client: $self->{'Age'}\n"; 
    print "Address Client: $self->{'Address'}"; 
}
	
	my $clientObject = espe.edu.ec.PerlCodeClient.model->poly_example("Daniela", 20, "Conocoto");
	$clientObject->get_client();
	
	
#La encapsulación se puede lograr al: 
#Declarar todas las variables de la clase 
#como locales y obtener métodos de la clase mediante la importación de paquetes 
#para establecer y obtener los valores de las variables.

	
