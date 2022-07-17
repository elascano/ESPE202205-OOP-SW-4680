#Class Vehicle
class Vehicle
#attributes
def initialize(color, brand)
	@color = color
	@brand = brand
end

#methods 

def turnOn
	puts "El #{@brand} se ha encendido"
	end

def turnOff
	puts "El #{@brand} se ha apagado"
	end

	public :turnOn, :turnOff 


end

#Object #1

mercedes = Vehicle.new('azul', 'mercedes')
puts mercedes.turnOn
puts mercedes.turnOff