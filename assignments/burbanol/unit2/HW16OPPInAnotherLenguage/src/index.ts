import express from 'express';	
import {engine} from 'express-handlebars';
import path from 'path';
const bodyParser = require("body-parser");

//import routers
import IndexRouter from './routes/index';
import CarsRoutes from './routes/cars';

//initializations
const app = express();
require('./database');
// settings
app.set('port', process.env.PORT || 4000);
app.set('views', path.join(__dirname, 'views'));
app.engine('.hbs', engine({
    extname: '.hbs',
    defaultLayout: 'main',
    layoutsDir: path.join(app.get('views'), 'layouts'),
    partialsDir: path.join(app.get('views'), 'partials'),
    helpers: require('./lib/helpers')
}));
app.set('view engine', '.hbs');
//middlewares
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));

//routes
app.use(IndexRouter);
app.use('/cars', CarsRoutes);
//static files
app.use(express.static(path.join(__dirname, 'public')));
//starting the server
app.listen(app.get('port'), () => {
    console.log(`Server on port` ,app.get('port'));
});