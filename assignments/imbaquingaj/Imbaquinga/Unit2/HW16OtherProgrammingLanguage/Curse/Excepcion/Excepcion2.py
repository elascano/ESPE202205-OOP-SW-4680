class Excepcion2():
    fruits = ["0 -Banana","1-Apple","2-Grapefruit","3-peach"]
    def chooseFruit(chooseFruit):
        try:
            print(chooseFruit)
            index=int(input("Choose a fruit(put the number)"))
            print(f"Tu fruta favorita es {chooseFruit[index]}")
        except IndexError:
            print(f"Wrong index, must be between 0 and {len(chooseFruit)-1}")
        except ValueError:
            print("You have to put an integer")

    chooseFruit(fruits)
    chooseFruit(fruits)
    chooseFruit(fruits)