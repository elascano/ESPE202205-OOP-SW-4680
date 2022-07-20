  package Persona;
  use strict; #Nos ponemos serios


  ######################################################################
  #Constructor de la clase
  #

  sub new {
     my $this=shift; #Cogemos la clase que somos o una referencia a la clase (si soy un objeto)
     my $class = ref($this) || $this; #Averiguo la clase a la que pertenezco

     my $self={}; #Inicializamos la tabla hash que contendrá las var. de instancia (NOMBRE Y EDAD)
     $self ->{NOMBRE} =undef ; #La clase Persona nace sin nombre  
     $self ->{EDAD}   =0 ;     #La clase Persona se construye con 0 años

     bless $self, $class; #Perl nos tiene que dar el visto bueno (bendecirla)
     return ($self); #Devolvemos la clase recién construida
  }
  
  ######################################################################
  #Métodos de acceso a los datos de la clase
  #

  #metodo para ver/cambiar el nombre
  sub nombre{
       my $self=shift; #El primer parámetro de un metodo es la  clase
 
       #Miramos si se le ha pasado algún parámetro, en cuyo caso será el nombre
       $self->{NOMBRE}=shift if (@_);

       #Devolvemos el nombre
       return $self->{NOMBRE};
  }

  #metodo para ver/cambiar la edad
  sub edad{
       my $self=shift; #El primer parámetro de un metodo es la  clase
 
       #Miramos si se le ha pasado algún parámetro, en cuyo caso será la edad
       $self->{EDAD}=shift if (@_);

       #Devolvemos el nombre
       return $self->{EDAD};
  }

  ######################################################################
  #Métodos de la clase
  #

  #metodo para cumplir años
  sub cumple{
       my $self=shift; #El primer parámetro de un metodo es la  clase
 
       #Incrementamos la edad
       $self->{EDAD}++;

       #Devolvemos el nombre
       return $self->{EDAD};
  }


  ######################################################################
  #Destructor
  #

  sub DESTROY {
        my $self=shift; #El primer parámetro de un metodo es la  clase
        delete ($self->{NOMBRE});  
        delete ($self->{EDAD});  
  }

  #Fin
  1;