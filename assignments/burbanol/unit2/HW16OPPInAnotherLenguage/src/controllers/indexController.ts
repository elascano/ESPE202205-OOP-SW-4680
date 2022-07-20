import {Request, Response} from 'express';

class IndexController {

    public index(req: Request, res: Response) {
        res.render('cars/index', {title:'Welcomo to Cars App'});
    }
}


export const indexController = new IndexController();

