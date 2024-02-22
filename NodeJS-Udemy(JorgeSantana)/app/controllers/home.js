module.exports.home_page = function (app, req, res) {
    var connection = app.config.DBConnection();
    var newsModel = new app.app.models.NewsDAO(connection);

    newsModel.getLastFiveNews(function (error, result) {
        res.render('home/index', {news : result});
    });
};
