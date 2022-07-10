class Tutor
	def initialize(name)
		@nombre = name    #@nombre = variable de instancia, propiedad del objeto
	end

	def say_my_name
		puts @nombre
	end
end

andres = Tutor.new("Andres") 
jose = Tutor.new("Jose") 

andres.say_my_name
jose.say_my_name

