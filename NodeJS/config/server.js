var express = require('express');
var app = express();
app.set('view engine', 'ejs');
app.set('views', './app/views');

var port = 3000;

module.exports = { app, port };
