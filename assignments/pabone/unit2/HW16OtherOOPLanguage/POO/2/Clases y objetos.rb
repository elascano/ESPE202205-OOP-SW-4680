class Video

	attr_accessor :minutes, :tittle

	def play
	end

	def pause
	end

	def stop
	end

end

#CREAR UN OBJETO EN UNA CLASE = INSTANCIA y lo guardamos en una variable (CLASE.new)

video_POO = Video.new

video_POO.tittle = "Objetos y Clases"

video_POO2 = Video.new

video_POO2.tittle = "Atributos"

puts video_POO.tittle

puts video_POO2.tittle