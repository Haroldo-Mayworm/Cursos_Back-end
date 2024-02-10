module.exports = function (app) {
    app.get('/news', function (req, res) {
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
    });
};
