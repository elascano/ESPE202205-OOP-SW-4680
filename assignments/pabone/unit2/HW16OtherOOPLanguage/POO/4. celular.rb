class Celular

	def initialize(marca,color)
		@marca = marca
		@color = color 
	end

	def llamar()
		puts @marca + "-" + @color + " esta llamando ..."
	end

	def marca
		return @marca
	end

	def marca=(marca)
		@marca = marca
	end
end

