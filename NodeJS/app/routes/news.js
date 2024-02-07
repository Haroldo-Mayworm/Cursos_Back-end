var DBConnection = require('../../config/DBConnection');

module.exports = function (app) {
    var connection = DBConnection();

    app.get('/news', function (req, res) {
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
