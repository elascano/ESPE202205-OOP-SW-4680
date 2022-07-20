const mongoose = require('mongoose');

const { mongodb } = require('./keys');

mongoose.connect(mongodb.URI, {
    useNewUrlParser: true
})
    