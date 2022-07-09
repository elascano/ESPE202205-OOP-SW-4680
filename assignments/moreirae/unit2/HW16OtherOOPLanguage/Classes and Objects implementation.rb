class Employee
    def initialize
        @employeeId = 0
        @employeeName = ""
    end

    def setEmployeeId(empId)
        @employeeId = empId
    end

    def setEmployeeName(empName)
        @employeeName = empName
    end

    def getEmployeeId
        return @employeeId
    end

    def getEmployeeName
        return @employeeName
    end
end

employee1 = Employee.new
employee1.setEmployeeId(1)
employee1.setEmployeeName("Erick")
puts "El ID del trabajador es #{employee1.getEmployeeId()}"
puts "El nombre del trabajador es #{employee1.getEmployeeName()}"