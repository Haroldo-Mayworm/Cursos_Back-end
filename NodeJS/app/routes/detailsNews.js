module.exports = function (app) {
    app.get('/news/news1', function (req, res) {
        var connection = app.config.DBConnection();

        connection.query('select * from news_list where id = 1', function (error, result) {
            if (error) {
                console.error('Error executing query:', error);
                res.status(500).send('Internal Server Error');
                return;
            }
            res.render('news/news_01', { newsList: result });
        });
    });
};
