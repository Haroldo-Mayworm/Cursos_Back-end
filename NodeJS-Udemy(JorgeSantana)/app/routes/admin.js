module.exports = function (app) {
    app.get('/form', function (req, res) {
        app.app.controllers.admin.form(app, req, res);
    });
    app.post('/news/save', function (req, res) {
        app.app.controllers.admin.news_save(app, req, res)
    });
};
