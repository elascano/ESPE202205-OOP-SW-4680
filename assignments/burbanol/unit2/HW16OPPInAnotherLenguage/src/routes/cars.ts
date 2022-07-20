import {Router} from 'express';
const express = require("express");
const bodyParser = require("body-parser");
const router = express.Router();
import {carsController} from '../controllers/carsController';



class CarRoutes {
    public router:Router = Router();
    constructor() {
        this.config();
    }
    config(): void {
    this.router.get('/', carsController.index);
    
    this.router.get('/add', carsController.renderFormCar);
    
   this.router.post('/addCar', carsController.saveCar);
}

}


const carsRoutes = new CarRoutes();
export default carsRoutes.router;
