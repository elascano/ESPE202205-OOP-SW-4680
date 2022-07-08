class Video

	attr_accessor :minutes, :tittle

	def initialize(tittle) 
		self.tittle = tittle
		puts "I am the constructor"
	end

	def play
	end

	def pause
	end

	def stop
	end

end


video_POO = Video.new("Class and Object")

