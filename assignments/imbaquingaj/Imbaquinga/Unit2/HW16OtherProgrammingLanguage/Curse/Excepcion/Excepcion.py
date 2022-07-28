class Excepcion():
    def division(dividing,divider):
        try:
            result=dividing/divider
            print(result)
        except ZeroDivisionError:
            print("Cannot be divided by zero")
    division(5,5)
    division(5,0)
    division(3,4)
    division(8,0)

    print("Hello Word")