import { FueldedVehicle } from "./FueldedVehicle";
import mongoose, { Schema, model } from 'mongoose';
export interface Car extends mongoose.Document {

    brand: string;
    model: string;
    year: number;
    color: string;
    price: number;
    passagerCapacity: number;
    fuelType: string;
    fuelCapacity: number;
}

const CarShema = new Schema({

    brand: String,
    model: String,
    year: Number,
    color: String,
    price: Number,
    passagerCapacity: Number,
    fuelType: String,
    fuelCapacity: Number,
});

export default model<Car>('Car', CarShema);