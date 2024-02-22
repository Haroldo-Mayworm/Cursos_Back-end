module.exports.news = function (app, req, res) {
    var connection = app.config.DBConnection();
    var newsModel = new app.app.models.NewsDAO(connection);

    newsModel.getNews(function (error, result) {
        if (error) {
            console.error('Error executing query:', error);
            res.status(500).send('Internal Server Error');
            return;
        }
        res.render('news/news', { newsList: result });
    });
};

module.exports.news_details = function (app, req, res) {
    var connection = app.config.DBConnection();
    var newsModel = new app.app.models.NewsDAO(connection);

    newsModel.getNewsDetails(function (error, result) {
        if (error) {
            console.error('Error executing query:', error);
            res.status(500).send('Internal Server Error');
            return;
        }
        res.render('news/news_01', { newsList: result });
    });
};
