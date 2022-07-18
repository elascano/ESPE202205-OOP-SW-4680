puts "C A L C U L A D O R A"
puts  "AREA DEL TRIANGULO"
puts "\n Ingrese la base del triangulo:"
base= gets.chomp.to_i
puts "\n Ingrese la altura del triangulo:"
altura= gets.chomp.to_i

resultado= ((base * altura)/2)
puts "El resultado es: #{resultado}"