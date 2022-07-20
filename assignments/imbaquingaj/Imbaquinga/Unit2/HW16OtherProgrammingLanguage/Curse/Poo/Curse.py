class Curse():

    #Initial state of the object
    def __init__(self,nam,credit,profesio):
        self.name = nam
        self.credits = credit
        self.profesion = profesio

    #Getters
    def get_name(self):
        return self.name
    def get_credits(self):
        return self.credits
    def get_profesion(self):
        return self.profesion
    #Setters
    def set_Name(self, name):
        self.name=name
    def set_Credits(self, credits):
        self.credits=credits
    def set_Profesion(self, profesion):
        self.profesion=profesion

curse1 = Curse("Oop",12,"Software Engineering")
print(curse1.get_name(),curse1.get_credits(),curse1.get_profesion())
curse1.set_Name("vector calculus")
curse1.set_Profesion("Civil Enginering")
curse1.set_Credits(9)
print(curse1.get_name(),curse1.get_credits(),curse1.get_profesion())






