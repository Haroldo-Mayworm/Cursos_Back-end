var consign = require('consign');
var bodyParser = require('body-parser');
var express = require('express');
var app = express();
var port = 3000;

app.set('view engine', 'ejs');
app.set('views', './app/views');

app.use(bodyParser.urlencoded({extended: true}));

consign()
    .include('app/routes')
    .then('app/models')
    .then('app/controllers')
    .then('config/DBConnection.js')
    .into(app);

module.exports = { app, port };
