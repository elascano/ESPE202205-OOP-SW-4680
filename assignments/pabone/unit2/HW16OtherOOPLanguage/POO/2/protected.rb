class Food
  def initialize(name)
    @name = name
  end
  def ==(other)
    name == other.name
  end
  protected
  attr_reader :name
end
food = Food.new("chocolate")
puts food == food