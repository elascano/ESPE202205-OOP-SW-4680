class Persona
	def initialize()
	end

	def metodo1()
		puts "Escriba datos a guardar: "
		File.open('archivo.csv','w') do |text|
			text.puts gets
		end
	end 

	def lectura()
		File.open('archivo.csv','r') do |text|
			while linea = texto.gets()
				puts linea
			end
		end
	end
end


p = Persona.new
p.metodo1()


