import Vehicle from "./Vehicle";
export interface FueldedVehicle extends Vehicle {

    fuelType: string;
    fuelCapacity: number;

}
