var { app, port } = require('./config/server');

var routeHome = require('./app/routes/home')(app);

var routeForm = require('./app/routes/form')(app);

var routeNews = require('./app/routes/news')(app);

app.listen(port, function () {
    console.log(`Server on - Port ${3000}`);
});
