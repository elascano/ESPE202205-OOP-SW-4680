import {Router, Request} from 'express';
import {indexController} from '../controllers/indexController';

const router:Router = Router();

router.get('/', indexController.index);


export default router;