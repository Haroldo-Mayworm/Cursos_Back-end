var consign = require('consign');
var express = require('express');
var app = express();
var port = 3000;

app.set('view engine', 'ejs');
app.set('views', './app/views');

consign()
    .include('app/routes')
    .then('config/DBConnection.js')
    .into(app);

module.exports = { app, port };
