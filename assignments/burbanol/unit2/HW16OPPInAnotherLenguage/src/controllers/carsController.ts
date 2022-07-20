import { Request, Response } from 'express';
import CarModel, {Car} from '../models/Car';


class CarsController {

    public async index(req: Request, res: Response) {
        const cars:Car[] = await CarModel.find().lean();
        res.render('cars/index', { 
            title: 'Welcome a Cars',
            cars
        });
    }

    public  renderFormCar(req: Request, res: Response) {
        res.render('cars/add', {
            title: 'Add A Car'
        });
    }
    public async saveCar(req: Request, res: Response) {
     const {brand, model, year, color, price,passagerCapacity,fuelType, fuelCapacity} = req.body;
     const car:Car = new CarModel({brand, model, year, color, price,passagerCapacity,fuelType, fuelCapacity});
     
     await car.save();
     
     console.log(req.body);
     res.redirect('/cars');
     
    }



}

export const carsController = new CarsController();