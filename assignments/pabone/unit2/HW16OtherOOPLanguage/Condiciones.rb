puts "Ingrese un numero"
num1 = gets.chomp.to_i
puts "Ingrese otro numero"
num2 = gets.chomp.to_i

if num1 > num2 && num2 < num1
	puts "El numero #{num1} es MAYOR que el numero #{num2}"
else
	puts "El numero #{num1} es MENOR que el numero #{num2}."
end