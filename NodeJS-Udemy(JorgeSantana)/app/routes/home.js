module.exports = function (app) {
    app.get('/', function (req, res) {
        app.app.controllers.home.home_page(app, req, res);
    });
};
