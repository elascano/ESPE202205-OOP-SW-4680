class Persona
	def initialize()
	end

	def simulate_error()

		begin
			
			puts "Empezar el metodo"
			raise "ERROR SIMULADO"

		rescue
			puts "Manejando el error"

		end
	end
end

p = Persona.new
p.simulate_error
