module.exports = function (app) {
    app.get('/news/news1', function (req, res) {
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
    });
};
