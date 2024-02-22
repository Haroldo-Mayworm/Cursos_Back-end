module.exports = function (app) {
    app.get('/news', function (req, res) {
        app.app.controllers.news.news(app, req, res);
    });

    app.get('/news1', function (req, res) {
        app.app.controllers.news.news_details(app, req, res);
    });
};
