module.exports = function (app) {
    app.get('/news', function (req, res) {
        var connection = app.config.DBConnection();

        connection.query('select * from news_list', function (error, result) {
            if (error) {
                console.error('Error executing query:', error);
                res.status(500).send('Internal Server Error');
                return;
            }
            res.render('news/news', { newsList: result });
        });
    });
};
